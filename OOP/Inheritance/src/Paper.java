public class Paper extends WritingTool{

    String paper;
    String color;
    String size;

    Paper(String paper, String color, String size){
        this.paper = paper;
        this.color = color;
        this.size = size;
    }

    void detailOfPaper(){
        System.out.println("Types of paper: " + this.paper);
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.size);
    }
}
