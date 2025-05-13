package com.presensi.Models;

public class ScheduleConfigure<T> extends basedOnStory {

    public T getNameOfjawdal() {
        return nameOfjawdal;
    }

    public void setNameOfjawdal(T nameOfjawdal) {
        this.nameOfjawdal = nameOfjawdal;
    }

    private T nameOfjawdal;

    public ScheduleConfigure() {
    }

    @Override
    public Object getStory() {
        return super.getStory();
    }

    public void parameterStory() {
        this.setStory("parameer");
    }
}
