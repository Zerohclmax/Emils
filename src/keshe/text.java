package keshe;

public class text {
    public static void main(String[] args) {
        Order_pack ord1 = new Order_pack("Bob","Alice","xxxx1",20,8,8,2);
        ord1.transportation("火箭");
        //发件人Bob；收件人Alice；地址xxxx1；重量20；首重费用8；首重8；超重计费单位2
        System.out.println("发信人是"+ord1.getSender()+"既往用户"+ord1.getReceiver()+"共花费:"+ord1.calculateCost());
        System.out.println(ord1);

        System.out.println();

        Order_pack ord2 = new Order_pack("Bob2","Alice2","xxxx2",5,8,8,1);
        ord1.transportation("飞机");
        //发件人Bob2；收件人Alice2；地址xxxx2；重量5；首重费用8；首重8；超重计费单位1
        System.out.println("发信人是"+ord1.getSender()+"既往用户"+ord1.getReceiver()+"共花费:"+ord2.calculateCost());
        System.out.println(ord2);

        System.out.println();

        Quick_pack qui = new Quick_pack("Alice","Bob","xxxxx1",20,100,10);
        qui.transportation("飞船");
        //发件人Alice；收件人Bob；地址xxxxx1；重量20；起价费100；计费单位10（题中已给）；加急公里数10
        System.out.println("发信人是"+qui.getSender()+"既往用户"+qui.getReceiver()+"共花费:"+qui.calculateCost());
        System.out.println(qui);
    }
}
