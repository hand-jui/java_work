package ch05;

import java.util.ArrayList;

public interface IEmployeeDAO {

//	해당 직함에 이름을 입력받아 직원을 출력
	ArrayList<EmployeeDTO> showTitleEmpInfo(String title);
	
	
//	풀 네임을 받아 직원의 연봉 받은 횟수를 반환하는 기능을 만들어 주세요
	ArrayList<EmployeeDTO> showSalaryCount(String firstName, String lastName);
	
	ArrayList<EmployeeDTO> showSalaryCount22(String fullName);
	
	
}
