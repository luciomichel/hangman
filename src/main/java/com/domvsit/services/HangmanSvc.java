package com.domvsit.services;

import javax.servlet.http.HttpServletRequest;

import com.domvsit.dto.AnswerDto;
import com.domvsit.dto.HangmanDto;
import com.domvsit.exceptions.HangmanException;

public interface HangmanSvc {
	
	public HangmanDto defaultGame(HttpServletRequest request);
	public String getWordById(Long id);
	public void processAnswer(AnswerDto answerDto) throws HangmanException;
	
	public HangmanDto anotherGame(HangmanDto oldHangmanDto, HttpServletRequest request);
	public void updateHangman(HangmanDto oldHangmanDto);
}
