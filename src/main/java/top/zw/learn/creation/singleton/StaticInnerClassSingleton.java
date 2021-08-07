package top.zw.learn.creation.singleton;

public class StaticInnerClassSingleton {

    private static class Holder{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return Holder.instance;
    }
}
