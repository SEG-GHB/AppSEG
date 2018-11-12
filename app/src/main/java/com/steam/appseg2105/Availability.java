package com.steam.appseg2105;

public class Availability {
    private String serviceTitle;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;
    public Availability(String serviceTitle, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
    this.serviceTitle = serviceTitle;
    this.monday = monday;
    this.tuesday = tuesday;
    this.wednesday = wednesday;
    this.thursday = thursday;
    this.friday = friday;
    this.saturday = saturday;
    this.sunday = sunday;
    }
    public String getServiceTitle() {
        return serviceTitle;
    }
    public String getMonday() {
        return monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public String getFriday() {
        return friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public String getSunday() {
        return sunday;
    }
}
