public class RewardValue {
    private Double cash;
    private Integer miles;

    // The two constructors are initialized with the same name and are subject to method overloading
    // if the passed in argument is a double it'll utilize the first one (cashValue) otherwise if
    // it is an integer it'll utilize the second one (miles)
    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(Integer miles) {
        this.miles = miles;
    }

    public Double getCashValue() { return cash; }

    public Double getMilesValue() { return cash * 0.0035; }
}
