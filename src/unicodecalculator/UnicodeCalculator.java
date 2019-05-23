package unicodecalculator;
import java.util.Scanner;
import java.lang.Math;

public class UnicodeCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the first string:");
		String s1 = s.nextLine();
		System.out.println("Input the second string:");
		String s2 = s.nextLine();
		s.close();

		System.out.println("************************");

		var r1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			System.out.println(x+": "+(int)x);
			r1 += x;
		}
		
		System.out.println("************************");

		var r2 = 0;
		for (int i = 0; i < s2.length(); i++) {
			char x = s2.charAt(i);
			System.out.println(x+": "+(int)x);
			r2 += x;
		}
		
		System.out.println("************************");
		System.out.println("Absolute difference between strings: " + Math.abs(r2-r1));
	}
}
