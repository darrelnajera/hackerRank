import java.time.LocalDate;
public class Dateandtime {



    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //use localdate method to return date. import integer values from findDay
        LocalDate date = LocalDate.of(year, month, day);
        //use getDayOfWeek method after providing info above to return the day
        return date.getDayOfWeek().toString();

    

}
}
