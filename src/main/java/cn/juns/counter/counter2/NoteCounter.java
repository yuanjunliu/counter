package cn.juns.counter.counter2;

/**
 * Created by liuyuanjun on 2017/12/28.
 */
public class NoteCounter extends DefaultCounter {
    private long id;

    public static NoteCounter of(long id) {
        return new NoteCounter(id);
    }

    private NoteCounter(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return "note";
    }


}
