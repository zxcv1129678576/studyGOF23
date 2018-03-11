package study.chenda.Factory.AbstractFactory;

public class MyFactoryB extends AbstractFactory{
    @Override
    public Idrink provideIdrink() {
        return new Tea();
    }

    @Override
    public Ifood provideIfood() {
        return new Rice();
    }
}
