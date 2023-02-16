package ch09;

import java.util.Arrays;
import java.util.Random;

//기능을 구현
//랜덤 번호 발ㅇ생하는 클래스 1~45
//get,set
//6개 번호 리턴하는 기능 & 정렬까지
public class LottoRandomNumber {

	int[] lotto = new int[6];

	public int[] getLotto() {
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			for (int e = 0; e < i; i++) {
				if (lotto[i] == lotto[e]) {
					i -= 1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

}
