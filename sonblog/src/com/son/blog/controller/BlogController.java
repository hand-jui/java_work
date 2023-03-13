package com.son.blog.controller;

import com.son.blog.Service.BlogService;

public class BlogController {

	private BlogService blogService;

	public BlogController() {
		blogService = new BlogService();
	}

	public int requestSaveBoard(String title, String content, int userId) {
		if (userId != 0) {
			return blogService.saveBoard(title, content, userId);
		}
		return 0;
	}
	
	public void requestDeleteBoard(int boardId, int userId) {
		blogService.deleteByBoardId(boardId, userId);
	}

}
