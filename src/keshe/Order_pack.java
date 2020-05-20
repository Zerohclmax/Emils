package keshe;

public class Order_pack extends Pack implements Transportation{
    protected String sender;
    protected String receiver;
    protected String address;
    protected float weight;
    protected String tran_type;
    protected float fist_cost;//首重费用
    protected float fist_weight;//首重
    protected float over_cost;//超重计费单位
    protected double cost;//总钱


    public Order_pack() {
    }

    public Order_pack(String sender, String receiver, String address, float weight, float fist_cost, float fist_weight, float over_cost) {
        this.sender = sender;
        this.receiver = receiver;
        this.address = address;
        this.weight = weight;
        this.fist_cost = fist_cost;
        this.fist_weight = fist_weight;
        this.over_cost = over_cost;
    }



    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFist_cost() {
        return fist_cost;
    }

    public void setFist_cost(float fist_cost) {
        this.fist_cost = fist_cost;
    }

    public float getFist_weight() {
        return fist_weight;
    }

    public void setFist_weight(float fist_weight) {
        this.fist_weight = fist_weight;
    }

    public float over_cost() {
        return over_cost;
    }

    public void setOver_cost(float per_cost) {
        this.over_cost = over_cost;
    }

    public double getCost() {
        return cost;
    }



    public void transportation(String type){this.tran_type=type;}
    public double calculateCost(){
        if (weight <= fist_weight){
            this.cost=fist_cost;
        }
        if (weight > fist_weight){
            this.cost = fist_cost+(weight-fist_weight)*over_cost;
        }
        return this.cost;
    }

    @Override
    public String toString() {
        return "Order_pack{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                ", tran_type='" + tran_type + '\'' +
                ", fist_cost=" + fist_cost +
                ", fist_weight=" + fist_weight +
                ", over_cost=" + over_cost +
                ", cost=" + cost +
                '}';
    }
}
