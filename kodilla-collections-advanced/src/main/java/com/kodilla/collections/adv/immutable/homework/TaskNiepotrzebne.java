package com.kodilla.collections.adv.immutable.homework;

public class TaskNiepotrzebne {
    protected String title;
    protected int duration;

    public TaskNiepotrzebne(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
