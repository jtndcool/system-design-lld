package Problems.SplitWise.Models;

public class Split {
    private Double amount;
    private User user;

    public Split(Double amount) {
        this.amount = amount;
    }

    public Split(Double amount, User user) {
        this.amount = amount;
        this.user = user;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
