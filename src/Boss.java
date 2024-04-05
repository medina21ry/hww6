import java.lang.reflect.Type;

public class  Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss Damage: " + getDamage()
                + " Boss Health: " + getHealth()
                + " Type of Weapon: " + weapon.getType()
                + " Boss Weapon : " + weapon.getName() ;
    }
}
