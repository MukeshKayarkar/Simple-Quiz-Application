import java.util.Scanner;

public class QuizController {
    private String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "What is 5 + 3?"
    };

    private String[][] options = {
        {"A. Paris", "B. London", "C. Rome", "D. Madrid"},
        {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
        {"A. 5", "B. 7", "C. 8", "D. 10"}
    };

    private char[] answers = {'A', 'B', 'C'};
    private int score;
    private Scanner scanner;

    // Constructor
    public QuizController() {
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    // Method to start the quiz
    public void startQuiz() {
        System.out.println("Welcome to the Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            askQuestion(i);
        }

        endQuiz();
    }

    // Method to ask a question
    private void askQuestion(int index) {
        System.out.println(questions[index]);
        for (String option : options[index]) {
            System.out.println(option);
        }

        System.out.print("Enter your answer (A/B/C/D): ");
        char userAnswer = scanner.next().toUpperCase().charAt(0);

        if (userAnswer == answers[index]) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer was: " + answers[index] + "\n");
        }
    }

    // Method to display the final result
    private void endQuiz() {
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }

    // Main method to run the quiz
    public static void main(String[] args) {
        QuizController quiz = new QuizController();
        quiz.startQuiz();
    }
}
