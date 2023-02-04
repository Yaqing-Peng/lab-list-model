package ui;

import java.util.ArrayList;

import model.Faculty;
import model.FacultyDirectory;

public class Main {
    public static void main(String[] args){
        

        // Faculty archil = new Faculty();

        // Faculty archil = new Faculty("Archil", "TA 5001", "Archil's smiling face");
        // archil.printFacultyInformation();
        // archil.setName("Archil's different name");
        // archil.setName("Archil another name");
        // archil.printFacultyInformation();
        
        
        // Faculty dean = new Faculty("Dean's name", "Dean", null);
        // dean.setPosition("President");
        // dean = new Faculty("Dean's name");

        // dean.printFacultyInformation();
        
        Faculty archil = new Faculty("Archil", "TA 5001", "Archil's smiling face");
        Faculty kal = new Faculty("Kal", "Professor 5001", "Kal's portrait");
        Faculty dean = new Faculty("Dean's name", "Dean", null);

        FacultyDirectory directory = new FacultyDirectory();

        directory.addFaculty(archil);
        directory.addFaculty(kal);
        directory.addFaculty(dean);

        directory.printAllMembers();


        directory.findAndPrintMemberByName("Kal");

    }
}
