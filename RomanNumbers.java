package labpaper_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character, Integer> numbers=new LinkedHashMap<Character, Integer>();
		numbers.put('I', 1);
		numbers.put('V', 5);
		numbers.put('X', 10);
		numbers.put('L', 50);
		numbers.put('C', 100);
		numbers.put('D', 500);
		numbers.put('M', 1000);
		System.out.println("Enter the roman number");
		String rn=sc.next();
		int rev=0,pre=0;
		for (int i =rn.length()-1;  i>=0; i--) {
			int curr=numbers.get(rn.charAt(i));
					if (curr<pre) {
						rev=rev-curr;
						
					}
					else
						rev=rev+curr;
			pre=rev;
		}
		System.out.println(rev);
	
		}
	}
	
		

	



