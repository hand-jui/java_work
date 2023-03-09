package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {

	private DBClient dbClient;

	public BuyDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buyTBL ");
			while (rs.next()) {
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				BuyDTO dto = new BuyDTO(username, prodName, price, amount);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		String sqlFormat = "INSERT INTO buyTBL(username, prodName, price, amount) VALUES ('%s','%s',%d,%d)";
		String sql = String.format(sqlFormat, dto.getUsername(), dto.getProdName(), dto.getPrice(), dto.getAmount());
		Connection conn = dbClient.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("잘 확인하쇼");
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	public int update(BuyDTO dto, String targetUsername, String targetProdName) {
		String sqlFormat = "UPDATE buyTBL " + "SET prodName = '%s', price = %d, amount = %d "
				+ "WHERE username = '%s' AND prodName = '%s' ";
		String sql = String.format(sqlFormat, dto.getProdName(), dto.getPrice(), dto.getAmount(), dto.getUsername(),
				dto.getProdName());
		int resultRow = 0;
		try (Connection conn = dbClient.getConnection(); Statement stmt = conn.createStatement();) {
			resultRow = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public void delete(String username, String prodName) {
		String sqlFormat = "DELETE FROM buyTBL WHERE username = '%s' AND prodName = '%s'";
		String sql = String.format(sqlFormat, username, prodName);

		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
