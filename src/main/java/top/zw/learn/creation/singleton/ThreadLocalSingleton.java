package top.zw.learn.creation.singleton;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> theadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return theadLocal.get();
    }
}
