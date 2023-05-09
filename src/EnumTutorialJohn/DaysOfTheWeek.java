package EnumTutorialJohn;

public enum DaysOfTheWeek {
    SUNDAY(6, "mehsmeh"),
    MONDAY(7, "productive"),
    TUESDAY(7, "productive"),
    WEDNESDAY(7, "productive"),
    THURSDAY(7, "productive"),
    FRIDAY(7, "productive"),
    SATURDAY(7, "productive");

    final int ratingOfDayOutOf10;
    final String descriptionInOneWord;

    DaysOfTheWeek(int ratingOfDayOutOf10, String oneWordDes) {
        this.ratingOfDayOutOf10 = ratingOfDayOutOf10;
        this.descriptionInOneWord = oneWordDes;
    }
}
