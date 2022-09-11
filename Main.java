import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Player> players = createPlayers();

        Integer tiles = 40;

        String[] propertyNames = {"Rødovrevej", "Hvidovrevej", "Scandlines", "Roskildevej", "Valby Langgade", "Allégade", "Frederiksberg Allé", "Squash", "Bülowsvej", "Gl. Kongevej", "Mols-Linjen", "Bernstorffsvej", "Hellerupvej", "Strandvejen", "Parkering", "Trianglen", "Østerbrogade", "Grønningen", "Scandlines2", "Bredgade", "Kgs. Nytorv", "Coca Cola", "Østergade", "Amagertorv", "Vimmelskaftet", "Nygade", "Scandlines3", "Frederiksberggade", "Rådhuspladsen"};

        ArrayList<Property> properties = new ArrayList<>();

        for (Player player:
             players) {
            player.displayStats();
            System.out.println("");
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
