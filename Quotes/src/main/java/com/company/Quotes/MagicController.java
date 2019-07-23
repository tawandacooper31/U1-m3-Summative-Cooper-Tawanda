package com.company.Quotes;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {
    private List<Magic> answerList;

    Random rand = new Random();

    public MagicController(){
        //ADD MAGIC RESPONSES
        answerList = new ArrayList();
        answerList.add(new Magic("Signs point to yes."));//1
        answerList.add(new Magic("Reply hazy, try again."));//2
        answerList.add(new Magic("Don't count on it."));//3
        answerList.add(new Magic("Outlook not so good."));//4
        answerList.add(new Magic("It is certain."));//5
        answerList.add(new Magic("Without a doubt."));//6
        answerList.add(new Magic("Concentrate and ask again."));//7
    }

    //CREATE API ROUTE
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic getMagic(){

        //PUT RETURN RANDOM FUNCTION
        return answerList.get(rand.nextInt(answerList.size()));
    }

}
