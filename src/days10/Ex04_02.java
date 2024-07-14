package days10;

public class Ex04_02 {

	public static void main(String[] args) {
		int index = 0;
		int[] m = new int[3];
		m[index++] = 10;
		m[index++] = 20;
		m[index++] = 30;
		if (m.length == index) {
			int[] temp = new int[m.length + 3];
			for (int i = 0; i < m.length; i++) {
				temp[i] = m[i];
			}
			m = temp; 
		}

	}

}
