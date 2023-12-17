package A4_Method;

public class Recursion {
    //递归
    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        recursion.A();
    }
    public void add(){
        add();
        System.out.println("递归调用");
    }
    public void A(){
        B();
        System.out.println("A");
    }
    public void B(){
        C();
        System.out.println("B");
    } public void C(){
        A();
        System.out.println("C");
    }
}
