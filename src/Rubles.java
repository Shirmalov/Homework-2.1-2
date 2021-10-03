public class Rubles {
    public static void main(String[] args) {
        int replenishmentAmount = 1100;
        int initialAccount = 100;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
            initialAccount = initialAccount + replenishmentAmount + bonus;
        } else {
            bonus = 0;
            initialAccount = initialAccount + replenishmentAmount + bonus;
        }
        System.out.println(initialAccount);
        System.out.println(bonus);
    }

}
