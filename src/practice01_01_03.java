import java.util.Scanner;

public class practice01_01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("input value : ");
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int sum = 0;
		
		if ( val%2 == 0 ) {
			//¦��
			for ( int i=1; i<=val; i++ ) {
				if ( i % 2 == 0) {
					sum = sum + i;
				}	
			}
		} else {
			//Ȧ��
			for ( int i=1; i<=val; i++ ) {
				if ( i % 2 == 1) {
					sum = sum + i;
				}
			}
		}
		
		System.out.println("��� �� : "+sum);
		scan.close();
	}

}
