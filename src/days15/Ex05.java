package days15;

/**
 * @author dewbuster
 * @date 2024. 7. 19.-오후 12:28:23
 * @subject [싱글톤(singleton)]
 * @content 
 */
public class Ex05 {
 
	public static void main(String[] args) {
		// The constructor BoardDAO() is not visible
		// BoardDAO dao = new BoardDAO();
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.insert();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.update();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.select();
	}

}

// DB 연결 + CRUD
// DAO == Data Access Object
class BoardDAO{
	
	private static BoardDAO boardDAO = null;
	
	private BoardDAO () {
		
	}
	
	public synchronized static BoardDAO getInstance() {
		if ( boardDAO == null ) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
	public void insert() {
		System.out.println("DB 입력");
	}
	public void select() {
		System.out.println("DB 선택");
	}
	public void update() {
		System.out.println("DB 수정");
	}
	public void delete() {
		System.out.println("DB 삭제");
	}

}
