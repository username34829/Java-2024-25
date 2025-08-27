public class Main {
    public static void main(String[] args){
        Pencil pencil = new Pencil("Charcoal pencil", 7, 2);
        Pen pen = new Pen("Fountain pen", "Black", "Extra Fine", 1);
        Paper paper = new Paper("Cotton rag paper", "Long", 1);

        WritingTool writingTool = new WritingTool(pencil, pen, paper); //Aggregation

        writingTool.displayInfo();

    }
}