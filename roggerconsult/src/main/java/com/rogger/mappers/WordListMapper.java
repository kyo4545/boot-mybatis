package com.rogger.mappers;

import com.rogger.model.WordList;

import java.util.List;

public interface WordListMapper {
    int deleteByPrimaryKey(String id);

    int insert(WordList record);

    int insertSelective(WordList record);

    WordList selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WordList record);

    int updateByPrimaryKey(WordList record);

}