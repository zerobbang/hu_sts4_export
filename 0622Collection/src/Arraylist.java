import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist {
	public static void main(String[] args) {
		// 함수 : add(값),  addAll(리스트),   remove(인덱스),   clear(),   size(), get(인덱스),   indexOf(값),   lastIndexOf(값)
		
		
		
		// 선언
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// 데이터 넣기
		for(int i=1; i<=5;i++) {
			al.add(i);
		}
		
		for(int i=100; i<=105;i++) {
			al.add(i);
		}
		
		// 결과 
		System.out.println(al);
		
		// 중복 된 값이 있다면 lastIndexOf을 통해 마지막 인덱스 값을 가져올 수 있다
		// 그냥 indexOf을 할 경우 첫번재에 존재하는 인덱스값을 반환
		System.out.println(al.indexOf(5));
		System.out.println(al.lastIndexOf(5));
		
//		al.remove(3); // index > 3
//		System.out.println(al);
//		// 값으로 지우기 위해 값으로 인덱스 얻기
//		al.remove(al.indexOf(5));
//		System.out.println(al);
//		
//		System.out.println("크기 : "+al.size());
//		al.add(100);
//		System.out.println("크기 : "+al.size());
//		// 크기가 유동적이다.
//		// 배열만 사용할 경우 > 크기가 고정적
//		// 배열사용 보다는 list 사용 지향
//		
//		
//		// for 문 이용해서 데이터 출력
//		for(int i=0; i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		
//		// 모든 요소에 대해서 반복으로 처리하기 위해 단순 추출 방법
//		for(int i : al) {
//			System.out.println(i);
//		}
//		
//		// Iterator 반복자를 이용해서 데이터 출력
//		Iterator iter1 = al.iterator();
//		// 다음 값이 있다면 while문을 반복한다.
//		while(iter1.hasNext()) {
//			System.out.println(iter1.next());
//		}
		
		al.remove(5);  // 오버로딩에 의해서 인덱스로 지우기
		al.remove(Integer.valueOf(5));	// 오버로딩에 의해서 값으로 지우기
		System.out.println(al);
		
	}
}
