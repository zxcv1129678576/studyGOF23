package study.chenda.Factory.Simple;

public class FactoryB extends  AbstractFactory {
    @Override
    public IpProduct createProduct() {
        return new ProductB();
    }
}
