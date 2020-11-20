import java.util.ArrayList;

public class Student {
    String name;
    int age;
    String dob;
    String id;
    String username;
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<Programme> programmes = new ArrayList<>();

    public Student(String studentName, int studentAge, String studentDob, String studentId){
        name = studentName;
        age = studentAge;
        dob = studentDob;
        id = studentId;
        username = getUsername(studentName, studentAge);
    }

    public String getUsername(String studentName, int studentAge){

        return studentName.toLowerCase().replaceAll("\\s+","") + studentAge;
    }

    public void addModule(Module newModule){
        modules.add(newModule);
    }

    public void addProgramme(Programme newProgramme){
        programmes.add(newProgramme);
    }

    public void printStudentDetails(){
        System.out.println("----------");
        System.out.println("Student Profile:");
        System.out.println("Student Name is: " + name);
        System.out.println("Student ID is: " + id);
        System.out.println("Student Age is: " + age);
        System.out.println("Student DOB is: " + dob);
        System.out.println("Student Username is: " + username);
        System.out.println("Student is registered for the following modules:");
        for(Module module : modules){
            System.out.println("\t" + module.name);
        }
        System.out.println("Student is registered for the following programmes:");
        for(Programme programme : programmes){
            System.out.println("\t" + programme.name);
        }
        System.out.println("----------");
    }

}
