package study.chenda.Factory.Simple;

public class FactoryA extends AbstractFactory {
    @Override
    public IpProduct createProduct() {
        return new ProductA();
    }
}
