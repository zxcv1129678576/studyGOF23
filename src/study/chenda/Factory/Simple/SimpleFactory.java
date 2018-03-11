package study.chenda.Factory.Simple;

public class SimpleFactory {

    public static IpProduct provide(String a){
        switch (a){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default:  break;
        }
        return null;
    }
}
