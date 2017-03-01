package com.ccjjltx.comparable;

import java.util.Comparator;

/**
 * Created by ccjjltx on 2017/3/1.
 *
 * @author ccj
 * @version 1.0
 * @deprecated AscAgeComparator比较器, 它是“Person的age的升序比较器
 */
public class AscAgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
