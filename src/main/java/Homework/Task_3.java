//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Homework;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_3 {
    public static void Start(){
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        System.out.print("Введите ваше имя: ");
        String name = scanner.next();

        if (hour >= 5 && hour < 12) System.out.printf("Доброе утро, %s!\n", name);
        else if (hour >= 12 && hour < 18) System.out.printf("Добрый день, %s!\n", name);
        else if (hour >= 18 && hour < 23) System.out.printf("Добрый вечер, %s!\n", name);
        else System.out.printf("Доброй ночи, %s!\n", name);

        int hour2 = LocalDateTime.now().getHour();

        if (hour2 >= 5 && hour2 < 12) System.out.printf("Доброе утро, %s!\n", name);
        else if (hour2 >= 12 && hour2 < 18) System.out.printf("Добрый день, %s!\n", name);
        else if (hour2 >= 18 && hour2 < 23) System.out.printf("Добрый вечер, %s!\n", name);
        else System.out.printf("Доброй ночи, %s!\n", name);
    }
}
