package com.hz;

public class Trump implements Observer {

    @Override
    // Dit is mijn brievenbus
    public void update(Subject s) {

        TrendingTopics tt = (TrendingTopics) s;
        String topic = tt.getTrendingTopic();

        System.out.println("Make " + topic + " great again!");
    }
}
