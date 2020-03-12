import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateWork {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");

        String string_date = scanner.nextLine();
        Date date = dateFormat.parse(string_date);
        Date date_now = new Date();

        Integer difference_year = date_now.getYear() - date.getYear();
        Integer difference_month = date_now.getMonth() - date.getMonth();
        Integer difference_day = date_now.getDay() - date.getDay();
        Integer difference_hours = date_now.getHours() - date.getHours();
        Integer difference_minutes = date_now.getMinutes() - date.getMinutes();

        System.out.println("Разница составляет: " + difference_year + "-" + difference_month + "-" + difference_day
                + " " + difference_hours + ":" + difference_minutes);

        int month = scanner.nextInt();
        switch(month) {
            case 1:
                System.out.println("January"); break;
            case 2:
                System.out.println("February"); break;
            case 3:
                System.out.println("March"); break;
            case 4:
                System.out.println("April"); break;
            case 5:
                System.out.println("May"); break;
            case 6:
                System.out.println("June"); break;
            case 7:
                System.out.println("July"); break;
            case 8:
                System.out.println("August"); break;
            case 9:
                System.out.println("September"); break;
            case 10:
                System.out.println("October"); break;
            case 11:
                System.out.println("November"); break;
            case 12:
                System.out.println("December"); break;
            default:
                System.out.println("No number"); break;
        }

        Animal animal = new Animal("Кошка", "кошачих", 20.5, 2);
        System.out.println(animal);
    }
}
