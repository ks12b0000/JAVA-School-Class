package Chapter5.반복문.loop;

//********
//*******
//******
//*****
//****
//***
//**
//*

public class ForTriangle {

	public static void main(String[] args) {
//		String A = "*";
//		for(int i = 9;i >= 1;i-- ) {
//			System.out.println(A.repeat(i));
		int x =0;
		for(int i=0; i<8; i++) {
			for(int j=0; j < (8-x); j++) {
				System.out.print("*");
			}
			x++;
			System.out.println();
		}
		}
			

	}


