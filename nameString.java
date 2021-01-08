package nameString;
//import java.util.Scanner;

public class nameString {

	public static void main(String[] args) {
		// Perform String operations
		
//		String s1="sam";
//		System.out.println(s1);
//        String s2 = new String("Hello Java");
//        System.out.println(s2);
//        float a,b;
//        System.out.println("Enter first value");
//        Scanner a1 = new Scanner(System.in);
//        a=a1.nextFloat();
//        System.out.println("Enter Second value");
//        Scanner a2 = new Scanner(System.in);
//        b=a2.nextFloat();
//        System.out.printf("\n Total result of %8.2f and %8.2f : ",a,b);
//        System.out.format("\n Total result of %8.2f and %8.2f : ",a,b);
//        
//        //take input from user
//        String userInput;
//        System.out.println("\n Enter string");
//        Scanner myString = new Scanner(System.in);
//        userInput = myString.nextLine();
//        System.out.print("\n String name :" + userInput);
        
        //calculate string length
        String sf1="GeeksforGeeks";
        String sf2="     hellosam      ";
        String sf3 ="tomandjerry";
        int value=sf1.length();
        System.out.print("\n String length :" + value);
        System.out.print("\n String lowercase :" + sf1.toUpperCase());
        System.out.print("\n String uppercase :" + sf1.toLowerCase());
        System.out.print("\n Trim string :" + sf2.trim());
        System.out.print("\n substring of string :" + sf3.substring(1,5));
        System.out.print("\n name replace :" + sf3.replace('j','g'));
        System.out.print("\n name replace with word :" + sf3.replace("tom","dog"));
        System.out.print("\n name startswith :" + sf3.startsWith("to"));
        System.out.print("\n name endswith :" + sf3.endsWith("ry"));
        System.out.print("\n character show :" + sf3.charAt(2));
        System.out.print("\n index position :" + sf3.indexOf('m'));
        System.out.print("\n index position with position :" + sf3.indexOf("and",3));
        System.out.print("\n last index position :" + sf3.lastIndexOf("an",5));
        System.out.print("\n check proper string :" + sf3.equals("tomandjerry"));
        System.out.print("\n case insensitive :" + sf3.equalsIgnoreCase("TomANDJERRY"));
	}

}
