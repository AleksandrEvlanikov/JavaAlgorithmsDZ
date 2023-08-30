package exceptionJavaDz;

import java.util.InputMismatchException;

import static exceptionJavaDz.Dz1Exception.FloatInput;
import static exceptionJavaDz.Dz4Exception.EmptyLines;


public class main {
    public static void main(String[] args) {
        while (true) {
            try {
                //FloatInput();
                EmptyLines();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод данных.");
                System.out.println("Попробуйте еще раз");
            }catch (Exception e) {
                System.out.println("Ошибка " + e.getMessage());
                System.out.println("Попробуйте еще раз");
            }
        }

    }
}
