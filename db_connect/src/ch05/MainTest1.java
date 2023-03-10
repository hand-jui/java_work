package ch05;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
//		ArrayList<EmployeeDTO> tempList = employeeDAO.showTitleEmpInfo("staff");
//
//		for (int i = 0; i < tempList.size(); i++) {
//			String empNo = tempList.get(i).getEmpNo();
//			String firstName = tempList.get(i).getFirstName();
//			String title = tempList.get(i).getTitle();
//			String gender = tempList.get(i).getGender();
//			System.out.println("empNo: " + empNo);
//			System.out.println("firstName: " + firstName);
//			System.out.println("title: " + title);
//			System.out.println(gender);
//		}

//		ArrayList<EmployeeDTO> temp = employeeDAO.showSalaryCount("Duangkaew", "Piveteau");
//
//		for (int i = 0; i < temp.size(); i++) {
//			String empNo1 = temp.get(i).getEmpNo();
//			String fullName = temp.get(i).getFirstName() + " " + temp.get(i).getLastName();
//			String firstName1 = temp.get(i).getFirstName();
//			String lastName1 = temp.get(i).getLastName();
//			int salary1 = temp.get(i).getSalary();
//			int count = temp.get(i).getCount();
//			
//
//			System.out.println(empNo1);
//			System.out.println(fullName);
//			System.out.println(firstName1);
//			System.out.println(lastName1);
//			System.out.println(salary1);
//			System.out.println(count);
//
//		}

		ArrayList<EmployeeDTO> list = employeeDAO.showSalaryCount22("Duangkaew Piveteau");
		System.out.println(list);
//
		for (int i = 0; i < list.size(); i++) {
			String firstName = list.get(i).getFirstName();
			String lastName = list.get(i).getLastName();
			String fullName = list.get(i).getFullName();
			int count = list.get(i).getCount();

			System.out.println(firstName + "," + lastName + "," + fullName + "," + count);
		}
	}
}
