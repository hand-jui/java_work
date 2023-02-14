package strings;

public class StringTest4 {

	public static void main(String[] args) {
//	String 문서 확인
//	String 존재하는 메서드 5개 정도

//		1. concat
		String str1 = "안녕";
		String str2 = "하세요";

		String result1 = str1.concat(str2);
		System.out.println(result1);

//		2. trim
		String str3 = new String("   He  l lo");
		System.out.println(str3.trim());

//		3. split
		String str4 = "샤인머스켓##청포도##거봉";
		String[] str = str4.split("##");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

//	선택해서 사용방법 의미, 샘플코드 

	}
}
