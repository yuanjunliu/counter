package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 */
public abstract class DefaultCounter implements CounterObject {

    @Override
    public CounterItem item(String name) {
        switch (name) {
            case "like":
                return new CounterItems.LikeCounterItem(this);
            default:
                return null;
        }
    }

    public CounterItem like() {
        return item("like");
    }


}
