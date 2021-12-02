enum weaponType{
    SWORD, BOW, SICKLE, DAGGER, STAFF
}
enum damageType{
    MAGIC, PHYSICAL, MENTAL, TRUE
}

public class Item {
    String name;
    int durability;
    weaponType wepType;
    damageType damType;
    int damage;

    Item(String name){
        this.name = name;
    }

    Item(String name, int durability, weaponType wepType, damageType damType, int damage){
        this.name = name;
        this.durability = durability;
        this.wepType = wepType;
        this.damType = damType;
        this.damage = damage;
        /*System.out.println("Item created with the following statistics: " +
                "\nName: " + name +
                "\nDurability: " + durability +
                "\nWeapon Type: " + wepType +
                "\nDamage Type: " + damType +
                "\nDamage: " + damage);*/
    }

    protected void Attack1(){

    }

    protected void Attack2(){

    }

    protected void Attack3(){

    }

    protected void AttackSpec(){

    }



}
