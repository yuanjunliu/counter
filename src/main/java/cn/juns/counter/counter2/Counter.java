package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 */
public class Counter {
    public static void main(String[] args) {
        NoteCounter nc = NoteCounter.of(1);
        nc.like().increment();
        nc.like().decrement();
    }
}
