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
 * <p>
 * Map接口提供了大量的实现类，典型实现如HashMap和Hashtable等
 * HashMap的子类LinkedHashMap
 * SortedMap子接口及该接口的实现类TreeMap
 * 以及WeakHashMap、IdentityHashMap等
 * <p>
 * Map中包括一个内部类Entry，该类封装了一个key-value对，Entry包含三个方法：
 * Object getKey():返回该Entry里包含的key值
 * Object getValue():返回该Entry里包含的value值
 * Object setValue(V value):设置该Entry里包含的value值，并返回新设置的value值
 * <p>
 * Java8为Map新增加的方法
 * Object compute(Object key,BiFunction remappingFunction):该方法使用remappingFunction根据原key-value对计算一个新value。
 * 只要新value不为null,就使用新value覆盖原value;如果原value不为null，但新value为null，则删除原key-value对；如果原value，
 * 新value不为null，但新value为null，这删除原来key-value对；如果原value、新value同时为null，那么该方法不改变任何key-value对，直接返回null
 * Object computeIfAbsent(Object key,Function mappingFunction):如果传给该方法的key参数在Map中对应的value为null，则使用mappingFunction
 * 根据key计算一个新的结果，如果计算结果不为null，则用计算结果覆盖原有的value。如果原Map原来不包括该key，那么该方法可能会
 * 添加一组key-value对
 * Object computeIfPresent(Object key,BiFunction remappingFuntion):如果传给该方法的key参数在Map中对应的value不为null,该方法将
 * 使用remappingFunction根据原key、value计算一个新的结果，如果计算结果不为null,则使用该结果覆盖原来的value；如果计算结果为null,则删除原
 * key-value对
 * void forEach(BiConsumer action):该方法是java8为Map新增加的一个遍历key-value对的方法，通过该方法可以更简洁地遍历Map的key-value对
 * Object getOrDefault(Object key,V defaultValue):获取指定key对应的value。如果该key不存在，则返回defaultValue
 * Object merge(Object key,Object value,BiFunction remappingFunction):该方法会先根据key参数获取该Map中对应的value。如果获取的value为null
 * 则直接用传入的value覆盖原来的value（在这种情况下，可能要添加一组key-value对）；如果获取的value不为null,则使用remappingFunction函数根据
 * 原value、新value计算一个新的结果，并且得到的结果去覆盖原来的value
 * Object putIfAbsent(Object key,Object value):该方法会自动检测指定key对应的value是否为null，如果该key对应的value为null，该方法将会
 * 用新value代替原来的null值
 * Object replace(Object key,Object value):将Map中指定key对应的value替换成新value。与传统put()方法不同的是，该方法不可能添加新
 * 的key-value对。如果尝试替换的key在原Map中不存在，该方法不会添加key-value对，而是返回null
 * boolean replace(K key,V oldValue,V newValue):将Map中指定key-value对的原value替换成新value。如果在Map找到指定的key-value对，则
 * 指定的key-value对，则执行替换并返回true，否则返回false
 * void replaceAll(BiFunction function):该方法使用BiFunction对原key-value对执行计算，并且计算结果作为该key-value对的value值
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map;