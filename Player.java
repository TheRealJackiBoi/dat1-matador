import java.util.ArrayList;

public class Player {

    private int money = 0;
    private ArrayList<Property> properties = new ArrayList<>();
    private int position = 0;
    private int lap = 0;
    private String name = "";

    public Player(String setName) {

        name = setName;
        money = 30000;

        System.out.println("New player: " + name);
        System.out.println("Money: " + money);

    }

    public void displayStats() {
        System.out.println("Player " + name + " STATS:");
        System.out.println("Money: " + money);
        System.out.println("Position: ?" + position + ", lap " + lap);
        if ( properties.size() > 0) {
            System.out.println("Properties: ");
            for (Property prop : properties) {
                System.out.println(prop.getName());
            }
        } else System.out.println(name  + " owns no properties");
        System.out.println("");
    }


    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public int getLap() {
        return lap;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }


    public void buyProperty(Property newProperty) {
        money -= newProperty.getPrice();

        properties.add(newProperty);
    }

    public void move(int totalMoves) {
        position += totalMoves;
    }
}
