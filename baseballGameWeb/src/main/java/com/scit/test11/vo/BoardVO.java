package com.scit.test11.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int board_num;
	private String member_id;
	private	String board_title;
	private String board_content;
	private	String board_inputdate;
	private int	board_likecnt;
}
