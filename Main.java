import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем его свойства
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Physical damage");
        System.out.println("Boss:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: "+ boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("     ");
        System.out.println("Heroes:");
        for (Hero hero : heroes) {
            System.out.println("Name: " + hero.getName());
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    // Метод для создания героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero("NION",100, 20, "Magic damage");
        Hero hero2 = new Hero("ALUCARD",80, 30, "Physical damage");
        Hero hero3 = new Hero( "VINZ",100, 20, "kinetic damage");

        // Возвращаем массив героев
        return new Hero[] { hero1, hero2, hero3};
    }
}