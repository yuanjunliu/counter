package cn.juns.counter.counter1;

/**
 * Created by liuyuanjun on 2017/12/26.
 */
public interface Counter {
    String getItem();
    void setItem(String item);
    String getName();
    void setName(String name);
    void increment();
    void decrement();
    int getCount();
}
