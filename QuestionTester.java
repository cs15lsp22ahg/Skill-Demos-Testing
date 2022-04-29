import static org.junit.Assert.*;
import org.junit.*;

public class QuestionTester {
    @Test
    public void testCorrectness() {
        Question question = new Question("What is my name?", "Christine");
        question.setGivenAnswer("Christine");
        assertTrue(question.determineCorrectness());
    }
}