package ch03;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
//		디비 접근해서 기능 수행하는 것은
		EmployeeDao employeeDao = new EmployeeDao();
		ArrayList<EmployeeDTO> list = employeeDao.select(10005);
		
		
//		swint 화면일 경우
		for (int i =0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		
	}
	
}
