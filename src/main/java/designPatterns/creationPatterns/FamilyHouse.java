package designPatterns.creationPatterns;


public class FamilyHouse {

    String adress;
    Integer floorsNumer;

    public FamilyHouse(String adress, Integer floorsNumer) {
        this.adress = adress;
        this.floorsNumer = floorsNumer;
    }

    public static FamilyHouse from(House house) {
        return new FamilyHouse(house.getAdress(), house.getFloorsNumer());
    }
}
