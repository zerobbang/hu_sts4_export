package final연습;

public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();

	       System.out.println("기본 잉크량" + Printerable.INK);
	       System.out.println("FAX 번호: " + Complexable.FAX_NO);
	       com.print();
	       com.scan();
	       com.receive("5678");
	       com.send("9012");


	        if(com instanceof Complexable){
	            System.out.println("====com 참조변수의 객체는 Complexable 입니다.");
	            Complexable c = com;
	            c.print();
	            c.scan();
	            com.receive("5678");
	 	       com.send("9012");
	        }

	        if(com instanceof Printerable){
	            System.out.println("====com 참조변수의 객체는 Printerable 입니다.");
	            Printerable c = com;
	            c.print();
	            //c.scan();  -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            //c.receive("02-5678");  -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            //c.send("03-5678");  -> 부모에 없는 메소드이기 때문에 오류가 난다.
	        }

	        if(com instanceof Scannerable){
	            System.out.println("====com 참조변수의 객체는 Scannerable 입니다.");
	            Scannerable c = com;
	            //c.print();  -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            c.scan();
	            //c.receive("02-5678"); -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            //c.send("03-5678");  -> 부모에 없는 메소드이기 때문에 오류가 난다.
	        }

	        if(com instanceof Faxable){
	            System.out.println("====com 참조변수의 객체는 Faxable 입니다.");
	            Faxable c = com;
	            //c.print(); -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            //c.scan(); -> 부모에 없는 메소드이기 때문에 오류가 난다.
	            com.receive("5678");
	 	       	com.send("9012");
	        }	
	}
}
