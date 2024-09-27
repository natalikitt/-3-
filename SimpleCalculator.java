import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Виведення інструкцій
        System.out.println("Простий калькулятор");
        
        // Введення першого числа
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        // Вибір операції
        System.out.print("Виберіть операцію (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Введення другого числа
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        // Змінна для збереження результату
        double result = 0;

        // Виконання операції
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                    return;
                }
                break;
            default:
                System.out.println("Невідома операція!");
                return;
        }

        // Виведення результату
        System.out.println("Результат: " + result);
    }
}
