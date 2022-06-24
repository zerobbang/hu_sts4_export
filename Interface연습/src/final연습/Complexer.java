package final연습;

public class Complexer implements Complexable{
	
	int ink;
	Complexer(){
		ink = INK;
	}

	@Override
	public void print() {
		ink -= 2;
		System.out.println("출력 시작 : "+ink);
		
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔");
	}

	@Override
	public void send(String tel) {
		System.out.println("팩스 이미지 전송 > " + tel);
	}

	@Override
	public void receive(String tel) {

		System.out.println("팩스 이미지 받기 > "+tel);
	}

}
