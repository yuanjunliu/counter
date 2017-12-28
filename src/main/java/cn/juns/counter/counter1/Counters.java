package cn.juns.counter.counter1;

/**
 * Created by liuyuanjun on 2017/12/26.
 */
public class Counters {

    public static class LikeCounter extends DefaultCounter {
        public LikeCounter(String item) {
            super(item, "like");
        }

    }

    public static class ReadCounter extends DefaultCounter {
        public ReadCounter(String item) {
            super(item, "read");
        }

    }
}
