package top.zw.learn.creation.singleton;

public enum EnumSingleton {
    INSTANCE;

    private Object obj;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


}
