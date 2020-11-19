import junit.framework.TestCase;
import org.joda.time.DateTime;

public class ModuleTest extends TestCase {

    public void testAddStudent() {
        Module module = new Module("Maths", "ma12345");

        Student student = new Student("John", 18, "01/01/2002", "123456789");
        module.addStudent(student);

        assertEquals("John", module.students.get(0).name);
    }

    public void testAddProgramme() {
        Module module = new Module("Maths", "ma12345");

        DateTime start = new DateTime(2020, 9, 1, 9, 0);
        DateTime end = new DateTime(2021, 5, 1, 9, 0);
        Programme programme = new Programme("Computer Science", start, end);
        module.addProgramme(programme);

        assertEquals("Computer Science", module.programmes.get(0).name);
    }
}