public class Gold extends Items {
    protected int amt;

    public Gold(int amt){
        super("Gold coin", "There is a ship drawn on the gold coin.", 30);
        this.amt = amt;


    }

    public int getAmt() {
        return amt;
    }
}
