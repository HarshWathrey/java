class Student {
//    public static void main(String[] args) {
        String firstname= "Rahul";
        int age =11;
        Student(String s , int a){
            firstname=s;
            age=a;
            System.out.println(firstname+" "+age);
        }
}
public class class_object{
    public static void main(String[] args) {
        Student obj=new Student ("rohit",15);
        Student obj1 = new Student ("Rahul", 16);
    }
}
