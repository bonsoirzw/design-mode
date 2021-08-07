package top.zw.learn.creation.factory.factorymethod;

public class FactoryA implements Factory{
    @Override
    public Product create() {
        return new ProductA();
    }
}
