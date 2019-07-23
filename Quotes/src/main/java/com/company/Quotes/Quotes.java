package com.company.Quotes;

public class Quotes {
    //CREATE VARIABLES
    private String quote;
    private String author;

    //EMPTY CONSTRUCTOR
    public Quotes(){}

    //CONSTRUCTOR
    public Quotes (String quote, String author){
        this.quote = quote;
        this.author = author;
    }
    //GETTERS AND SETTERS


    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
