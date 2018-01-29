package com.rogger.service.impl;

import com.rogger.mappers.WordListMapper;
import com.rogger.model.WordList;
import com.rogger.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fangkun on 2018/1/22 0022.
 */
@Service(value = "demoService")
public class DemoServiceImpl implements IDemoService {
    @Autowired
    WordListMapper wordListMapper;
    @Override
    public WordList selectDicById(String dicId) {
        return wordListMapper.selectByPrimaryKey(dicId);
    }
}
