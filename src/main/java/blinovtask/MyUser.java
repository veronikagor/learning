package blinovtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyUser {

    private String name;
    private String sureName;
    private String startTime;
    private String finishTime;

    public MyUser(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.startTime = localDateTime.format(formatter);
    }

    public void finishTask() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.finishTime = localDateTime.format(formatter);
    } // YYYY-MM-dd HH:mm:ss

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                '}';
    }
}
