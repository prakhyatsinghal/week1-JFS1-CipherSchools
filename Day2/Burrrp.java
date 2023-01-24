import java.util.Scanner;

public class Burrrp {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("How Long is your Burp");
		int burpLength = scn.nextInt();
		
		String msg = "";
		
		for(int i=1;i<=burpLength;i++) {
			msg = msg+"r";
		}
		System.out.println("Bu"+msg+"p");

	}

}
