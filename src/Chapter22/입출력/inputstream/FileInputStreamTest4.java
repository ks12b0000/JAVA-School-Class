package Chapter22.입출력.inputstream;

import java.io.FileInputStream;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				
				for(int k=0; k<i; k++) {				//읽은 만큼 출력
					System.out.print((char)bs[k]);
				}
				
				System.out.println();
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
