package final연습;

public class Complexer implements Complexable{
	
	int ink;
	Complexer(){
		ink = INK;
	}

	@Override
	public void print() {
		// TODO Auto-generated method 
		System.out.println("종이에 출력 시작 : "+--ink);
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("이미지를 스캔합니다.");
	}

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println("이미지를 스캔합니다.");
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println("이미지를 스캔합니다.");
	}

}
