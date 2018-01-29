package com.rogger;

import com.rogger.model.WordList;
import com.rogger.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangkun on 2018/1/22 0022.
 */
@RestController
public class Controller {
    @Autowired
    IDemoService iDemoService;
    @RequestMapping(value = "/getDic",method = RequestMethod.GET)
    public WordList getDicById(@RequestParam String dicId){
        return iDemoService.selectDicById(dicId);
    }

}
