package com.ccjjltx.comparable;

import java.util.Comparator;

/**
 * Created by ccjjltx on 2017/3/1.
 * DescAgeComparator比较器,它是“Person的age的降序比较器
 *
 * @author ccj
 * @version 1.0
 */
public class DescAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getAge() - o1.getAge();
    }
}
