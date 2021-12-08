package com.scit.mini1.vo;

import lombok.Data;

@Data
public class MemberVO {
	private String member_id;
	private String member_password;
	private String member_name;
	private int member_photo;
	private int member_level;
	private int member_attack;
	private int member_exp;
	private int member_boss;
}
