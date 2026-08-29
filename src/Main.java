import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    static void main() {

        System.out.println("\n\tЗадание#1\n");

        int firstFriday = 5; // дата первой пятницы от 1до 7.
        for (int day = 1; day <= 31; day++) {
            if (day == firstFriday || (day > firstFriday && (day - firstFriday) % 7 == 0)) {
                System.out.println("Сегодня пятница " + day + "-е число " + " Необходимо подготовить отчет");
            }
        }

        System.out.println("\n\tЗадание#2\n");

        int distanceTraveled=0; // Пройденная дистанция
        int marathon=42195; // Дистанция марафона.

        do {
            int remainingDistance=marathon-distanceTraveled;
            System.out.println("Держитесь! Осталось "+ remainingDistance +" метров");
            distanceTraveled=distanceTraveled+500;
        }
        while (distanceTraveled<marathon);

        System.out.println("\n\tЗадание#2. Версия2\n");

        for (int distance=0; distance < marathon; distance=distance+500){
            int remainingDistance=marathon-distance;
            System.out.println("Держитесь! Осталось "+ remainingDistance +" метров");
        }

        System.out.println("\n\tЗадание#3\n");

        int day=0; // Текущий день.
        int budget=1000; // Сумма денег в рублях.
        while (budget >= 100) {
            day++;
            if (day % 5 == 0) { // Бесплатный день.
                System.out.println("День " + day + ": парковка бесплатная ");
                continue;
            }

            budget -= 100;
        }
        System.out.println("Бюджета хватит на " + day + " дней"+"\n Остаток " + budget+" рублей.");

        System.out.println("\n\tЗадание#3 Версия 2\n");

        int amount=1000;
        int days=1;

        for (; amount >= 100; days++){

            if (days % 5 == 0) { // Бесплатный день.
                System.out.println("День " + days + ": парковка бесплатная ");
                continue;
            }
            if (amount<100){
                break;
            }
            amount-=100;}
            System.out.println("Бюджета хватит на " + days + " дней "+"\n Остаток " + amount + " рублей");

        System.out.println("\n\tЗадание#4\n");

        int month=0; // Текущий номер месяца.
        int total=0; // Текущая сумма накоплений.
        long theАmount=15000; // Сумма вложений
        double percentages=0.07; // 7% полугодовые
        do{
            month++;
            total+=theАmount;
           if (month % 6 == 0){
               long interest = (long) (total * percentages);
               total += interest;}
               System.out.println("Месяц " + month + ", сумма накоплений: " + total + " ₽");
               if (total >= 12_000_000) {
                   break;
               }
           } while (true);

        System.out.println("\n\tЗадание#5\n");

        int charge = 20;      // текущий уровень заряда (в процентах)
        int minute = 0;       // счётчик времени зарядки (в минутах)
        int overheats = 0;    // количество перегревов

        while (charge < 100 && overheats <= 3) {// Цикл работает, пока заряд < 100% и перегревов меньше 4 (то есть <= 3)
            minute++;

            if (minute % 10 == 0) {// Проверка на перегрев: каждые 10 минут
                overheats++;
                System.out.println("Перегрев! Зарядка приостановлена на 2 минуты.");

            if (overheats > 3) {// Если перегревов стало больше 3, прекращаем зарядку
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
            break;
            }
            continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");




    }
}