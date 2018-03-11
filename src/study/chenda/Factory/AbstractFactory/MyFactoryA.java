package study.chenda.Factory.AbstractFactory;

public class MyFactoryA extends AbstractFactory{
    @Override
    public Idrink provideIdrink() {
        return new Milk();
    }

    @Override
    public Ifood provideIfood() {
        return new Apple();
    }
}
