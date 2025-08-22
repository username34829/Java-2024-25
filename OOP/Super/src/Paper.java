public class Paper extends WritingTool{

    String paper;
    String color;
    String size;

    Paper(String paper, String color, String size, String description){
        super(paper, description); //Passing an argument to parent class or super lass (WritingTool class)
        this.color = color;
        this.size = size;
    }

    void detailOfPaper(){
        System.out.println("Types of paper: " + this.paper);
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.size);
    }
}
