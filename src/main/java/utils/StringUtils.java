package utils;

import java.util.Random;

/**
 * Created by vietluong on 8/12/2018.
 */
public class StringUtils {
    public static Integer getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(900) + 1;
    }

    public static String getRandomEmail() {
        return String.format("auto_email_home_%s@email.com", getRandomNumber().toString());
    }
}
