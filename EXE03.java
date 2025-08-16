public class Main {
	public static void main(String[] args) {
		
		String name = "joshan";
		
		int length = name.length();
		char letter = name.charAt(0);
		int index = name.indexOf("o");
		int lastIndex = name.lastIndexOf("a");
		
		name = name.toUpperCase();
		name = name.toLowerCase();
		name = name.trim();
		name = name.replace("a", "o");
		
		boolean bolName = name.isEmpty();
		boolean ConName = name.contains(" ");
		
		String boss = "Mafia";
		
		boolean isEqual = boss.equalsIgnoreCase("mafia");
		
		
		
		System.out.println(name + " | " + bolName + " | " + ConName);
		System.out.println(isEqual);
		
		
		
		
		double num = 1.2834;
		double num2 = 2.3342;
		
		double sum = num * num2;
		
		System.out.printf("Answer: %.2f", sum);
		System.out.println();
		System.out.println("Anwer: " + sum);
	}
}