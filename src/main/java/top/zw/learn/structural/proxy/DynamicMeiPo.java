package top.zw.learn.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicMeiPo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson person){
        this.target = person;
        return (IPerson) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before();
        Object obj = method.invoke(target,objects);
        after();
        return obj;
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }

    public static void main(String[] args) {
        IPerson personProxy = new DynamicMeiPo().getInstance(new Zhangsan());
        personProxy.findLover();
    }
}
