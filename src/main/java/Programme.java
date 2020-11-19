import java.util.ArrayList;
import org.joda.time.DateTime;

public class Programme {
    String name;
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    DateTime startDate;
    DateTime endDate;

    public Programme(String programmeName, DateTime programmeStart, DateTime programmeEnd){
        name = programmeName;
        startDate = programmeStart;
        endDate = programmeEnd;
    }

    public void addModule(Module newModule){
        modules.add(newModule);
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public void printProgrammeDetails(){
        System.out.println("----------");
        System.out.println("Programme Details:");
        System.out.println("Programme Name is:" + name);
        System.out.println("Programme Start Date is:" + startDate);
        System.out.println("Programme End Date is:" + endDate);
        System.out.println("Programme has the following students registered:");
        for(Student student : students){
            System.out.println("\t" + student.name);
        }
        System.out.println("Programme contains the following modules:");
        for(Module module : modules){
            System.out.println("\t" + module.name);
        }
        System.out.println("----------");
    }
}
