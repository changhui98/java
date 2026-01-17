package mid1.lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, this.month, this.day);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            '}';
    }
}
