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
 * 与TreeSet类似的是，TreeMap中也提供了一系列根据key顺序访问key-value对的方法；
 * Map.Entry firstEntry():返回该Map中最小key所对应的key-value对，如果该Map为空，则返回null
 * Object firstKey():返回该Map中最小Key值，如果该Map为空，这返回null
 * Map.Entry lastEntry():返回该Map中最大Key所对应的key-value对，如果该Map为空或者不存在这样的key-value对，则都返回null
 * Object lastEntry():返回该Map中最大key值，如果该Map为空或不存在这样的key，则都返回null
 * Map.Entry higherEntry(Object key):返回该Map中位于key后一位的key-value对（即大于指定key的最小key所对应的key-value对）。如果该Map为空，则返回null
 * Object higherEntry(Object key):返回该Map中位于key后一位的key值（即大于指定key的最小key值）。如果该Map为空或者不存在这样的key-value
 * 对，则都返回null
 * Map.Entry lowerEntry(Object key):返回该Map中位于key前一位的key-value对(即小于指定key的最大key所对应的key-value对）。如果该Map为空
 * 或不存在这样的key-value对，则都返回null
 * Object lowerKey(Object key):返回该Map中位于Key前一位的key值（即小于指定key的最大key值）。如果该Map为空或者不存在这样的key，则都返回null
 * NavigableMap subMap(Object fromKey,boolean fromInclusive,Object toKey,boolean toInclusive):返回该Map的子Map，其中key的范围是从fromKey(是否包括取决于第二个参数）
 * 到toKey(是否包括取决于第四个参数）
 * SortedMap subMap(Object fromKey,Object toKey):返回该Map的子Map，其key的范围是从fromKey(包括）到toKey(不包括）
 * SortedMap tailMap(Object fromKey):返回该Map的子Map，其key的范围是大于fromKey(包括）的所有key
 * NavigableMap tailMap(Object fromKey,boolean inclusive):返回该Map的子Map，其Key的范围是大于fromKey（是否包括取决于第二个参数)的所有key
 * SortedMap headMap(Object toKey):返回该Map的子Map，其key的范围是小于toKey（不包括）的所有key
 * NavigableMap headMap(Object toKey,boolean inclusive):返回该Map的子Map，其key的范围是小于toKey（是否包括取决于第二个参数）的所有key
 * <p>
 * 这些方法都容易记，因为TreeMap中的key-value对是有序的，所以增加了访问第一个、前一个、后一个、最后一个key-value对的方法，并提供了
 * 几个从TreeMap中截取子TreeMap的方法
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.sortedmap;