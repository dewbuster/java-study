package days17;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] answer = solution("abc1Addfggg4556b", 6);
		System.out.println(Arrays.toString(answer));
		
	} // main
	
	public static String[] solution(String my_str, int n) {
        int length = (int) Math.ceil((double)my_str.length() / n);
        String[] answer = new String[length];
        
        int i;
        for (i = 0; i < length-1; i++) {
            answer[i] = my_str.substring(i*n, (i+1)*n);
		}
        answer[length-1] = my_str.substring(i*n);
        
        /*
        int beginIndex = 0, endIndex = n;
        int my_strLength = my_str.length();
        for (int i = 0; i < length; i++) {
        	beginIndex = i*n;
            endIndex = (i+1)*n;
            if( endIndex > my_strLength ) endIndex = my_strLength;
            answer[i] = my_str.substring(beginIndex, endIndex);
		}
        */
        return answer;
    }

} // class
