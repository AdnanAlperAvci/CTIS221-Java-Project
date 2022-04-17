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
public class Doctor extends Appointment {
    private int doctor_id;
    private String doctor_name;
    private String doctor_field;
    private boolean doctor_busy;

    public Doctor() {
    super();
    }
    public void getInput(){
    super.getInput();
    Scanner in=new Scanner(System.in);
        System.out.println("\nEnter doctor name: ");
        doctor_name=in.next();
        System.out.println("\nEnter doctor field: ");
        doctor_field=in.next();
        System.out.println("\nIs doctor busy?(true/false) ");
        doctor_busy=in.nextBoolean();
    
    }
    
    public void delayAppointment(){
        if(doctor_busy)
            super.appointment_days_left+=7;
    
        }

    @Override
    public String toString() {
        return super.toString()+ "\nDoctor ID: " + doctor_id + "\nDoctor Name: " + doctor_name + "\nDoctor Field: " + doctor_field ;
    }
    
}
