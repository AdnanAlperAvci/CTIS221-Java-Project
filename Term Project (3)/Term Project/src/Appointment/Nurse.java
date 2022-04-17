/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appointment;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Nurse extends Appointment implements NurseOffDays{
    private int nurse_id;
    private String nurse_name;
    private int nurse_experience;
    private int nurse_salary;
    private boolean nurse_busy;

    public Nurse() {
        super();
    }
    
    public void getInput(){
        super.getInput();
    Scanner n=new Scanner(System.in);
        System.out.println("\nNurse ID: ");
        nurse_id=n.nextInt();
        n.skip("\n");
        System.out.println("\nNurse name: ");
        nurse_name=n.next();
        System.out.println("\nNurse experience: ");
        nurse_experience=n.nextInt();
        n.skip("\n");
        System.out.println("\nNurse salary: ");
        nurse_salary=n.nextInt();
        n.skip("\n");
        System.out.println("Nurse busy?(true/false) ");
        nurse_busy=n.nextBoolean();
    
    
    }

    @Override
    public String toString() {
        return super.toString()+"\nNurse ID: " + nurse_id + "\nNurse Name: " + nurse_name + "\nNurse Experience: " + nurse_experience + "\nNurse Salary: " + nurse_salary+ calcDaysOff();
    }
    public void delayAppointment(){
    if(nurse_busy)
        super.appointment_days_left+=2;
    
    }
    
    @Override
    public String calcDaysOff(){
        int daysOff;
        daysOff=nurse_experience*10;
        return"\n"+daysOff+" off days left";
        
    
    }
}
