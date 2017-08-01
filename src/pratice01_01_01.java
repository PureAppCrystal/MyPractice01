import java.util.Scanner;

public class pratice01_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("input value : ");
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		
		if ( val%3 == 0 ) {
			System.out.print("3의 짝수입니다..");
		} else {
			System.out.print("3의 짝수가 아닙니다.");
		}
		
		scan.close();
	}

}
