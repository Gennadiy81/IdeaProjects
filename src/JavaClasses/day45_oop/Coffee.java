package JavaClasses.day45_oop;

public class Coffee {
    /**
     * can be 0 - 100 as a percentage
     */
    int getAmount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "getAmount=" + getAmount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill() {
        getAmount = 100;
    }

    public void drink(int someAmount) {
        getAmount -= someAmount;
    }

    public int getAmount() {
        return getAmount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

}

