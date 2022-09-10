public class Player {

    private int money = 0;
    private Property[] properties = {};
    private int position = 0;
    private String name = "";

    public Player(String setName) {

        name = setName;
        money = 30000;

        println("New player: " + name);
        println("Money: " + money);

    }

    public void displayStats() {
        println("Player " + name + " STATS:");
        println("Money: " + money);
        println("Position: ?" + position);
    }

    public void buyProperty(Property newProperty) {


    }


}
