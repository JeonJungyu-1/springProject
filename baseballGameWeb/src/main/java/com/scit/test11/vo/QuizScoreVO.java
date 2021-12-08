package com.scit.test11.vo;

import lombok.Data;

@Data
public class QuizScoreVO {
	private int quizScoreNumber;
	private	String userId;
	private int correctAnswer;
	private int wrongAnswer;
	private double correctPercent;
}
