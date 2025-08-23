public class Main {
    public static void main(String[] args){
        Paper paper = new Paper("Cotton rag Paper", "Long");
        Pen pen = new Pen("Fountain Pen", "Black", "Fine");
        Pencil pencil = new Pencil("Charcoal Pencil", 7);

        System.out.println(paper);
        System.out.println(pen);
        System.out.println(pencil);
    }
}