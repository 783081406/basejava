/**
 * Created by ccjjltx on 2017/3/14.
 * 提供了艺哥操作Set、List和Map等集合的工具类；
 * 该工具类里提供了大量方法对集合元素进行排序、查询和修改等操作，还提供了将集合对象设置为不可变、对集合对象实现同步控制等方法
 * 对List集合进行排序操作：
 * void reverse(List list):反转指定List集合中元素的顺序
 * void shuffle(List list):对List集合元素进行随机排序（shuffle方法模拟了"洗牌"动作)
 * void sort(List list):根据元素的自然顺序对指定List集合的元素按升序进行排序
 * void sort(List list,Comparator c):根据制定Comparator产生的顺序对List集合元素进行排序
 * void swap(List list,int i,int j);将指定List集合中的i处元素和j处元素进行交换
 * void rotate(List list,int distance):但distance为正数时，将list集合的后distance个元素"整体"移到前面；当distance为负数时，
 * 将list集合的前distance个元素"整体"移到后面。该方法不会改变集合的长度
 * <p>
 * Collections提供的用于查找、替换集合元素的类方法：
 * int binarySearch(List list,Object key):使用二分搜索法指定的List集合，以获得指定对象在List集合中的索引。如果要使用该方法可以
 * 正常工作，则必须保证List中元素已经处于有序状态。
 * Object max(Collection coll):根据元素的自然顺序，返回给定集合中的最大元素
 * Object max(Collection coll,Comparator comp):根据Comparator指定的顺序，返回给定集合中的最大元素
 * Object min(Collection coll):根据元素的自然排序，返回给定集合中的最小元素
 * Object min(Collection coll,Comparator comp):根据Comparator指定的顺序，返回给定集合中的最小元素
 * void fill(List list,Object obj):使用指定元素obj替换指定List集合中的所有元素
 * int frequency(Collection c,Object 0):返回指定集合中指定元素的出现次数
 * int indexOfSubList(List source,List target):返回子List对象在父List对象中第一次出现的位置索引：如果父List中没有出现这样的子List,返回-1
 * int lastIndexOfSubList(List source,List target):返回子List对象在父List对象中最后一个出现的位置索引；如果父List中没有出现这样的子List，则
 * 返回-1
 * boolean replaceAll(List list,Object oldVal,Object newVal):使用一个新值newVal替换List对象的所有旧值oldVal.
 * <p>
 * 同步控制：
 * 可见指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
 * 常用集合框架中的实现类HashSet,TreeSet,ArrayList,ArrayDeque,LinkedList,HashMap和TreeMap都是线程不安全的。
 * static Collection<T> synchronizedCollection(Collection<T> c):
 * static List<T> synchronizedList(List<T> list):
 * static Map<K,V> synchronizedMap(Map<K,V> list):
 * static NavigableMap<K,V>  synchronizeNavigableMap(NavigableMap<K,V> m)
 * static Set<T> synchronizedSet(Set<T> s)
 * static SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m)
 * static SortedSet<T> synchronizedSortedSet(SortedSet<T> s)
 * <p>
 * 返回不可变集合：
 * emptyXxx():返回一个空的，不可变的集合对象，此处的集合既可以是List，也可以是SortedSet、Set还可以是Map，SortedMap等
 * static Enumeration<T> emptyEnumeration():
 * static Iterator<T> emptyIterator():
 * static List<T> emptyList():
 * static ListIterator<T> emptyListIterator():
 * static Map<K,V> emptyMap():
 * static NavigableMap<K,V> emptyNavigableMap():
 * static NavigableSet<E> emptyNavigableSet():
 * static Set<T> emptySet():
 * static SortedMap<K,V> emptySortedMap():
 * static SortedSet<E> emptySortedSet():
 * static SortedSet<T> emptySortedSet():
 *
 * singletonXxx():返回一个只包含指定对象（只有一个或一项元素）的、不可变的集合对象，此处的集合既可以是List，还可以是Map
 * static Set<T> singleton(T o):
 * static List<T> singletonList(T o):
 * static Map<K,V> singletonMap(K key,V value):
 *
 * unmodifiableXxx():返回指定集合对象的不可变试图，此处的集合既可以是List,也可以是Set,SortedSet,还可以Map,SortedMap等
 * static Collection<T> unmodifiableCollection(Collection<T> c):
 * static List<T> unmodifiableList(List<T> c):
 * static Map<K,V> unmodifiableMap(Map<T> m):
 * static NavigableMap<K,V> unmodifiableNavigableMap(NavigableMap<T> m):
 * static NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> m):
 * static Set<T> unmodifiableSet(Set<T> s):
 * static SortedMap<K,V> unmodifiableSortedMap(SortedMap<K,V> m):
 * static SortedSet<T> unmodifiableSortedSet(SortedSet<T> s):
 *
 * 上面三类方法的参数是原来集合对象，返回值是该集合的”只读“版本。通过Collections提供的三类方法，可以生成”只读“的Collection或Map
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.collections;