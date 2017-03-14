/**
 * Created by ccjjltx on 2017/3/14.
 * WeakHashMap和HashMap的用法基本相似。与HashMap的区别在于，HashMap的key保留了对实际对象的强引用，这意味着只要该HashMap对象
 * 不被销毁，该HashMap里所有的key所引用的对象就不会被垃圾回收，HashMap也就不会自动删除这些key所对应的key-value对；但WeakHashMap的
 * key只保留了对实际对象的弱引用，这意味着如果WeakHashMap对象的key所引用的对象没有被其他强引用变量说引用，这些key所引用的
 * 对象可能被垃圾回收，WeakHashMap也可能自动删除这些key对应的key-value对
 * WeakHashMap中的每个key对象只持有对实际对象的弱引用，因此，当垃圾回收了该key所对应的实际对象之后，WeakHashMap会自动删除该
 * key对应的key-value对
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.weakhashMap;