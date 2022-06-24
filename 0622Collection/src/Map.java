import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

// key 영단어, vlaue 한글단어 > 맵 생성
// 단어 맞추기 게임
public class Map {
	
	public static void main(String[] args) {
		// 맵
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		// 맵에 데이터 생성
		dictionary.put("apple", "사과");
		dictionary.put("banana", "바나나");
		dictionary.put("lemon", "레몬");
		
		// 전체 출력
		// System.out.println(dictionary);
		
		// 키로 값 추출 확인
		// System.out.println(dictionary.get("apple"));
		// System.out.println(dictionary.get("lemon"));
		
		
		
		// 랜덤 문제 출력
		Random rd = new Random();
		// int randomNum = rd.nextInt()*dictionary.size(); // ?
		int rdNum = rd.nextInt(dictionary.size());

//		// toArray는 Object를 받는다.
//		Object[] question = dictionary.keySet().toArray();
//		System.out.println("다음 영단어의 뜻을 맞추시오. " + question[rdNum]);
		
		
		// ----------------------------------- 수업 ---------------------------------------
		// 랜덤 인덱스에 해당하는 키를 가져와라
		// > 키와 벨류로 이루어진 맵이라는 자료구조에 적합하지 않음
		
		// key list
		Object[] keys = dictionary.keySet().toArray();
		// random english
		Object randomEngWord = keys[rdNum];
		System.out.println("퀴즈 ! :"+randomEngWord);
		// --------------------------------------------------------------------------------
		
		// 유저에게 입력 받기
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		// 정답 비교
		if(user.equals(dictionary.get(randomEngWord))) {
			System.out.println("딩동댕동");
		}else {
			System.out.println("땡!");
		}
		
		// 정답일 때까지 반복
		while(!user.equals(dictionary.get(randomEngWord))) {
			System.out.println("틀렸습니다! 반복 수업 시작 ");
			return;
		}
			
	
	}

}
