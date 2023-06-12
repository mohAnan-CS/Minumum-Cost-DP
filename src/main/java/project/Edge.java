package project;

public class Edge {

    private String city;
    private int petrolCost;
    private int hotelCost;

    Edge(String city, int petrolCost, int hotelCost) {
        this.city = city;
        this.petrolCost = petrolCost;
        this.hotelCost = hotelCost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPetrolCost() {
        return petrolCost;
    }

    public void setPetrolCost(int petrolCost) {
        this.petrolCost = petrolCost;
    }

    public int getHotelCost() {
        return hotelCost;
    }

    public void setHotelCost(int hotelCost) {
        this.hotelCost = hotelCost;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "city='" + city + '\'' +
                ", petrolCost=" + petrolCost +
                ", hotelCost=" + hotelCost +
                '}';
    }
}
