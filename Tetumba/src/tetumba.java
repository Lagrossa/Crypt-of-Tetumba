import java.util.*;
public class tetumba{
    //Room Tracker
    protected static ArrayList<Room> roomTracker = new ArrayList<>();
    //Scanner (general purpose)
    protected static Scanner genScan = new Scanner(System.in);
    //Room Index
    protected static int roomIndex = 0;
    //Character Controller
    protected static cActions controller = new cActions();
    //Create Inventory
    protected static List<Item> inventory = new ArrayList<>();
    public static void main(String[] args) {
        //Game Start
        Scanner scanner = new Scanner(System.in);
        System.out.println("Character creation initialized...");
        System.out.println("Please choose a name for your character");
        String name = scanner.nextLine();
        System.out.println("Next... Choose your character's class \n" +
                "Will they be a fighter(1), mage(2), or a hunter(3)?");
        int classChoice = scanner.nextInt();
        int stamina = 0;


        //10 slots for the toolbar
        while(inventory.size()<10){
            inventory.add(null);
        }
        Player player = new Player(name, classChoice, stamina);
        switch (classChoice){
            case 1 -> {
                System.out.println("You have chosen the fighter class...");
                player.setStamina(45);
                Item swordOfSin = new Sword("Sword of Sin", 75, weaponType.SWORD, damageType.PHYSICAL, 7);
                //add the items
                inventory.set(0, swordOfSin);
            }
            case 2 -> {
                System.out.println("You have chosen the mage class...");
                player.setStamina(20);
                Item staffOfCognizance = new Staff("Staff of Cognizance", 35, weaponType.STAFF, damageType.MAGIC, 10);
                //add the items
                inventory.set(0, staffOfCognizance);
            }
            case 3 -> {
                System.out.println("You have chosen the hunter class...");
                player.setStamina(30);
                Item bowOfEidolons = new Bow("Bow of Eidolons", 50, weaponType.BOW, damageType.PHYSICAL, 5);
                //add the items
                inventory.set(0, bowOfEidolons);
            }
            default -> {
                System.out.println("You have chosen an incorrect class choice. Terminating character creation...");
                System.exit(1);
            }
        }
        RoomGeneration.pushStack(RoomGeneration.room1);
        tetumba.controller.possibleActions();
        System.out.println("Ended Successfully");
    }
}
