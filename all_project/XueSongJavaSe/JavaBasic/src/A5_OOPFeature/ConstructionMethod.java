package A5_OOPFeature;

public class ConstructionMethod {
   String name;
    ConstructionMethod(){//默认生成一个无参的构造方法
    }
    ConstructionMethod(String n){//也是构造方法
        name=n;
    }
    public void play(){
        System.out.println("我叫"+name);
    }
}
class ConstructionMethodTest{
    public static void main(String[] args) {
        ConstructionMethod c=new ConstructionMethod();
        c.name="zs";
        c.play();
        ConstructionMethod c1=new ConstructionMethod("lisi");
        c1.play();
    }


}
