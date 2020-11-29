package th.ac.ku;

public class Account {
    private String ID;
    private float minimumDeposit;

    public Account(String ID, float minimumDeposit) {
        this.ID = ID;
        this.minimumDeposit = minimumDeposit;
    }

    public String getID() {
        return ID;
    }

    public float getMinimumDeposit() {
        return minimumDeposit;
    }
}
