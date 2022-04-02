package Chapter3.연산자.review;

public class Calculate1 {

	public static void main(String[] args) {
		byte num1 = 1;
		byte num2 = 2;
		//byte result = num1 + num2;       //에러발생
        short num3 = 1;
        short num4 = 2;
        //short result2 = num3 + num4 ;   //에러 발생
        short result3 = (short)(num3 + num4) ;   //강제 형변환
        
        
        
	}

}
