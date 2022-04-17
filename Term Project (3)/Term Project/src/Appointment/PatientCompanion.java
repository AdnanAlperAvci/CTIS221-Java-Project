/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Appointment;

import java.util.Scanner;

/**
 *
 * @author cemayartepe
 */
public class PatientCompanion extends Patient {
    
    private String compName;
    private String relationship;

    public PatientCompanion() {
        super();
    }
    
    public void getInput(){
            Scanner in=new Scanner(System.in);
            super.getInput();
        System.out.println("\nEnter patient companion name: ");
        compName=in.next();
        
        System.out.println("\nEnter relationship type: ");
        relationship=in.next();
    }

    @Override
    public String toString() {
        return super.toString()+ "\nCompanion Name: " + compName + "\nRelationship: " + relationship;
    }
    
    
    
}
