package Chapter16.제네릭.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();		//형변환 하지 않음.
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();		//형변환 하지 않음.
		System.out.println(plastic);

		
	}

}
