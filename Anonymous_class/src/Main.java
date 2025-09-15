public class Main {
    public static void main(String[] args){

        WritingTool writingTool1 = new WritingTool();

        //Anonymous class
        WritingTool writingTool2 = new WritingTool(){
            @Override
            void display(){
                System.out.println("We have microsoft word and google docs.");
            }
        };

        writingTool1.display();
        writingTool2.display();
    }
}