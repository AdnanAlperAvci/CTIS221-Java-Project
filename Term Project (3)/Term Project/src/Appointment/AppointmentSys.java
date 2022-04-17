/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appointment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AppointmentSys { 
    public static ArrayList<Appointment> list=new ArrayList();
     public static boolean checkId(int id){
    for (int i=0;i<list.size();i++){
        Appointment a =list.get(i);
        if(a.findId(id))
            return true;
    }
    return false;
    }
     
         public static void addAppointment(){
        Scanner s=new Scanner(System.in);
       Appointment app[]=new Appointment[3];
    int id;
    String choice,person;
        System.out.println("Do you want to enter an appointment?(y/n): ");
        choice=s.next();
    while(choice.equalsIgnoreCase("y")){
        System.out.println("\nEnter appointment id: ");
        id=s.nextInt();
        if(!checkId(id)){
            
            System.out.println("\nWho is accessing the system(d/p/n)?");
            person=s.next();
            if(person.equalsIgnoreCase("p")){
                Patient p= new PatientCompanion();
                p.setAppointment_id(id);
                p.getInput();
                p.delayAppointment();
               
                list.add(p);
                
            
            }
            else if(person.equalsIgnoreCase("d")){
            Doctor d= new Doctor();
                d.setAppointment_id(id);
                d.getInput();
                d.delayAppointment();
                list.add(d);
            
            }
            else if(person.equalsIgnoreCase("n")){
            Nurse n= new Nurse();
                n.setAppointment_id(id);
                n.getInput();
                n.delayAppointment();
                list.add(n);
            
            }
        }
        else
        System.out.println("\nAppointment already has been delayed");
        
        System.out.println("Do you want to enter an appointment?(y/n): ");
        choice=s.next();
        }
    
}
            public static String displayAppointments(){
    String out="";
    for(int i= 0;i<list.size();i++){
    out+="\n"+list.get(i);
    
    }
    return out;
    
    
    
    
    }
            
            public static String searchAppointment(int id){
                String srch="";
            for (int i=0;i<list.size();i++){
            Appointment b =list.get(i);
        if(b.findId(id)){
            srch+=list.get(i);
            return srch;
                    
            }
            }
            return "\nAppointment does not exist";
            
            }
            
            public static boolean removeAppointment(int id){
            for (int i=0;i<list.size();i++){
            Appointment c =list.get(i);
        if(c.findId(id)){
            list.remove(c);
            return true;
            }
            }
            return false;
            }
            
            public static void calculatePrice(){
                System.out.println("\n**Price Calculation**\n");
                Scanner sick=new Scanner(System.in);
                System.out.println("\nEnter sickness: ");
                //base service price is 200
                int price=200;
                String sickness;
                sickness=sick.next();
            
            if(sickness.equalsIgnoreCase("infection")){
              price+=1200;
                System.out.println("\nPrice to be payed is "+price);
            }
            else if(sickness.equalsIgnoreCase("injury")){
            price+=500;
                System.out.println("\nPrice to be payed is "+price);
            }
            else
                    System.out.println("\nBase price is "+price);
            }
            
            

}