
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int diffInYears = 0;
        int years = 0;
        int months = 0;
        int days = 0;

        if (this.year != comparedDate.year) {
            if (this.year < comparedDate.year) {
                diffInYears = comparedDate.year - this.year;
            } else {
                diffInYears = this.year - comparedDate.year;
            }

            years = diffInYears - 1;
            
            if (this.month != comparedDate.month) {
                if (this.year < comparedDate.year) {
                    months = 13 - this.month + comparedDate.month;

                } else {
                    months = 13 - comparedDate.month + this.month;
                }
                if (months > 12) {
                    years++;
                }
            }

            if (this.month == comparedDate.month) {
                if (this.year < comparedDate.year) {
                    days = 31 - this.day + comparedDate.day;
                    if (days > 30) {
                        years++;
                    }
                } else {
                    if (this.day >= comparedDate.day) {
                        years++;
                    }
                }
            }

        }
        return years;
    }
}
