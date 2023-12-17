package 装饰器设计模式;

/**
 * @Title: Function_1
 * @Package: 装饰器设计模式
 * @Description:
 * @Author: lpc
 * @Date: 2023/10/20 12:52
 * @Version:1.0
 */
public class A2_Function_1 implements A1_FunctionInterface{

    @Override
    public void function(int code) {
        System.out.println("基本功能查询"+code);
    }
}
