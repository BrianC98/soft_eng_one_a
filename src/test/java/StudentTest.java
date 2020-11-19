import junit.framework.TestCase;
import org.joda.time.DateTime;

public class StudentTest extends TestCase {

    public void testGetUsername() {
        Student student = new Student("John", 18, "01/01/2002", "123456789");
        String username = student.getUsername(student.name, student.age);

        assertEquals("john18", username);
    }

    public void testAddModule() {
        Student student = new Student("John", 18, "01/01/2002", "123456789");

        Module module = new Module("Maths", "ma12345");
        student.addModule(module);

        assertEquals("ma12345", student.modules.get(0).id);
    }

    public void testAddProgramme() {
        Student student = new Student("John", 18, "01/01/2002", "123456789");

        DateTime start = new DateTime(2020, 9, 1, 9, 0);
        DateTime end = new DateTime(2021, 5, 1, 9, 0);
        Programme programme = new Programme("Computer Science", start, end);
        student.addProgramme(programme);

        assertEquals("Computer Science", student.programmes.get(0).name);
    }

}