package com.hz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {

    private TrendingTopics topics;

    public void start(TrendingTopics topics) {

        this.topics = topics;

        listen();
    }

    private void listen() {

        while(true) {

            String msg = readLine();

            switch (msg) {

                case "add trump":
                    this.topics.add(getTrump());

                default:
                    setTrendingTopic(msg);
            }

            this.topics.notifyObservers();
        }
    }

    private Observer getTrump() {

        return new Trump();
    }

    private void setTrendingTopic(String msg) {

        this.topics.setTrending(msg);
    }

    private String readLine() {

        String msg;

        try{
            msg = new BufferedReader(
                    new InputStreamReader(System.in))
                    .readLine();
        }
        catch(Exception ex) {
            msg = "Could not read input..";
        }

        return msg;
    }
}