class Parent{
    void text(int a){
        System.out.println("Mai hu don");
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void variable (int a, int b, boolean d, float e, double f,byte g){
        System.out.println(a +""+b+""+d+""+ e+""+ f+" "+g);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent obj= new Parent();
        obj.text(24);
        obj.sum(24, 542);
        obj.variable(34, 54, true, 33.54F, 43.35, (byte) 4);
    }
}
