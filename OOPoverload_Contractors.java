public class Main {
	public static void main(String[] args) {
		User user = new User();
		User user1 = new User("Joshan");
		User user2 = new User("Shan", "luc251@gmail.com");
		User user3 = new User("Lucy", "lucy8283@gmail.com", 19);
		
		System.out.println(user.username);
		System.out.println(user.email);
		System.out.println(user.age);
		
		System.out.println(user1.username);
		System.out.println(user1.email);
		System.out.println(user1.age);
		
		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user2.age);
		
		System.out.println(user3.username);
		System.out.println(user3.email);
		System.out.println(user3.age);
	}
}
class User{
    
    String username;
    String email;
    int age;
    
    
    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
   }
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}