import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        WritingTool writingTools;

        System.out.println("--------Your Cart-------");
        System.out.println("1. Paper");
        System.out.println("2. Pen");
        System.out.println("3. Pencil");
        System.out.print("Select a product in your cart you want to view in detail: ");
        int choice = scanner.nextInt(); //Runtime Polymorphism

        if(choice == 1 ){
            writingTools = new Paper("Cotton rag Paper", "Long", 1);
            System.out.println(writingTools);
        }
        else if(choice == 2){
            writingTools = new Pen("Fountain Pen", "Black", "Fine", 1);
            System.out.println(writingTools);
        }
        else if(choice == 3){
            writingTools = new Pencil("Charcoal Pencil", 7, 1);
            System.out.println(writingTools);
        }

    }
}