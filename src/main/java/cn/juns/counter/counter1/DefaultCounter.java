package cn.juns.counter.counter1;

/**
 * Created by liuyuanjun on 2017/12/26.
 */
public class DefaultCounter implements Counter {
    private String item;
    private String name;
    private int count;

    public DefaultCounter() {
    }

    public DefaultCounter(String item, String name) {
        this.item = item;
        this.name = name;
    }

    @Override
    public String getItem() {
        return this.item;
    }

    @Override
    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void increment() {
        this.count++;
        System.out.println(String.format("Redis==%s==%s==%d", getName(), getItem(), getCount()));
    }

    @Override
    public void decrement() {

    }

    @Override
    public int getCount() {
        return this.count;
    }
}
