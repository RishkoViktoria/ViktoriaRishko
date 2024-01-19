public class Main {
    public static void main(String[] args) {
        // Стоимость билета
        double ticketCost = 13676.0;

        // Количество рублей для одной бонусной мили
        double milesPerRub = 20.0;

        // Рассчитываем количество бонусных миль
        int bonusMiles = (int) (ticketCost / milesPerRub);

        // Выводим результат
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
