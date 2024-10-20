public class YerbaMate extends Tea {
    int numPasses = 0;

    public YerbaMate() {
        super();
    }

    public YerbaMate(String name, int ounces, double cost, int brewTemp, int numPasses) {
        super(name, ounces, cost, brewTemp);
        this.numPasses = numPasses;
    }

    public YerbaMate(YerbaMate other) {
        super(other);
        this.numPasses = other.numPasses;
    }

    public int getNumPasses() { return this.numPasses; }

    public void passMate() { this.numPasses++; }

    public void refill(int ounces) {
        this.setOunces(this.getOunces() + ounces);
    }

    public String toString() {
        return super.toString() + " Num Passes: " + this.numPasses;
    }

    public boolean equals(Object other) {
        if (super.equals(other) && other instanceof YerbaMate otherMate) {
            return otherMate.numPasses == this.numPasses;
        }
        return false;
    }
}
