package stringtest;
import java.util.Scanner;

public class stringtest {

	public static void main(String[] args) {
		
		String s2;
		String letter = "Dear <name>, Thank a lot";
		String words= "Hellow  the rock   world";
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter string here (caps letter:)");
		s2=s1.nextLine();
		//System.out.println("String :" + s2.toLowerCase());
		System.out.println("String Replace:" + s2.replace(" ", "_"));
		System.out.println("String :" + letter.replace("<name>","sam"));
		System.out.println("String :" +  words.indexOf("  "));
		System.out.println("String :" +  words.indexOf("   "));
	}

}
