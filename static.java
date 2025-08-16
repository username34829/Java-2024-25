public class Main {
	public static void main(String[] args) {
		Pencil pencil1 = new Pencil("Mongol");
		Pencil pencil2 = new Pencil("Mongol");
		Pencil pencil3 = new Pencil("Staedtler");
		Pencil pencil4 = new Pencil("Derwent");
		
		System.out.println(Pencil.numOfPencil);
		
		Pencil.printNumOfPencil();
	}
}

class Pencil {
    
    String brand;
    static int numOfPencil;
    
    Pencil(String brand){
        this.brand = brand;
        numOfPencil++;
    }
    
    static void printNumOfPencil(){
        System.out.println("You have " + numOfPencil + " Of Pencil");
    }
}