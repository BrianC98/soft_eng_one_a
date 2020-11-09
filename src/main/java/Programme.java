import java.util.ArrayList;
import org.joda.time.DateTime;

public class Programme {
    String name;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
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

}
