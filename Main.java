import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer tiles = 40;

        //Creating the players from the input of their names
        ArrayList<Player> players = createPlayers();



        //Creating properties for the board
        String[] propertyNames = {"Rødovrevej", "Hvidovrevej", "Roskildevej", "Valby Langgade", "Allégade", "Frederiksberg Allé", "Bülowsvej", "Gl. Kongevej", "Bernstorffsvej", "Hellerupvej", "Strandvejen", "Trianglen", "Østerbrogade", "Grønningen", "Bredgade", "Kgs. Nytorv", "Østergade", "Amagertorv", "Vimmelskaftet", "Nygade", "Frederiksberggade", "Rådhuspladsen"};

        ArrayList<Property> properties = new ArrayList<>();

        for (int i = 0; i < propertyNames.length; i++) {
            Property newProperty = new Property(propertyNames[i], 2000 + i * 100,  200 + i * 100, 2000, 5000);

            properties.add(newProperty);
        }

        //Display all the players
        for (Player player:
             players) {
            player.displayStats();
            System.out.println("");
        }

        //Display all properties
        for ( Property property : properties ) {
            property.displayProperty();
        }

    }

    public static ArrayList<Player> createPlayers() {
        ArrayList<Player> players = new ArrayList<>(4);

        Scanner playerScanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.println("What is the name of your player? ");
            String pName = playerScanner.nextLine();

            Player p = new Player( pName );

            players.add(p);
        }

        return players;
    }

}
