import java.util.ArrayList;
import java.util.List;

public class 제네릭 {
	// 함수의정의와 호출이 다른다.
	// 파라미터와 아규먼트는 다르다.
	public static void main(String[] args) {
//		// 일반적인 방법
//		List list = new ArrayList();
//		list.add("hello");
//		String str = (String) list.get(0);
//		System.out.println(str);
//		
//		// 제네릭 사용 코드
//		List<String> list2 = new ArrayList<String>();
//		list2.add("hi");
//		String str2 = list2.get(0);
//		System.out.println(str2);
		
		
		// 정의할 때 데이터 타입이 정해지는 것이 아니라 인스턴스가 만들어질 때 정해진다.
		Box<String> strBox = new Box<String>("ㅎㅎ");
		Box<Integer> intBox = new Box<Integer>(7);
		
		String a = strBox.get();
		Integer b= intBox.get();
		System.out.println(a+b);
		
		
		
	}
}
