package blinovtask.enums;

public class SeasonDayEnum {
//    private Season season;
    private int day;
    private int season;

//    public SeasonDayEnum(int day, int season) {
//        this.day = day;
//        this.season = season;
//    }

    public SeasonDayEnum(Season season, int day) {
        this.season = season.ordinal();
        this.day = day;
    }
    }

