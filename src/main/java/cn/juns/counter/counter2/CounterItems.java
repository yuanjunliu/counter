package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 */
public class CounterItems {
    static class LikeCounterItem extends DefaultCounterItem {

        public LikeCounterItem(CounterObject counterObject) {
            super(counterObject);
        }

        @Override
        public String getName() {
            return "like";
        }
    }
}
