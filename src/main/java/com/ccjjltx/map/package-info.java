/**
 * Created by ccjjltx on 2017/3/11.
 * Map接口中常用方法：
 * void clear():删除该Map对象的所有key-value对
 * boolean containsKey(Object key):查询Map中是否含有指定的key，如果包含则返回true
 * boolean containsValue(Object value):查询Map中是否包含一个或者多个value，如果包含则返回true
 * Set entrySet():返回Map中包含的key-value对说组成的Set集合，每个集合元素都是Map.Entry(Entry是Map的内部类）对象
 * Object get(Object key):返回指定key说对应的value；如果此Map中部包含该key，则返回null
 * boolean isEmpty():查询该Map是否为空（即不包含任何key-value对比),如果为空则返回true.
 * Set keySet():返回该Map中所有key组成的Set集合
 * Object put(Object key,Object value):添加一个key-value对，如果当前Map中已有一个与该key相等的key-value对，
 * 则新的key-value对会覆盖原来的key-value对
 * void putAll(Map m):将制定Map中的key-value会复制到本Map中
 * Object remove(Object key):删除指定key所对应的key-value对，返回被删除的key说关联的value，如果该key不存在，则返回null
 * boolean remove（Object key,Object value):java8新增的方法，删除指定key、value所对应的key-value对。如果从该Map中成功删除该
 * key-value对，该方法返回true，否则返回false
 * int size():返回该Map里的key-value对的个数
 * Collection values():返回该Map里所有value组成的Collection
 *
 * Map接口提供了大量的实现类，典型实现如HashMap和Hashtable等
 * HashMap的子类LinkedHashMap
 * SortedMap子接口及该接口的实现类TreeMap
 * 以及WeakHashMap、IdentityHashMap等
 *
 * Map中包括一个内部类Entry，该类封装了一个key-value对，Entry包含三个方法：
 * Object getKey():返回该Entry里包含的key值
 * Object getValue():返回该Entry里包含的value值
 * Object setValue(V value):设置该Entry里包含的value值，并返回新设置的value值
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map;