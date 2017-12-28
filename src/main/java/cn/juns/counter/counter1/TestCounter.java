package cn.juns.counter.counter1;

/**
 * Created by liuyuanjun on 2017/12/26.
 */
public class TestCounter {
    public static void main(String[] args) {
        UserStat.likeCounter.increment();
        UserStat.likeCounter.increment();
        UserStat.likeCounter.increment();
        UserStat.likeCounter.increment();
    }
}
