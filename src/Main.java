public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(600);
        boss.setHealth(900);
        boss.setWeapon(new Weapon(WeaponType.NUCLEAR, "Nuclear bomb.."));

        System.out.println(boss.printInfo());


        Skeleton charls = new Skeleton(300, 150, new Weapon(WeaponType.FIREARMS, "АК-47: "), 20);
        charls.setHealth(300);
        charls.setDamage(150);
        charls.setWeapon(new Weapon(WeaponType.FIREARMS, "АК-47"));
        charls.setNumberOfArrows(20);

        Skeleton william = new Skeleton(530, 270, new Weapon(WeaponType.COULD, "FLAMBERGE"), 0);
        william.setHealth(530);
        william.setDamage(270);
        william.setWeapon(new Weapon(WeaponType.COULD, "ФЛАМБЕРГ"));
        william.setNumberOfArrows(0);

        System.out.println(charls.printInfo());
        System.out.println(william.printInfo());

    }

}
