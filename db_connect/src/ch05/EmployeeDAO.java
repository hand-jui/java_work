package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//실제 DB에 접근해서 기능을 처리해줌
public class EmployeeDAO implements IEmployeeDAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt; // 이게 뭐라고..?
	private ResultSet rs;

	public EmployeeDAO() {
//		dbHelper.getConnection().createStatement().executeQuery(null);
		dbHelper = DBHelper.getInstance(); // DBHelper 객체를 가지고 오는 동작

		conn = dbHelper.getConnection(); // dbHelper에서 connection 객체를 가지고 오는 동작
	} // end of EmployeeDAO

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.*, t.title FROM employees AS e "
				+ " INNER JOIN titles AS t ON e.emp_no = t. emp_no WHERE t.title = ? ";
//		prepareStatment 시작 번호는 1번 부터 시작.' '<- 생략 가능 그냥 ? 기반으로 사용 가능
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery(); // select

			while (rs.next()) {

				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				dto.setGender(rs.getString("gender"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public ArrayList<EmployeeDTO> showSalaryCount(String firstName, String lastName) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.first_name, e.last_name, concat_ws(' ', e.first_name, e.last_name) AS fullname, count(salary) as count "
				+ "FROM employees AS e LEFT JOIN salaries AS s ON e.emp_no = s.emp_no "
				+ "WHERE e.first_name = ? AND e.last_name = ? GROUP BY e.emp_no ";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCount(rs.getInt("count"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public ArrayList<EmployeeDTO> showSalaryCount22(String fullName) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.first_name, e.last_name, concat_ws(' ', e.first_name, e.last_name) AS fullname, count(salary) as count "
				+ " FROM employees AS e LEFT JOIN salaries AS s ON e.emp_no = s.emp_no "
				+ " WHERE concat_ws(' ', e.first_name, e.last_name) = ? GROUP BY e.emp_no ";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fullName);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setFullName(rs.getString("fullname"));
				dto.setCount(rs.getInt("count"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		return list;
	}

} // end of class
