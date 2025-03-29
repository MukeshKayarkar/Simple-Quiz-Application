import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is 5 + 3?"
        };

        String[][] options = {
            {"A. Paris", "B. London", "C. Rome", "D. Madrid"},
            {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
            {"A. 5", "B. 7", "C. 8", "D. 10"}
        };

        char[] answers = {'A', 'B', 'C'};
        int score = 0;

        System.out.println("Welcome to the Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
