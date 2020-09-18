package blinovtask.enums;

public class SeasonDay {
    public static final int WINTER = 1;
    public static final int SPRING = 2;
    public static final int SUMMER = 3;
    public static final int AUTUMN = 4;

    private int season;
    private int day;

    public SeasonDay(int season, int day) {
        this.season = season;
        this.day = day;
    }
}
