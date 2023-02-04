package model;

public class Faculty {
    String name;
    String position;
    String image;
    String email;
    String phone;

    public Faculty(String name, String position, String image){ // this method is a constructor. It sets the initial name via provided argument
        this.name = name;
        this.position = position;

        if (image == null) { 
            this.image = "NU Flags";
        }
        else { 
            this.image = image;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public void printFacultyInformation(){
        System.out.println("Name: " + name + " | Position: " + position + " Image: " + image );
    }
}
