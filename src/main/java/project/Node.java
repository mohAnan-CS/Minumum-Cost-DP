package project;

public class Node {

    private String name;
    private int petrolCost, hotelCost;

    Node(String name, int petrolCost, int hotelCost) {
        this.name = name;
        this.petrolCost = petrolCost;
        this.hotelCost = hotelCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Node{" +
                "name='" + name + '\'' +
                ", petrolCost=" + petrolCost +
                ", hotelCost=" + hotelCost +
                '}';
    }
}
