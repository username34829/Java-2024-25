public class Main {
    public static void main(String[] args) {
       Paper paper = new Paper("Cotton rag", "White", "Long");
       Pen pen = new Pen("Fountain", "Black", "Fine");
       Pencil pencil = new Pencil("Charcoal", 7);

       paper.detailOfPaper();
       pen.detailOfPen();
       pencil.detailOfPencil();

       System.out.println();
       System.out.print(paper.paper + " "); paper.useFor();  //Inherit by Writing tool class
        System.out.print(pen.pen + " "); paper.useFor();
        System.out.print(paper.paper + " "); paper.useFor();

    }
}