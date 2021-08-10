package top.zw.learn.structural.proxy;

public class MeiPo implements IPerson{

    private IPerson person;

    @Override
    public void findLover() {
        before();
        person.findLover();
        after();
    }

    private void after() {

    }

    private void before() {
    }
}
