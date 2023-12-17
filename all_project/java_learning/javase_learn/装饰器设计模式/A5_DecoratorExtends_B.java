package 装饰器设计模式;

/**
 * @Title: A5_DecoratorExtends_B
 * @Package: 装饰器设计模式
 * @Description:
 * @Author: lpc
 * @Date: 2023/10/20 13:03
 * @Version:1.0
 */
public class A5_DecoratorExtends_B extends A3_DecoratorInterface {
    public A5_DecoratorExtends_B(A1_FunctionInterface f1) {
        super(f1);
    }

    @Override
    public void function(int code) {
        super.function(code);
        System.out.println("新增3功能"+code);
    }
}
