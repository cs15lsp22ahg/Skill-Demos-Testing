public class Question {

    String question;
    String correctAnswer;
    String givenAnswer;
    boolean correctness;

    public Question() {
        question = null;
        correctAnswer = null;
        givenAnswer = null;
        correctness = false;
    }

    public Question(String question, String answer) {
        this();
        this.question = question;
        this.correctAnswer = answer;
    }

    public void setGivenAnswer(String answer) {
        givenAnswer = answer;
    }

    public boolean determineCorrectness() {
        correctness = false;
        if (givenAnswer == correctAnswer) {
            correctness = true;
        }
        return correctness;
    }
}