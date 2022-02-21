package com.domvsit.dao;

import java.util.List;

import com.domvsit.entities.HangmanMgmt;
import com.domvsit.entities.HangmanWord;

public interface HangmanDao {
	
	public void createGuessWord(HangmanWord hangmanWord);
	public List<HangmanWord> retrieveGuessWordListByCategory(String category);
	public HangmanWord retrieveGuessWordById(Long id);
	public void deleteGuessWordById(Long id);
	public void deleteGuessWordListCategory(String category);
	public List<HangmanWord> retrieveAllGuessWordList();
	
	public Long createHangmanReport(HangmanMgmt hangmanMgmt);
	public List<HangmanMgmt> getHangmanRepByState(String state);
	public void deleteHangmanReportById(Long id);
	public List<HangmanMgmt>  getAllHangmanReport();
	public void updateHangmanReport(HangmanMgmt hangmanMgmt);
	public HangmanMgmt getHangmanRepById(Long id);
	
	public Long getNumberOfStartedGames(String state);
}
