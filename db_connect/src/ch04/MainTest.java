package ch04;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {

//		데이터 베이스에 접근해서 memberTBL에 대한 정보
//		데이터 베이스에 접근해서 userTBL에 대한 정보

		UserDAO userDAO = new UserDAO();

//		delete 확인

//		자식 테이블의 데이터를 먼저 삭제해야 부모 테이블의 정보를 삭제할 수 잇다
//		이승기는 구매 테이블에 이력이 남아 있기 때문에 유저 테이블에서 바로 삭제 할 수 없다
		boolean isDelete = userDAO.delete("이승기");
		System.out.println("isDelete : " + isDelete);
		if(isDelete == false) {
			System.out.println("구매테이블에 이력이 남아 있을 수 있습니다.");
		}

//		update 확인
//		UserDTO dto = new UserDTO("유진스", "1995", "부산", "010-2222-2222");
//		int updateRowcount = userDAO.update(dto, dto.getUsername());
//
//		System.out.println("updateRowCount: " + updateRowcount);
//		insert 확인
//		int rowCount = userDAO.insert(new UserDTO("아이즈원", "2020", "경기도", "010-1234-1234"));
//		System.out.println("rowCount : " + rowCount);

//		select 확인
//		ArrayList<UserDTO> list = userDAO.select();
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("=============");
//		}

		BuyDAO buyDAO = new BuyDAO();

//		insert 확인
		int bRowCount = buyDAO.insert(new BuyDTO("김횽리", "텀블러", 8000, 2));
		System.out.println("bRowCount : " + bRowCount);

//		select 확인
//		ArrayList<BuyDTO> bList = buyDAO.select();
//		
//		for(int i = 0; i<bList.size(); i++) {
//			System.out.println(bList.get(i).getUsername());
//			System.out.println(bList.get(i).getProdName());
//			System.out.println(bList.get(i).getPrice());
//			System.out.println(bList.get(i).getAmount());
//			System.out.println("============");
//		}

	}

}
