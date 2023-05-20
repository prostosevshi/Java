package package_1.lesson_1;

import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 21);

        System.out.println("Игра - Угадайте число");

        while (true)
        {
            System.out.print("Введите число: ");
            int userInput = scanner.nextInt();

            if (userInput == randomNumber)
            {
                System.out.println("Вы правs!!!");
                break;
            }
            else if (userInput > randomNumber)
            {
                System.out.println("Ваше число больше!");
            }
            else
            {
                System.out.println("Ваше число меньше!");
            }
        }
    }
}
