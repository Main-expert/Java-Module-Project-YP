public class Race {
    public String currentLeader = ""; // Текущий лидер
    public int distanceLeader = 0; // Дистанция текущего лидера

    // Метод для определения нового лидера
    public void checkLeader(Car car) {
        int distance = 24 * car.speed; // Пройденная дистанция за 24 часа

        if (distance > distanceLeader) {
            distanceLeader = distance; // Обновлённая дистанция лидера
            currentLeader = car.nameCar; // Обновлённое название авто
        }
    }
}