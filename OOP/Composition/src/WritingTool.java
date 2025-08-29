public class WritingTool {

    Pencil pencil;
    Pen pen;
    Paper paper;

    WritingTool(String pencil, String pen, String paper){
        this.pencil = new Pencil(pencil);
        this.pen = new Pen(pen);
        this.paper = new Paper(paper);
    }

    void displayInfo(){
        System.out.println("We have object here! ");
        paper.displayInfo();
        pencil.displayInfo();
        pen.displayInfo();
    }

    //Concrete method
    void useFor(){
        System.out.println("Use for Writing");
    }
}
