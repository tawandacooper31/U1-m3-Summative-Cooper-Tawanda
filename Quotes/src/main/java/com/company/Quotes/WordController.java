package com.company.Quotes;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private List<Word> wordList;

    Random rand = new Random();


    public WordController(){
        //ADD 10 WORDS WITH DEFINITIONS
        wordList = new ArrayList();
        wordList.add(new Word("Motivation","the general desire or willingness of someone to do something."));//1
        wordList.add(new Word("Influence","a person or thing with the capacity or power to have an effect on someone or something.."));//2
        wordList.add(new Word("Power","the capacity or ability to direct or influence the behavior of others or the course of events."));//3
        wordList.add(new Word("Wisdom","the quality of having experience, knowledge, and good judgment; the quality of being wise."));//4
        wordList.add(new Word("Positivity","the practice of being or tendency to be positive or optimistic in attitude."));//5
        wordList.add(new Word("Insight","create a feeling, especially a positive one in a person."));//6
        wordList.add(new Word("Impact","the effect or influence of one person, thing, or action, on another."));//7
        wordList.add(new Word("Focus","an act of concentrating interest or activity on something."));//8
        wordList.add(new Word("Transformation","a thorough or dramatic change in form or appearance."));//9
        wordList.add(new Word("Obedient","complying or willing to comply with orders or requests; submissive to another's will."));//10


    }
    //CREATE API ROUTE
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Word getWord(){

        //PUT RETURN RANDOM FUNCTION
        return this.wordList.get(rand.nextInt(wordList.size()));
    }
}
