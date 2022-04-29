
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {

    @Test
    public void testCorrectness() {
        Question question = new Question("What is my name?", "Christine");
        question.setGivenAnswer("Christine");
        assertFalse(question.determineCorrectness());
    }
}