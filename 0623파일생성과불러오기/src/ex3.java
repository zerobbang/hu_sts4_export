
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 이클립스에서는 기본적으로 파일을 참조하는 위치가 해당 프로젝트 바로 밑
// 현재  폴더에서는 그 파일 없고 src폴더 밑으로 지정해줘야 접근 가능.
// 이걸로 txt화면에서 읽듯이 똑같이 보이도록 수정

public class ex3 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/reader.txt");
			BufferedReader br  = new BufferedReader(fr);
			// 한 글자씩 읽기
//			int i;
//			while((i=fr.read()) != -1) {
//				// 끝까지 계속 읽기
//				System.out.println(i);
//				System.out.println((char)i);
//			}
			
			// 전체 읽기
			String txt = "";
			while((txt=br.readLine()) != null) {
				System.out.println(txt);
			}
			br.close();

		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
