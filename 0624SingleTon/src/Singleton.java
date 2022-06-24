
public class Singleton {
	// 의도적
	private static Singleton one;
	// static 인스턴스마다 갖고 있는 것이 아니라 공유되는 개념
	// 인스턴스가 만들어지기 전 미리 메모리에 로드
	
	private Singleton() {
		System.out.println("new singleton");
	}
	
	// private > 외부에서 생성자 호출 불가
	
	// 인스턴스 생성 메소드 제작
	// 기존에 만들어 둔 인스턴스 값이 없으면 새로운 인스턴스 생성하고
	// 있으면 기존을 사용.
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
			System.out.println("re singleton");
		}
		return one;
	}
}
