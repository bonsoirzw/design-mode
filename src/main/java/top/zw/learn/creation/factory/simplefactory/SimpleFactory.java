package top.zw.learn.creation.factory.simplefactory;

public class SimpleFactory {

    public static AbstractProduct create(String productType){
        if(productType.equals("A")){
            return new ConcreteProductA();
        }else if(productType.equals("B")){
            return new ConcreteProductB();
        }else{
            return new ConcreteProductC();
        }
    }
}
