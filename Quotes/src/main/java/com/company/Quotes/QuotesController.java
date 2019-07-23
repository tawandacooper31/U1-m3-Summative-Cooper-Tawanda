package com.company.Quotes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import  java.util.ArrayList;
import java.util.Random;

@RestController

public class QuotesController {
    private List<Quotes> quotesList;

    Random rand = new Random();


    public QuotesController(){
        //ADD 10 QUOTES WITH AUTHORS
        quotesList = new ArrayList();
        quotesList.add(new Quotes("Keep going. Everything you need will come to you at the perfect time.","Unknown"));//1
        quotesList.add(new Quotes("Motivation is what gets you started. Habit is what keeps you going. ","Jim Rohn"));//2
        quotesList.add(new Quotes("It’s not whether you get knocked down. It’s whether you get back up. ","Vince Lombardi"));//3
        quotesList.add(new Quotes("Perseverance is the hard work you do after you get tired of doing the hard work you already did. ","Newt Gingrich"));//4
        quotesList.add(new Quotes("You cannot soar with the eagles as long as you hang out with the turkeys. ","Joel Osteen"));//5
        quotesList.add(new Quotes("People often say that motivation doesn't last. Well, neither does bathing - that's why we recommend it daily.","Zig Ziglar"));//6
        quotesList.add(new Quotes("A smile is an inexpensive way to change your looks.","Charles Gordy"));//7
        quotesList.add(new Quotes("Shoot for the moon. Even if you miss, you'll land among the stars","Les Brown"));//8
        quotesList.add(new Quotes("When you do the common things in life in an uncommon way, you will command the attention of the world.","George Washington Carver"));//9
        quotesList.add(new Quotes("Other people's opinion of you does not have to become your reality.","Les Brown"));//10



    }
    //CREATE API ROUTE
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quotes getQuotes(){

        //PUT RETURN RANDOM FUNCTION
        return quotesList.get(rand.nextInt(quotesList.size()));
    }


}
