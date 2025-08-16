public class Main {
	public static void main(String[] args) {
		int studentAnswer = 3;
        String feedback1 = "This answer is wrong because...";
        String feedback2 = "This answer is correct! You know this because...";
        String feedback3 = "This answer is wrong. While the first part is correct...";
        String feedback;

        int correctAnswer = 2;
        int wrongCorrectAnswer = 1;
        int points = 0;

        if (studentAnswer < correctAnswer) {
               feedback = feedback1; }
        else if (studentAnswer == correctAnswer) {
               feedback = feedback2; }
        else if (studentAnswer != correctAnswer || studentAnswer == wrongCorrectAnswer) {
               feedback = feedback3; }
        else {
               feedback = "Invalid answer choice"; }

        System.out.println(feedback);

	}
}