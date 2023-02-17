package test2;

import java.util.Arrays;
import java.util.Random;

public class RNumber {

	public int[] create(){
		
		int[] lottoNum = new int[6];
		Random random = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = random.nextInt(45) + 1;
//			중복검증
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i -= 1;
					break;
				}
			}
		}
//		오름차순 정리
		Arrays.sort(lottoNum);
		System.out.println("로또를 실행");
		for(int i = 0 ; i<lottoNum.length;i++) {
			System.out.println(lottoNum[i]);
		}
		return lottoNum;
	}
}
