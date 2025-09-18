public class Main {
	public static void main(String[] args) {
		
		byte device1 = 1;
		byte device2 = 0;
		byte device3 = 0;
		byte device4 = 1;
		
		byte[] device = {device1, device2, device3, device4};
		String[] device_str = {"Device 1", "Device 2", "Device 3", "Device 4"};
		int status = device1 | device2 | device3 | device4;
		
		if(status > 0 && status <= 1){
		    System.out.println("Devices are ON");
		    for(int i = 0; i < device.length; i++){
		        if(device[i] == 1){
		            System.out.println("The device on is: " + device_str[i]);
		        }
		    }
		}
		else if(status == 0){
		    System.out.println("All Devices are Off");
		}
		else{
		    System.out.println("Error..");
		}
		
	}
	static void checking(String input){
	    if(input != null ){
		    System.out.println(input.length());
		}
		else{
		    System.out.println("its null");
		}
	}
}