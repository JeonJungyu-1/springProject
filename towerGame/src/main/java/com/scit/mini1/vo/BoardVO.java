package com.scit.mini1.vo;

import lombok.Data;

@Data
public class BoardVO {
	private String board_title;
	private String board_context;
	private String board_lastindate;
	private String member_lastid;
	private int board_hits;
	private String board_original;
	private String board_saved;
}
