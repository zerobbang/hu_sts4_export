import java.io.IOException;

public class ex2 {
	
	public static void main(String[] args) {
		// 계속 살아있다가 엔터 치면 출력
		int i=0;
		System.out.println("입력 해ㅐ.......");
		try {
			while((i = System.in.read()) != '\n') {
				 System.out.println("i : "+i);
				 System.in.skip(i);
				for(int j =0;j<i;j++) {
					i = System.in.read();
					System.in.skip(i);
					System.out.println(i);
				}
				if((char)i == 'Q'){
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// \n : 13
		// \r : 10 개행
		
		// 문제점
		// 1바이트씩 읽고 있는데 엔터 쳤던 기록 때문에 같이 출력 된다.
		
		// 'A'\n : 2바이트가 전달 된 것
		// 반복문에서 1바이트씩 해석 하기 때문에 그 엔터까지 읽어서 그런것.
		
	}

}
