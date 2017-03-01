package com.ccjjltx.comparable.prectice;

import java.util.Comparator;

/**
 * Created by ccjjltx on 2017/3/1.
 * 比较器类
 *
 * @author ccj
 * @version 1.0
 */
public class Comparators {
    public static Comparator<Student> getComparator() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return compares(o1, o2);
            }

            /**
             * 比较名字
             *
             * @param o1 比较数1
             * @param o2 比较数2
             * @return 返回整数比较
             */
            int compares(String o1, String o2) {
                return o1.compareTo(o2);
            }

            /**
             * 比较性别
             *
             * @param o1 比较数1
             * @param o2 比较数2
             * @return 返回整数比较
             */
             int compares(char o1, char o2) {
                return ((o1 == o2) ? 0 : (o1 == '男') ? 1 : -1);
            }

            /**
             * 比较年龄
             *
             * @param o1 比较数1
             * @param o2 比较数2
             * @return 返回整数比较
             */
             int compares(int o1, int o2) {
                return o1 - o2;
            }

            /**
             * return 逻辑解释如下：
             * 谁的姓拼音firstname靠前，谁就排前面。
             * 然后对名字lastname进行排序。如果同名，
             * 女性sex==false排前头。（sex的值1表示男性，-1表示女性）
             * 如果名字和性别都相同，age年龄小的排前头。
             *
             * @param o1 比较类1
             * @param o2 比较类2
             * @return 返回整数比较
             */
             int compares(Student o1, Student o2) {
                //比较名字
                int name = compares(o1.getName(), o2.getName());
                if (name != 0)
                    return name;
                //比较性别
                int sex = compares(o1.getSex(), o2.getSex());
                if (sex != 0)
                    return sex;
                //比较年龄
                return compares(o1.getAge(), o2.getAge());
            }
        };
    }


}
