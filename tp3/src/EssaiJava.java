public class EssaiJava {
	public static void main(String[] args) {
		String tmp = "";
		for (int i = 0; i < args.length; i++) {
			tmp += args[i] + ",";
		}
		System.out.println(tmp);
		tmp = tmp.toLowerCase();
		System.out.println(tmp);
		System.out.println(tmp.length());

		tmp = "";
		for (int i = 0; i < args.length; i++) {
			if (args[i].contains(".")) {
				tmp += args[i] + ",";
			}
		}
		System.out.println(tmp);
		
		tmp = "";
		for (int i = 0; i < args.length; i++) {
			if (args[i].matches(".*[0-9].*")) {
				tmp += args[i] + ",";
			}
		}
		System.out.println(tmp);
	}
}
