// Подключаем библиотеку
import java.util.Scanner;

public class Fakterial {
    public static void main(String[] args) {

        // Подключаем ввод с клавиатуры
        Scanner in = new Scanner(System.in);

        // Переменные
        int a;
        int i = 1;
        long  sum  = 1;

        // Ввод  фактериала
        System.out.print("Введите фактериал: ");
        a = in.nextInt();

        // Проверка на что 4 < a < 16.
        if(4 < a && a < 16){

            // нахождение фактериала
            while(i <= a) {
                sum *= i;
                i++;
            }
            // Вывод в консоль ответа
            System.out.println(sum);
        }else{
            System.out.println("Ошибка число должно быть больше 4 и меньше 16");
        }
    }
}
