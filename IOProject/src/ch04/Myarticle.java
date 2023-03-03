package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myarticle {

	public static void main(String[] args) {
//		파일 입출력을 활용해서 코드를 작성해 주세요
//		입력 대상 : article1.txt
//		출력 대상 : today_article.txt

		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("article1.txt");
			int i;
			fw = new FileWriter("today_article.txt");
			fw.write("뉴스이름 : MVC\n");
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
				fw.write((char) i);
			}
			fw.write("\n작성자 : 손주이");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
