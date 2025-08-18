import java.util.Scanner;

public class QuizProg {
    public static void main(String[] args){

        String[] question = {"Is Human cruel?", "Is Money important in life?",
                            "Does Smoking is dangerous?", "Is learning important in life?",
                            "Is Coffee good?"};

        String[][] options = {{"A. Yes", "B. No", "C. I don't know"},
                                {"A. Yes", "B. No", "C. It depends"},
                                {"A. Yes", "B. No", "C. Maybe Government trying to trick us"},
                                {"A. Yes", "B. No", "C. NO... I don't want to learn"},
                                {"A. Yes", "B. No","C. We don't need coffee"}};

        char[] answer = {'A', 'B', 'C', 'C', 'A'};
        char guess;
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < question.length; i++){
            System.out.println(question[i]);

            for(String opt : options[i]){
                System.out.println(opt);
            }

            System.out.print("Enter your answer: ");
            guess = scanner.next().charAt(0);

            if(guess == answer[i]){
                System.out.println("---------");
                System.out.println("Correct!");
                System.out.println("---------");
                score++;
            }
            else{
                System.out.println("---------");
                System.out.println("Incorrect!");
                System.out.println("---------");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Your score is: " + score);
        System.out.println("---------------------------------");
        System.out.println("Thank you for using this program!");
    }
}
