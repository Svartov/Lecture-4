// Подключаем библиотеку
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // Подключаем ввод с клавиатуры
        Scanner in = new Scanner(System.in);

        // Переменные
        int widht;
        int leight;

        // Вводим длину
        System.out.print("Введите длину квадрата: ");
        widht = in.nextInt();

        // Вводим высоту
        System.out.print("Введите высоту квадрата: ");
        leight = in.nextInt();


        for (int i = 0; i < leight; i++) {

            for (int j = 0; j < widht; j++) {

                if (j == 0 || j == widht - 1 || i == 0 || i == leight - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}