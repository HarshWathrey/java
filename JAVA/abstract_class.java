//Abstract class and methods
abstract class payment{
    abstract void pay(int a);
    void succes(){
        System.out.println("payment done");
    }
//    int a=5;
}
class UpiPayment extends payment{
    void pay(int a){
        System.out.println("payment via upi"+ a);
    }
}
class NetBanking extends payment{
    void pay (int b){
        System.out.println("pay via netbanking"+ b);
    }
}
class abstract_class {
    public static void main(String[] args) {
        payment obj= new UpiPayment();

        obj.pay(6000);
        obj.succes();
        payment obj1=new NetBanking();
        obj1.pay(12000);
        obj1.succes();
    }
}
