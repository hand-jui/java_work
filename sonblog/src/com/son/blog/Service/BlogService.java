package com.son.blog.Service;

import com.son.blog.dao.BlogDAO;
import com.son.blog.dto.BlogDTO;

public class BlogService {

	private BlogDAO blogDAO;

	public BlogService() {
		blogDAO = new BlogDAO();
	}

	public int saveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		if (title.equals("") || title.length() < 2) {
			return resultRowCount;
		}
		resultRowCount = blogDAO.save(title, content, userId);
		return resultRowCount;
	}

	public void deleteByBoardId(int boardId, int userId) {
//		BlogDTO blogDTO = selectByBoardId(boardId);
//		if (userId == blogDTO.getUserId()) {
			blogDAO.delete(boardId);
//		}
	}

	private BlogDTO selectByBoardId(int boardId) {
		
		BlogDTO blogDTO = null;
		return blogDTO;
	}
}
