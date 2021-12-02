public class Player {
    private int name;
    private int healthPoints;
    private int manaPoints;
    private int stamina;
    private int charClass;
    private static int karma;
    //1 = fighter, 2 = mage, 3 = hunter

    Player(String name, int charClass, int stamina){

    }

    public int getHealthPoints(){
       return healthPoints;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }
    public static int getKarma(){return karma;}

    void character(){

    }
}
