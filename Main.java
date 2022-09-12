import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Integer tiles = 40;

        //Creating properties for the board
        String[] propertyNames = {"Rødovrevej", "Hvidovrevej", "Roskildevej", "Valby Langgade", "Allégade", "Frederiksberg Allé", "Bülowsvej", "Gl. Kongevej", "Bernstorffsvej", "Hellerupvej", "Strandvejen", "Trianglen", "Østerbrogade", "Grønningen", "Bredgade", "Kgs. Nytorv", "Østergade", "Amagertorv", "Vimmelskaftet", "Nygade", "Frederiksberggade", "Rådhuspladsen"};

        ArrayList<Property> properties = new ArrayList<>();

        for (int i = 0; i < propertyNames.length; i++) {
            Property newProperty = new Property(propertyNames[i], 2000 + i * 100,  200 + i * 100, 2000, 5000);

            properties.add(newProperty);
        }



        //Creating the players from the input of their names
        ArrayList<Player> players = createPlayers();

        // game loop
        boolean game = true;

        printWelcome();
        while(game) {

            for (Player player :
                    players) {
                playerTurn(player, properties);
            }


            game = false;
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

    public static void printWelcome() {
        System.out.println("------------------------------------------------------");
        System.out.println("                      Matador");
        System.out.println("------------------------------------------------------");

    }


    public static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void playerTurn(Player p, ArrayList<Property> properties) {
        Scanner playerInput = new Scanner(System.in);
        int dice1 = rollDice();
        int dice2 = rollDice();
        
        int moves = dice1 + dice2;
        
        p.move(moves);

        properties.get(p.getPosition()).displayProperty();

        //check if property is owned, if not ask if user wanna buy, else if owned, pay rent to owning player
        if ( !properties.get(p.getPosition()).isOwned() ) {
            System.out.println("Do you wanna buy this property? y/n");
            String input = playerInput.nextLine();
            //buy
            if (input == "y") {
                p.buyProperty(properties.get(p.getPosition()));
                properties.get(p.getPosition()).buy(p.getName());
            }
            //don't buy
            else if (input == "n") {
                System.out.println("You choose to not buy "  + properties.get(p.getPosition()).getName());
            }
            //invalid answer
            else {
                System.out.println("Invalid input");
            }
        }
        //pay rent
        else {

        }



    }
}

