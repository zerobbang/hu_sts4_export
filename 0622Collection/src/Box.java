// <E> : Element
// <K> : Key
// <N> : Number
// <T> : Type
// <V> : Value
// 암묵적 동의

// 어떤 데이터 타입으로 들어오든지 나는 T라는 데이터 타입으로 다 받아 들이겠다.
public class Box<T>{
	private T t;
	
	public Box(Object obj) {
		this.t = (T) obj;
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}

}
