package A4_Method;

public class Args {
    public static void main(String[] args) {
        Args args1 = new Args();
        args1.print();
        args1.print(1);
        args1.print(1, 2);

    }

    public void print(int... nums) {//可变个数形参的方法
        System.out.println("hello");

    }

    public void print(int i) {//重载
        System.out.println("2222");
    }

    public void print(int i, int j) {//重载
        System.out.println("3333");
    }
//    public void print(int[]nums){不构成重载
//
//    }




}
