import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			String fileName = "C:\\Users\\home\\Documents\\자바에서생성한파일";
			fileName = String.format("%s"+i+".txt", fileName);
		    File file = new File(fileName);
		      
		      try {
		         FileWriter fw = new FileWriter(file, true);   //파일에 문자열을 입력하기위한 객체
		         BufferedWriter bufferedWriter  = new BufferedWriter(fw);
		            //효율적으로 한방에 쓰기 위한 버퍼생성
		         
		         if(file.createNewFile()) {   //파일을 생성.   이미 있다면 else로
		            System.out.println("파일생성함");
		         }else {   
		            System.out.println("파일 이미 존재함");
		         }
		         String contents = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세";
		         bufferedWriter.write(contents);
		         bufferedWriter.close();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		}
	      
	      // 반복문을 써서 임시로 파일 명 뒤에 1,2,3 숫자를 증가시켜면서  5개의 파일 만들기
	   }


}

