import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race(); // Экземпляр для отслеживания состояния гонки

        // Вводим данные
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.next();

            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()) { // Проверяем, что введено число
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break; // Выходим из цикла, если число в нужном диапазоне
                    } else {
                        System.out.println("Попробуйте ещё раз. Допустимая скорость: от 0 до 250.");
                    }
                } else {
                    System.out.println("Попробуйте ещё раз. Нужно ввести целое число.");
                    scanner.next(); // Очищаем некорректный ввод
                }
            }

            // Создаём автомобиль и проверяем его на лидерство
            Car carUser = new Car(name, speed);
            race.checkLeader(carUser);
        }

        // Выводим победителя
        System.out.println("Самая быстрая машина: " + race.currentLeader);
        scanner.close(); // Закрываем Scanner
    }
}