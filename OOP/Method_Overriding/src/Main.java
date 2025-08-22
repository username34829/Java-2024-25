public class Main {
    public static void main(String[] args){
        Paper paper = new Paper();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();

        paper.useFor();
        pen.useFor();
        pencil.useFor(); //method overriding (see pencil class)
    }
}