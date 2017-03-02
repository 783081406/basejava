package com.ccjjltx.set.treeset;

/**
 * Created by ccjjltx on 2017/3/2.
 *
 * @author ccj
 * @version 1.0
 */
public class R implements Comparable<R> {
    private int count;

    public R(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count:" + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(R r) {
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}
