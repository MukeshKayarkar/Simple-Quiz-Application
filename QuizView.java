import java.util.Scanner;

public class QuizView {
    private Scanner scanner;

    // Constructor
    public QuizView() {
        this.scanner = new Scanner(System.in);
    }

    // Method to display a question and options
    public void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
    }

    // Method to get the user's answer
    public char getUserAnswer() {
        System.out.print("Enter your answer (A/B/C/D): ");
        return scanner.next().toUpperCase().charAt(0);
    }

    // Method to display feedback (correct/wrong)
    public void displayFeedback(boolean isCorrect, char correctAnswer) {
        if (isCorrect) {
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! The correct answer was: " + correctAnswer + "\n");
        }
    }

    // Method to display the final score
    public void displayFinalScore(int score, int totalQuestions) {
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/" + totalQuestions);
    }

    // Method to close the scanner
    public void closeScanner() {
        scanner.close();
    }
}
