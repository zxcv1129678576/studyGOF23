package study.chenda.Factory.Simple;

public class ProductB implements IpProduct {
    @Override
    public void method() {
        System.out.println("我是"+this.getClass().getName());
    }
}
