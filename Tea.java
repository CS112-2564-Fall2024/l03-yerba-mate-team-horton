public class Tea extends CaffeinatedBeverage {
    int brewTemp = 0;

    public Tea() {
        super();
        setBrewTemp(0);
    }

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        setBrewTemp(brewTemp);
    }

    public Tea(Tea tea) {
        super(tea);
        setBrewTemp(tea.getBrewTemp());
    }

    public void setBrewTemp(int brewTemp) { this.brewTemp = brewTemp; }
    public int getBrewTemp() { return brewTemp; }

    public String toString() {
        return super.toString() + " brewTemp: " + brewTemp;
    }

    public boolean equals(Object other) {
        if (super.equals(other) && other instanceof Tea) {
            Tea tea = (Tea) other;
            return this.brewTemp == tea.brewTemp;
        }
        return false;
    }
}
