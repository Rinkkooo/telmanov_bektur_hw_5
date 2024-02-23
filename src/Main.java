public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefence("magical");
        System.out.println("Boss health: " + boss.getHealth() + ". Damage: " + boss.getDamage() + ". Defence: " + boss.getDefence());
        Hero[] heroesArray = createHeroes();
        for (Hero hero : heroesArray){
            System.out.println("Hero health: " + hero.getHealth() + " hero damage: " + hero.getDamage() + " super power: " + hero.getSuperPower());
        }

    }
    public static Hero[] createHeroes (){
        Hero phantomAssassin = new Hero(500, 54, "Critical damage");
        Hero antiMage = new Hero(550, 60, "mana burn");
        Hero axe = new Hero(700, 71);
        Hero[] heroesArray = new Hero[3];
        heroesArray[0] = new Hero(500, 54, "Critical damage");
        heroesArray[1] = new Hero(550, 60, "mana burn");
        heroesArray[2] = new Hero(700, 71);
        return heroesArray;
    }

}
