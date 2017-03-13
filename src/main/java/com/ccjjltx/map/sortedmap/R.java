package com.ccjjltx.map.sortedmap;

/**
 * Created by ccjjltx on 2017/3/13.
 *
 * @author ccj
 * @version 1.0
 */
public class R implements Comparable<R> {
    private int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count:" + count + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj != null && obj.getClass() == R.class)
            return this.getCount() == ((R) obj).getCount();
        return false;
    }

    @Override
    public int compareTo(R o) {
        R r = (R) o;
        return this.getCount() > o.getCount() ? 1 : this.getCount() < o.getCount() ? -1 : 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
