package days14;

public class Ex02 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document("Sample.txt");
		Document doc3 = new Document();
		Document doc4 = new Document();
		
		System.out.println("end");
		
	} // main

} // class

class Document {
	
	String fileName = "Noname";  // 명시적 초기화
	static int count = 1;
	
	public Document() {
		this( "Noname" + count++ );
	}
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf(" \"%s\" 문서가 생성되었습니다\n", fileName);
	}



	
}