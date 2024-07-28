package weekend04;

public class Ex02 {

	public static void main(String[] args) {
		
		String[] id_pw = { "programmer01", "15789" };
		String[][] db = { 
							{ "programmer02", "111111" }, 
							{ "programmer00", "134" },
							{ "programmer01", "1145" }
						};
		
		System.out.println(solution(id_pw, db));

	}
	
	public static String solution(String[] id_pw, String[][] db) {
		for (int i = 0; i < db.length; i++) {
			if (id_pw[0].equals(db[i][0])) {
				if (id_pw[1].equals(db[i][1])){
					return "login";
				}
				return "wrong pw";
			} 
		}
        return "fail";
    }

}
