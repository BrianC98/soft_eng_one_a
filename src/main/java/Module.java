import java.util.ArrayList;

public class Module {
    String name;
    String id;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Programme> programmes = new ArrayList<Programme>();

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

}
