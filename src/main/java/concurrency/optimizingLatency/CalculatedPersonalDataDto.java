package concurrency.optimizingLatency;


public class CalculatedPersonalDataDto {

    private long amountOfFemales;
    private long amountOfMales;
    private long amountOfShortNames;
    private long amountOfLongNames;

    public void add(CalculatedPersonalDataDto calculatedPersonalDataDto) {
        this.setAmountOfFemales(this.getAmountOfFemales() + calculatedPersonalDataDto.getAmountOfFemales());
        this.setAmountOfMales(this.getAmountOfMales() + calculatedPersonalDataDto.getAmountOfMales());
        this.setAmountOfShortNames(this.getAmountOfShortNames() + calculatedPersonalDataDto.getAmountOfShortNames());
        this.setAmountOfLongNames(this.getAmountOfLongNames() + calculatedPersonalDataDto.getAmountOfLongNames());
    }

    public void calculateLine(String line) {
        String[] split = line.split(",");
        if (split[0].length() <= 6) {
            this.amountOfShortNames++;
        } else {
            this.amountOfLongNames++;
        }

        if ("Female".equals(split[3])) {
            this.amountOfFemales++;
        } else {
            this.amountOfMales++;
        }
    }

    public long getAmountOfFemales() {
        return amountOfFemales;
    }

    public void setAmountOfFemales(long amountOfFemales) {
        this.amountOfFemales = amountOfFemales;
    }

    public long getAmountOfMales() {
        return amountOfMales;
    }

    public void setAmountOfMales(long amountOfMales) {
        this.amountOfMales = amountOfMales;
    }

    public long getAmountOfShortNames() {
        return amountOfShortNames;
    }

    public void setAmountOfShortNames(long amountOfShortNames) {
        this.amountOfShortNames = amountOfShortNames;
    }

    public long getAmountOfLongNames() {
        return amountOfLongNames;
    }

    public void setAmountOfLongNames(long amountOfLongNames) {
        this.amountOfLongNames = amountOfLongNames;
    }

    @Override
    public String toString() {
        return "CalculatedPersonalDataDto{" +
                "amountOfFemales=" + amountOfFemales +
                ", amountOfMales=" + amountOfMales +
                ", amountOfShortNames=" + amountOfShortNames +
                ", amountOfLongNames=" + amountOfLongNames +
                '}';
    }
}
