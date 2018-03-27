package math;

public class calc {
public static void main(String[] args) {
	
	for(int k = 0; k<1092;k++) {
		if(((5*k)-(10))%12 == 0 && ((3*k)-(1))%7 == 0 && ((2*k)-(3))%13 == 0 ) {
			System.out.println(k);
		}
		
	}
}
}
