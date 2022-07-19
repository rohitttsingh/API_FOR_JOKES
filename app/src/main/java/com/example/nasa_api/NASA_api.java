package com.example.nasa_api;

import java.util.ArrayList;

public class NASA_api {

    private String name;
    private String twitter;
    private String question;
    private String punchline;

    public String getName() {
        return name;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getQuestion() {
        return question;
    }

    public String getPunchline() {
        return punchline;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}