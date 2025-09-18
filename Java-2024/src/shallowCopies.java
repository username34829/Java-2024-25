class ComicBookCharacter {
		String name;
		int age;
		String type;
}
		
public class Copies {
		public static void main(String[]	args) {
				
			ComicBookCharacter a = new ComicBookCharacter();
			a.name = "Calvin";
			a.age = 6;
			a.type = "human";
				
			ComicBookCharacter b = a;
			a.name = "Hobbes";
				
			System.out.println("Object a name: " + a.name);
			System.out.println("Object b name: " + b.name);
				
		}
}