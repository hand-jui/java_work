package com.tenco.blog.service;

import com.tenco.blog.dao.BlogDAO;
import com.tenco.blog.dto.BlogDTO;

public class BlogService {

	private BlogDAO blogDAO;

	public BlogService() {
		blogDAO = new BlogDAO();
	}

//	블로그 저장 기능 로직 구현
	public int saveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		if (title.equals("") || title.length() < 2) {
			return resultRowCount;
		}

		resultRowCount = blogDAO.save(title, content, userId);
		return resultRowCount;
	}

//	게시글 삭제하는 로직 구현
	public void deleteByBoardId(int boardId, int userId) {

//		삭제하혀는 컨텐츠가 직접쓴 글이 맞는지 확인하는 과정 필요
		BlogDTO blogDTO = selectByBoardId(boardId);
		if (userId == blogDTO.getUserId()) {
			blogDAO.delete(boardId);
		}

//		삭제 요청 쿼리 작성 예정
	}

//	하나의 게시글을 찾는 로직 구현
	public BlogDTO selectByBoardId(int boardId) {
		BlogDTO blogDTO = null;

//		blogDAO.select() 호출 예정 --> 응답 ResultSet에 담겼다가 클래스화

		return blogDTO;
	}

}