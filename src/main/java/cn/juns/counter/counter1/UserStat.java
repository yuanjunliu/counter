package cn.juns.counter.counter1;

/**
 * Created by liuyuanjun on 2017/12/26.
 */
public class UserStat {
    public final static Counters.LikeCounter likeCounter = new Counters.LikeCounter("user");
    public final static Counters.ReadCounter noteCounter = new Counters.ReadCounter("user");
}
