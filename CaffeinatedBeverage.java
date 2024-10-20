public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage() {
        this.name = "None";
        this.ounces = 0;
        this.price = 0;
    }

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public CaffeinatedBeverage(CaffeinatedBeverage beverage) {
        this.name = beverage.name;
        this.ounces = beverage.ounces;
        this.price = beverage.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Name: " + this.name + ", Ounces: " + this.ounces + ", Price: " + this.price;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof  CaffeinatedBeverage) {
            CaffeinatedBeverage otherBev = (CaffeinatedBeverage) other;
            return this.ounces == otherBev.ounces
                    && Double.compare(this.price, otherBev.price) == 0
                    && this.name.equals(otherBev.name);
        }
        return false;
    }
}