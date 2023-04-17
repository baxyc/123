package gb2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float number = readFloat("Введите дробное число: ");
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextFloat()) {
            System.out.print("Некорректный ввод. " + message);
            scanner.next();
        }
        float number = scanner.nextFloat();
        return number;
    }
}
