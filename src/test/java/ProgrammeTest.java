import junit.framework.TestCase;
import org.joda.time.DateTime;

public class ProgrammeTest extends TestCase {

    public void testAddModule() {
        DateTime start = new DateTime(2020, 9, 1, 9, 0);
        DateTime end = new DateTime(2021, 5, 1, 9, 0);
        Programme programme = new Programme("Computer Science", start, end);

        Module module = new Module("Maths", "ma12345");
        programme.addModule(module);

        assertEquals("ma12345", programme.modules.get(0).id);
    }

    public void testAddStudent() {
        DateTime start = new DateTime(2020, 9, 1, 9, 0);
        DateTime end = new DateTime(2021, 5, 1, 9, 0);
        Programme programme = new Programme("Computer Science", start, end);

        Student student = new Student("John", 18, "01/01/2002", "123456789");
        programme.addStudent(student);

        assertEquals("John", programme.students.get(0).name);
    }
}