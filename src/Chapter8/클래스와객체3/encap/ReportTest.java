package Chapter8.클래스와객체3.encap;

public class ReportTest {

	public static void main(String[] args) {
		MakeReport report = new MakeReport();
		String bReport = report.getReport();

		System.out.println(bReport);
	}
	

}
