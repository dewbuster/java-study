package weekend03;

public class Ex06 {

	public static void main(String[] args) {
		String myString = "programmer";
		String alp = "p";
		
		myString = myString.replace(alp, alp.toUpperCase());
		System.out.println(myString);
		
		/*
		String[] arr = myString.split("");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(alp)) arr[i] = arr[i].toUpperCase();
		}
		
		System.out.println(String.join("", arr));
		*/
	}

}
