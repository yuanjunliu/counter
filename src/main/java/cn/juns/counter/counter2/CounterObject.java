package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 * 计数对象
 */
public interface CounterObject {
    String getName();
    long getId();
    CounterItem item(String name);
}
