package top.zw.learn.creation.factory.abstractfactory;

public class ConcreteFactory implements Factory{

    @Override
    public ProductA createProductA() {
        return () -> System.out.println("Factory A create Product A");
    }

    @Override
    public ProductB createProductB() {
        return () -> System.out.println("Factory A create Product B");
    }

    @Override
    public ProductC createProductC() {
        return () -> System.out.println("Factory A create Product C");
    }
}
