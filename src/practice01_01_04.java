import java.util.Scanner;

public class practice01_01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("input value : ");
		Scanner scan = new Scanner(System.in);
		
		String Str = scan.nextLine();
		int StrLen = Str.length();
		String result = "";
		
		for ( int i=0; i<StrLen; i++ ) {
			result = result + Str.charAt(i);
			System.out.println(result);
		}
		
		scan.close();
	}

}
