package keshe;

public abstract class Pack{
    protected String sender;
    protected String receiver;
    protected String address;
    protected float weight;
    public abstract double calculateCost();
}
