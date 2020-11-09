import java.util.ArrayList;

public class Student {
    String name;
    int age;
    String dob;
    String id;
    String username;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Programme> programmes = new ArrayList<Programme>();

    public Student(String studentName, int studentAge, String studentDob, String studentId){
        name = studentName;
        age = studentAge;
        dob = studentDob;
        id = studentId;
        username = getUsername(studentName, studentAge);
    }

    public String getUsername(String studentName, int studentAge){

        return studentName.toLowerCase() + studentAge;
    }

    public void addModule(Module newModule){
        modules.add(newModule);
    }

    public void addProgramme(Programme newProgramme){
        programmes.add(newProgramme);
    }
}
