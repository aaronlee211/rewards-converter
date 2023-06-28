public class RewardValue {
    private double cash;

    private static final double conversionRate = 0.0035;

    // The two constructors are initialized with the same name and are subject to method overloading
    // if the passed in argument is a double it'll utilize the first one (cashValue) otherwise if
    // it is an integer it'll utilize the second one (miles)
    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    // instructed to make a constructor to accept miles, but in the RewardsConverter, there is no
    // line to create a new constructor passing in miles, so it is unused
    public RewardValue(int milesValue) {
        this.cash = convertToMoney(milesValue);
    }

    // Grabs the cash value that is assigned to the class RewardValue
    // When initialized with new RewardValue(cashValue)
    public double getCashValue() { return cash; }

    // Applies the conversion rate and returns the appropriate mile rewards
    // based on the amount of cash
    public double getMilesValue() { return (cash / conversionRate); }

    public int convertToMoney(int milesValue) {
        return (int) (milesValue * conversionRate);
    }
}
