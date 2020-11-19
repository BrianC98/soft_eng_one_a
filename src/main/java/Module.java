import java.util.ArrayList;

public class Module {
    String name;
    String id;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Programme> programmes = new ArrayList<>();

    public Module(String moduleName, String moduleId){
        name = moduleName;
        id = moduleId;
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public void addProgramme(Programme newProgramme){
        programmes.add(newProgramme);
    }

    public void printModuleDetails(){
        System.out.println("----------");
        System.out.println("Module Details:");
        System.out.println("Module Name is:" + name);
        System.out.println("Module ID is:" + id);
        System.out.println("Module has the following students registered:");
        for(Student student : students){
            System.out.println("\t" + student.name);
        }
        System.out.println("Module is part of the following programmes:");
        for(Programme programme : programmes){
            System.out.println("\t" + programme.name);
        }
        System.out.println("----------");
    }
}
