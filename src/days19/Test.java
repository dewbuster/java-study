package days19;

import java.util.Arrays;

/**
 * @author dewbuster
 * @date 2024. 7. 25.-오후 12:46:21
 * @subject
 * @content
 */
public class Test {

	public static void main(String[] args) {
		
		 int numer1 = 9;
		 int denom1 = 2;
		 int numer2 = 1;
		 int denom2 = 3;
		 int[] answer = new int[2];
		 int denom =(denom1 * denom2); 
		 int i1 = (numer1 * denom2); 
		 int i2 = (numer2 * denom1);
		 
		 int numer = i1 + i2;
		 
		 int k = 2;
		 while (true) {
			 if(denom % k == 0 && numer % k == 0) {
				 denom /= k;
				 numer /= k;
			 } else {
				 break;
			 }
		 }
		 answer[0] = numer;
		 answer[1] = denom;
		 System.out.println(Arrays.toString(answer));
	} // main

} // class
