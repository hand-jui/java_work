package ch08;

public class EmployeeMainjTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2=new Employee();
		employee2.setName("홍길동");
		
		Employee employee3=new Employee();
		employee2.setName("티모");

//		static 변수만 사용하면 각각의 개체가 가지는 상태값을 저장해야 한다면 멤버 변수를 활용하여 사용
		System.out.println(Employee.serialNum);
		
//		홍길동 사원번호 확인 가능
		System.out.println(employee2.getEmployeeId());
//		티모 사원번호 확인 가능
		System.out.println(employee3.getEmployeeId());
	}

}
