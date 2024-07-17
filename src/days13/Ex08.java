package days13;
/**
 * @author dewbuster
 * @date 2024. 7. 17.-오후 3:41:26
 * @subject [static 키워드] 클래스 변수(static 변수, 정적 변수, 공유(shared)변수) 
 * 						-> 메서드 영역에 올라감. 객체 생성안해도 만들어짐
 * @content Save 저축 클래스
 */
public class Ex08 {

	public static void main(String[] args) {

		/*
		Save[] sArr = new Save[5];
		sArr[0] = new Save("김선우", 1000, 0.03);
		sArr[1] = new Save("김인경", 10000, 0.03);
		sArr[2] = new Save("김재민", 5000, 0.03);
		sArr[3] = new Save("김준석", 15000, 0.03);
		sArr[4] = new Save("박준용", 1000, 0.03);
		*/
		// 클래스 변수 접근
		// 클래스명.클래스 변수
		
		Save.setRate(0.03);
		System.out.println(Save.getRate());

		Save[] sArr = {
						new Save("김선우", 1000),
						new Save("김인경", 10000),
						new Save("김재민", 5000),
						new Save("김준석", 15000),
						new Save("박준용", 1000)
					  };
		
		// sArr[2].setRate(0.07);
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
		
		
	} // main

} // class
