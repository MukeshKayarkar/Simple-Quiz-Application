public class QuizModel {
    private String question;
    private String[] options;
    private char correctAnswer;

    // Constructor
    public QuizModel(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getter for question
    public String getQuestion() {
        return question;
    }

    // Getter for options
    public String[] getOptions() {
        return options;
    }

    // Getter for correct answer
    public char getCorrectAnswer() {
        return correctAnswer;
    }
}
