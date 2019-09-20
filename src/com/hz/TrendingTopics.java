package com.hz;

import java.util.ArrayList;
import java.util.List;

public class TrendingTopics implements Subject {

    private List<Observer> _observers;
    private String _trending;

    public TrendingTopics() {
        this._observers = new ArrayList<Observer>();
    }

    public String getTrendingTopic() {

        return _trending;
    }

    public void setTrending(String msg) {
        _trending = msg;
    }

    @Override
    public void add(Observer ob) {
        this._observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        this._observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : this._observers) {

            // gebruik de brievenbus!!!!!
            ob.update(this);
        }
    }
}
