package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2 {

	public static void main(String[] args) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output1_ex.txt"));
			writer.write("잠와");
			writer.newLine();
			writer.write("오늘 금용리");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
