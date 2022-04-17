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
public class AppointmentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AppointmentSys.addAppointment();
        System.out.println(AppointmentSys.displayAppointments());
        System.out.println("\nEnter appointment ID to be searched: ");
        int id;
        Scanner i=new Scanner(System.in);
        id=i.nextInt();
        System.out.println(AppointmentSys.searchAppointment(id));
        AppointmentSys.calculatePrice();
        System.out.println("\nEnter appointment ID to be removed: ");
        int rmvId;
        i.skip("\n");
        rmvId=i.nextInt();
        AppointmentSys.removeAppointment(id);
        System.out.println("\nAppointments after removed\n"+AppointmentSys.displayAppointments());
    }
    
}
