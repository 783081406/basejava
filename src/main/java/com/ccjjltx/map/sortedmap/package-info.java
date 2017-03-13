/**
 * Created by ccjjltx on 2017/3/12.
 * Map接口也派生出一个SortedMap子接口，SortedMap接口也有一个TreeMap实现类
 * 也是有两种排序方式：
 * 自然排序：TreeMap的所有key必须实现comparable接口，而且所有的key应该是同一个类的对象，否则将会抛出ClassCastException异常
 * 定制排序：创建TreeMap时，传入一个Comparator对象，该对象负责对TreeMap中的所有key进行排序。采用定制排序不要求Map的key实现Comparable接口
 * 如果使用自定义类作为TreeMap的key，且想让TreeMap良好地工作，则重写该类的equals()方法和compareTo()方法时应该保持一致的返回
 * 结果；两个key通过equals()方法比较返回true时，他们通过compareTo()方法比较应该返回0。如果equals()方法与compareTo()方法返回的结果不一致，
 * TreeMap与Map接口的规则就会冲突
 * <p>
 * 强调:Set和Map的关系十分密切,Java源码就是先实现了HashMap,TreeMap等集合，然后通过包装一个所有的value为null的Map集合实现了Set集合类
 * </p>
 * 
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.sortedmap;