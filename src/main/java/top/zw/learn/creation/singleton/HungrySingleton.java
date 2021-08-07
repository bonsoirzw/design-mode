package top.zw.learn.creation.singleton;

public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }

}
