package model;

import java.util.ArrayList;

public class FacultyDirectory {
    ArrayList<Faculty> facultyList;


    public FacultyDirectory(){
        facultyList = new ArrayList<Faculty>();
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public void addFaculty(Faculty newFaculty){
        facultyList.add(newFaculty);
    }

    public void printListSize(){
        System.out.println("Faculty list has " + facultyList.size());
    }

    public void printAllMembers(){
        for (Faculty member : facultyList){
            System.out.print(facultyList.indexOf(member)+ ". ");
            member.printFacultyInformation();
        }
    }

    public Faculty findMemberByName(String name){
        if ((name == null) || (name == "")) return null;

        for (Faculty member : facultyList){
            if (member.getName() == name) {
                return member;
            }
        }
        // Code will run to this line only if there were no matches 
        // otherwise it would return a faculty member 
        return null;
    }

    public void findAndPrintMemberByName(String searchTerm){
        System.out.println(" -------------------   Search ------------------ ");

        Faculty searchResult = this.findMemberByName(searchTerm);
        if (searchResult == null) {
            System.out.println("Nothing was found for "+ searchTerm);
        } else {
            System.out.println("Faculty member was found for "+ searchTerm);
            searchResult.printFacultyInformation();
        }
    }

}
