package top.zw.learn.creation.singleton;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
