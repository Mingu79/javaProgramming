import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//첫번째, 두번째 정수를 입력받는다
		System.out.print("첫 번째 값 : ");
		int one = scan.nextInt();
		
		System.out.print("두 번째 값 : ");
		int two = scan.nextInt();
        
		int result = 0;
		
 		//기호를 입력받는다
		System.out.print("(+, -, *, /) 중 연산자를 선택해 주세요 : ");
		String sign = scan.next();
		
		boolean isZero=false;
		
	    if(sign.equals("+")) result=one+two;
	    else if(sign.equals("-")) result=one-two;
	    else if(sign.equals("*")) result=one*two;
	    else if(sign.equals("/")) {
	    	if(two==0) isZero=true;
	    	else result=one/two;
	    }
	    else if(sign.equals("%")) result=one%two;
	    
	    if(isZero==true) System.out.println("0으로 나눌 수 없습니다.");
	    System.out.println(one+sign+two+"의 결과는 "+result);
	}

}
