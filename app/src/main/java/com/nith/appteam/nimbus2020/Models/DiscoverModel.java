package com.nith.appteam.nimbus2020.Models;

public class DiscoverModel {

    String eventName;
    String location;
    String time;
    String image;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public DiscoverModel(String eventName, String location, String time, String image) {
        this.eventName = eventName;
        this.location = location;
        this.time = time;
        this.image = image;
    }
}