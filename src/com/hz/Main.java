package com.hz;

public class Main {

    public static void main(String[] args) {

        TrendingTopics trending =
                new TrendingTopics();

        Controller controller =
                new Controller();

        controller.start(trending);
    }
}
