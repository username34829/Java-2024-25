public class WritingTool {

    Pencil pencil;
    Pen pen;
    Paper paper;

    WritingTool(Pencil pencil, Pen pen, Paper paper){
        this.pencil = pencil;
        this.pen = pen;
        this.paper = paper;
    }

    void displayInfo(){
        System.out.println("- Writing Tool -");
        this.pencil.displayInfo();
        this.pen.displayInfo();
        this.paper.displayInfo();
    }

    //Concrete method
    void useFor(){
        System.out.println("Use for Writing");
    }
}
