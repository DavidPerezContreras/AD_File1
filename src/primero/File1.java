package primero;

public class File1 {
	
	public static void main(String[] args) {
		crear();
	}
	
	
	public static void crear() {
		System.out.println(System.getProperty("os.name"));
		
		if(System.getProperty("os.name").equals("Windows 10")) {
			System.out.println("Estas en Windows chingadera");
		}else {
			System.out.println("Estas en Linux man");
		}
	}
}
