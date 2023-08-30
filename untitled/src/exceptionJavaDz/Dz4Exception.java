package exceptionJavaDz;

import java.util.Scanner;

public class Dz4Exception {


   static public void EmptyLines() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String text = scanner.nextLine();
        if (!text.isEmpty()) {
            System.out.println(text);
        } else {
            throw new Exception("Строка пустая.");
        }
    }
}

