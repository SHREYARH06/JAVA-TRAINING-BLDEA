package StringsPkg;

public class Program12 {

	public static void main(String[] args) {
		String str="RajaRamMohanRoy";
		System.out.print(str.length());
		System.out.print(str.toUpperCase());
		System.out.print(str.toLowerCase());
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(12));
		int a=10+str.charAt(1);
		System.out.print(a);
		System.out.println(str.indexOf('R'));
		System.out.println(str.indexOf('Z'));
		System.out.println(str.startsWith("Raja"));
		System.out.println(str.startsWith("Roja"));
		System.out.println(str.endsWith("Roy"));
		System.out.println(str.endsWith("Boy"));
		System.out.println(str.contains("Mohan"));
		System.out.println(str.contains("Rohan"));
		System.out.println(str.contains("mohan"));





	}

}
