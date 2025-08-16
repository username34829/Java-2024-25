class ComicBookCharacter {
		String name;
		int age;
		String type;
		
		ComicBookCharacter(String n, int a, String t) {
		name = n;
		age = a;
		type = t;
		}
		
		ComicBookCharacter(ComicBookCharacter c) {
		name = c.name;
		age = c.age;
		type = c.type;
		}
	}	
public class Copies	{
    public static void main(String[] args) {
				
	    ComicBookCharacter a = new ComicBookCharacter("Calvin", 6, "Human");
				
		ComicBookCharacter b = new ComicBookCharacter(a);
		a.name = "Hobbes";
				
		System.out.println("Object a name: " + a.name);
		System.out.println("Object b name: " + b.name);
				
		}
}