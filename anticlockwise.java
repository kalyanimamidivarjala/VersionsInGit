

import java.util.Scanner;

public class Anticlockwisepattern {
		public void  main (String args[]) {
		 int n, row, col, i, j, m, k, sp;
		 String s;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements you want");
		 
		 n = sc.nextInt();
		 System.out.println("Enter the String: ");
		 s = sc.next();
		 System.out.println("Enter the Starting Position: ");
		 sp = sc.nextInt();
		
		 row = n / 2 + 1;
		 col = n / 2 - 1;
		 m = 0;
		 while (sp > 1) {
		 m++;
		 sp--;
		 }
		 k = m - 1;
		 for (i = 1; i <= row / 2 + 1; i++) {
		 for (j = i; j < row / 2; j++)
		 System.out.print(" ");
		 for (j = 1; j <= 2 * i - 1; j++) {
		 if (j == 1) {
		 if (m < s.length())
		 System.out.print(s.charAt(m) + " ");
		 else
		 System.out.print("*" + " ");
		 m++;
		 } else if (j == col || j == 2 * i - 1) {
		 if (k >=0)
		 System.out.print(s.charAt(k) + " ");
		 else
		 System.out.print("*" + " ");
		 k--;
		 } else
		 System.out.print(" ");
		 if (j == col)
		 break;
		 }
		 System.out.println();
		 }
		
		 for (i = row + 1 - i; i >= 1; i--) {
			 for (j = i; j < row / 2; j++)
			  System.out.print(" ");
			  for (j = 1; j <= 2 * i - 1; j++) {
			  if (j == 1) {
			  if (m < s.length())
			  System.out.print(s.charAt(m) + " ");
			  else
			  System.out.print("*" + " ");
			  m++;
			  } else if (j == col || j == 2 * i - 1) {
			  if (k >= 0)
			  System.out.print(s.charAt(k) + " ");
			  else
			  System.out.print("*" + " ");
			  k--;
			  } else
			  System.out.print(" ");
			  }
			  System.out.println();
		 }

	}

}
