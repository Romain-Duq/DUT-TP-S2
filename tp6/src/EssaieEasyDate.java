public class EssaieEasyDate {
	public static void main(String[] args) {
		EasyDate d1 = new EasyDate();
		System.out.println(d1.toString());
		d1 = new EasyDate(12, 2);
		System.out.println(d1.toString());
		d1 = new EasyDate(12, 2, 2014);
		System.out.println(d1.toString());
		d1 = new EasyDate("12/02/2014");
		System.out.println(d1.toString());
		d1 = new EasyDate("dsdsdsd");
		System.out.println(d1.toString());

	}
}
