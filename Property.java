public class Property {

    private String name;

    private boolean owner = false;

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
        return this.name;
    }

    public boolean isOwner() {
        return owner;
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
        System.out.println("Owned: " + owner);
        System.out.println("Price: " + price);
        System.out.println("Rent rate: " + rentRate);
        System.out.println("House price: " + housePrice);
        System.out.println("Hotel price: " + hotelPrice);
    }
}
