public class Main {
    public static void main(String[] args) {
       Paper paper = new Paper("Cotton rag", "White",
                                "Long", "Paper made primarily from cotton fibers");
       Pen pen = new Pen("Fountain", "Black", "Fine",
               "A writing instrument that uses a metal nib to apply water-based ink to paper");
       Pencil pencil = new Pencil("Charcoal", 7,
               "A drawing tool made of compressed charcoal encased in a wooden or paper jacket");

       paper.showDescription();

       System.out.println("--");

       pen.showDescription();

       System.out.println("--");

       pencil.showDescription();

    }
}