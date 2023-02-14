package ch03;

public abstract class Calculator implements Calc {
	
	@Override
	public double devide(int n1, int n2) {
		if(n2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return 0;
	}

	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int substract(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int times(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
