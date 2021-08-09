package designPatterns.creationPatterns;

/**
 * Created by Marcin Beda.
 */

public class House {

    private String adress;
    private Integer floorsNumer;
    private Integer doorsNumber;
    private Integer windowsNumer;

    private House(String adress, Integer floorsNumer, Integer doorsNumber, Integer windowsNumer) {
        this.adress = adress;
        this.floorsNumer = floorsNumer;
        this.doorsNumber = doorsNumber;
        this.windowsNumer = windowsNumer;
    }

    public static class HouseBuilder {
        private String adress;
        private Integer floorsNumer = 1;
        private Integer doorsNumber = 1;
        private Integer windowsNumer = 4;

        public HouseBuilder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public HouseBuilder setFloorsNumer(Integer floorsNumer) {
            this.floorsNumer = floorsNumer;
            return this;
        }

        public HouseBuilder setDoorsNumber(Integer doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public HouseBuilder setWindowsNumer(Integer windowsNumer) {
            this.windowsNumer = windowsNumer;
            return this;
        }

        public House build() {
            return new House(adress, floorsNumer, doorsNumber, windowsNumer);
        }
    }

    public String getAdress() {
        return adress;
    }

    public Integer getFloorsNumer() {
        return floorsNumer;
    }

    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    public Integer getWindowsNumer() {
        return windowsNumer;
    }

    @Override
    public String toString() {
        return "House{" +
                "adress='" + adress + '\'' +
                ", floorsNumer=" + floorsNumer +
                ", doorsNumber=" + doorsNumber +
                ", windowsNumer=" + windowsNumer +
                '}';
    }
}
