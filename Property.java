public class Property {

    private String name;

    private boolean owned = false;
    private String ownerName = "";

    private int price;
    private int rentRate;
    private int housePrice;
    private int hotelPrice;


    public Property(String setName, int setPrice, int setRentRate, int setHousePrice, int setHotelPrice) {

        name = setName;

        price = setPrice;
        rentRate = setRentRate;
        housePrice = setHousePrice;
        hotelPrice = setHotelPrice;
    }

    public String getName() {
        return name;
    }

    public boolean isOwned() {
        return owned;
    }

    public int getPrice() {
        return price;
    }

    public int getRentRate() {
        return rentRate;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }

    public void displayProperty() {
        System.out.println(name + ":");

        System.out.println(owned ?
                "Owned by " + ownerName
        :
            "This property is for sale");

        System.out.println("Price: " + price);
        System.out.println("Rent rate: " + rentRate);
        System.out.println("House price: " + housePrice);
        System.out.println("Hotel price: " + hotelPrice);

        System.out.println("");
    }

    public void sell() {
        ownerName = "";
        owned = false;
    }

    public void buy(String name) {
        ownerName = name;
        owned = true;
    }
}
