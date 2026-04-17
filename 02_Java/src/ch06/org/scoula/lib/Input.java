package ch06.org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner scan = new Scanner(System.in);

    static String read(String title) {
        System.out.print(title);
        return scan.nextLine();
    }

    static String read(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String input = scan.nextLine();

        if (input.isEmpty()) {
            return defaultValue;
        }
        return input;
    }

    static int readInt(String title) {
        System.out.print(title);
        int answer = scan.nextInt();
        scan.nextLine();
        return answer;
    }

    static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s ", title, yesNo);

        String answer = scan.nextLine();
        if (answer.isEmpty()) {
            return defaultValue;
        }
        return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }

}
