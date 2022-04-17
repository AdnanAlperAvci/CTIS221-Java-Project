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
public class Patient extends Appointment{
    private int patient_id;
    private String patient_name;
    private int patient_age;
    private String patient_sickness;
    private boolean patient_busy;
    
    public Patient() {
    super();
    }
    
    public void getInput(){
        super.getInput();
    Scanner p=new Scanner(System.in);
        System.out.println("\nPatient ID: ");
        patient_id=p.nextInt();
        p.skip("\n");
        System.out.println("\nPatient name: ");
        patient_name=p.next();
        System.out.println("\nPatient age: ");
        patient_age=p.nextInt();
        p.skip("\n");
        System.out.println("\nPatient sickness(infection/injury): ");
        patient_sickness=p.next();
        System.out.println("\nPatient busy?(true/false) ");
        patient_busy=p.nextBoolean();
            
    
    
    }

    @Override
    public String toString() {
        return super.toString() + "\nPatient ID: " + patient_id + "\nPatient Name: " + patient_name + "\nPatient Age: " + patient_age + "\nPatient Sickness: " + patient_sickness ;
        
    }
    public void delayAppointment(){
    if(patient_busy)
        super.appointment_days_left+=2;
    
    }
}
