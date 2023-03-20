import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("[사용자로부터 사칙연산자 +, -, *, / 값을 입력 받은 후 연산 수행 실시");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 값 : ");
		int one = scan.nextInt();
		
		System.out.print("두 번째 값 : ");
		int two = scan.nextInt();
        
		int result = 0;
		
		System.out.print("(+, -, *, /) 중 연산자를 선택해 주세요 : ");
		String sign = scan.next();
		
		boolean isZero=false;
	    
	    switch (sign) {
        case "+":  result=one+two;
                 break;
        case "-":  result=one+two;
        	break;
        case "*":  result=one*two;
        break;
        
        case "/":  
    	    	if(two==0) isZero=true;
    	    	else result=one/two;
        break;
        	case "%":  
        		result=one%two;
            break;
        
        }
	    	
	    
	    if(isZero==true) System.out.println("0으로 나눌 수 없습니다.");
	    System.out.println(one+sign+two+"의 결과는 "+result);
	}

}
