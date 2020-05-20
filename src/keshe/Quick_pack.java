package keshe;

import java.util.Scanner;

public class Quick_pack extends Pack implements Transportation {
    protected String sender;
    protected String receiver;
    protected String address;
    protected float weight;
    protected String tran_type;
    protected float fist_cost;//起价费
    protected float per_cost=10;//计费单位
    protected double cost;//总钱
    protected float mile;//加急公里数


    public Quick_pack() {
    }

    public Quick_pack(String sender, String receiver, String address, float weight, float fist_cost,float mile) {
        this.sender = sender;
        this.receiver = receiver;
        this.address = address;
        this.weight = weight;
        this.fist_cost=fist_cost;
        this.mile = mile;
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

    public float getMile() {
        return mile;
    }

    public void setMile(float mile) {
        this.mile = mile;
    }

    public void transportation(String type){this.tran_type=type;}

    public double calculateCost(){
        this.cost=fist_cost+mile*0.02+weight*10;
        return cost;
    }

    @Override
    public String toString() {
        return "Quick_pack{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                ", tran_type='" + tran_type + '\'' +
                ", fist_cost=" + fist_cost +
                ", per_cost=" + per_cost +
                ", cost=" + cost +
                '}';
    }
}
