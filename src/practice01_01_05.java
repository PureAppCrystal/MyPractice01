
public class practice01_01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "";
		int strLen = 0;
		
		for (int i =1; i<100; i++ ) {
			str = String.valueOf(i);
			strLen = str.length();
			
			if (  str.contains("3") || str.contains("6") || str.contains("9") ) {
				System.out.print(str+" ");
				
				for (int j=0; j<strLen; j++) {
					char sTemp = str.charAt(j);
					
					if ( (sTemp == '3') || (sTemp =='6') || (sTemp == '9') ) {
					//if ( sTemp in ['3','6','9']) {
						System.out.print("짝");
					}
				}
				
				System.out.println("");	
			}
		}
		
		
	}

}
