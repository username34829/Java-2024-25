public class Pencil extends WritingTool{

    String pencil;
    int size;

    Pencil(String pencil, int size){
        this.pencil = pencil;
        this.size = size;
    }

    void detailOfPencil(){
        System.out.println("Types of Pecil: " + this.pencil);
        System.out.printf("Size: %d inches\n", this.size);
    }
}
