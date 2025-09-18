public class IntegerDataTypes {
	public static void main(String[] args) {
		byte z = 23; 
		/* "byte"
		Minimum: -128
		Maximum: 127
		Size: 1 bytes
		*/
		
		short x = 100;
		/* "short"
		Minimum: -32,768
		Maximum: 32,767
		Size: 2 bytes
		*/
		
		int c = 23_234_234;
		/* "integer"
		Minimum: -2,147,483,648
		Maximum: 2,147,483,647
		Size: 4 bytes
		*/
		
		long v = 103_929_826_927_927L;
		/* "long"
		Minimum: -9,223,372,036,854,775,808
		Maximum: -9,223,372,036,854,775,808
		Size: 8 bytes
		*/
		
		System.out.println(v);
	}
}