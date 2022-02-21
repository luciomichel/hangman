package com.domvsit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domvsit.entities.HangmanWord;

public interface HangmanWordRepository extends JpaRepository<HangmanWord, Long>{

}
