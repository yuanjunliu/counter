package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 */
public abstract class DefaultCounterItem implements CounterItem {
    private CounterObject counterObject;

    public DefaultCounterItem(CounterObject counterObject) {
        this.counterObject = counterObject;
    }

    @Override
    public CounterObject getCounterObject() {
        return counterObject;
    }

    @Override
    public void increment() {
        System.out.println("统计对象：" + getCounterObject().getName() +
                "编号：" + getCounterObject().getId() + " 统计项：" + getName() + " 增加 1 ");
    }

    @Override
    public void decrement() {
        System.out.println("统计对象：" + getCounterObject().getName() +
                "编号：" + getCounterObject().getId() + " 统计项：" + getName() + " 减少 1 ");
    }
}
