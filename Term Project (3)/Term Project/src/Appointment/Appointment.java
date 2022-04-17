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
public abstract class Appointment {
    protected static int appointment_id;
    protected int appointment_days_left;
    protected int appointment_doctor_id;

    public Appointment() {
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getAppointment_days_left() {
        return appointment_days_left;
    }

    public void setAppointment_days_left(int appointment_days_left) {
        this.appointment_days_left = appointment_days_left;
    }

    public int getAppointment_doctor_id() {
        return appointment_doctor_id;
    }

    public void setAppointment_doctor_id(int appointment_doctor_id) {
        this.appointment_doctor_id = appointment_doctor_id;
    }
    
    public void getInput(){
    Scanner input=new Scanner (System.in);
        System.out.println("\nEnter days left until appointment: ");
        appointment_days_left=input.nextInt();
        input.skip("\n");
        System.out.println("\nEnter doctor ID: ");
        appointment_doctor_id=input.nextInt();
        input.skip("\n");
        
    
    
    }
    public boolean findId(int appointment_id){
    if(this.appointment_id==appointment_id)
        return true;
    return false;
    }
    public abstract void delayAppointment();

    @Override
    public String toString() {
        return "\nAppointment ID: " + appointment_id + "\nDays left until appointment: " + appointment_days_left + "\nAppointment doctor ID: " + appointment_doctor_id ;
    }
    
    
}
