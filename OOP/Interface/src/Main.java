public class Main {
    public static void main(String[] args){
        Paper paper = new Paper("Cotton rag Paper", "Long", 5);
        Pen pen = new Pen("Fountain Pen", "Black", "Fine", 1);
        Pencil pencil = new Pencil("Charcoal Pencil", 7, 1);

        pencil.draw();

    }
}