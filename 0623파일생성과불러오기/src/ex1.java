import java.io.IOException;

public class ex1 {
	
	public static void main(String[] args) {
		
		// 키보드로 입력 받은 것이 인트로 변환하면 무엇일까?
		
		try {
			System.out.println("입력 해ㅐ.......");
			int i = System.in.read();
			// read > 문자를 순자열로 반환
			System.out.println(i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// A : 65, B : 66
		// 가 : 234, 갸 : 234, 걔 : 234 ...
		// 알파벳은 1바이트로 표현 가능
		// 한글을 인코딩에 따라 2 바이트 또는 3발이트로 표현
		// 제대로 저장 및 읽지 못한다.
		// 내가 보기에는 자음 하나만 1바이트를 차지하기때 문에 자음이 같으면 동일 한 값 출력
		
		
		
	}

}
