package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 * 计数项
 */
public interface CounterItem {
    String getName();
    CounterObject getCounterObject();
    void increment();
    void decrement();
}
