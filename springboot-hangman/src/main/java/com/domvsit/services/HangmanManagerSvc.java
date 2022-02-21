package com.domvsit.services;

import java.util.List;

import com.domvsit.dto.HangmanMgmtDto;
import com.domvsit.entities.HangmanMgmt;
import com.domvsit.entities.HangmanWord;
import com.domvsit.entities.PlayerData;

public interface HangmanManagerSvc {
	
	public void createGuessWord(HangmanWord hangmanWord);
	public void deleteGuessWordById(Long id);
	public HangmanWord getGuessWordById(Long id);
	public List<HangmanWord> getGuessWordListByCategory(String category);
	public List<HangmanWord> getAllGuessWordList();
	public void deleteGuessWordByCategory(String category);
	
	public Long createGameStat(HangmanMgmt hangmanMgmt);
	public void deleteGameStatById(Long id);
	public void updateStopGameStat(HangmanMgmt hangmanMgmt);
	
	public HangmanMgmtDto getAllStartedGames();
	public HangmanMgmtDto getAllGameStat();
	
	public void createPlayerData(String sessionId, Long hangmanMgmtId);
	public PlayerData existingActivePlayer(String sessionId);
	public void registerGuessedLetters(String sessionId, String newGuessedLetter);
	public void registerUsedChances(String sessionId);
	public void registerCorrectIndices(String sessionId, String correctIndices);
}
