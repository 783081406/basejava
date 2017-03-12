/**
 * Created by ccjjltx on 2017/3/12.
 * LinkedHashMap也使用双向链表来维护key-value对的次序（其实只需要考虑key的次序），该链表负责维护Map的迭代顺序，迭代顺序与key-value对的出加入顺序保持一致
 * LinkedHashMap可以避免对HashMap、Hashtable里的key-value对进行排序（只要插入key-value对保持顺序即可），同时又避免使用TreeMap说增加的成本。
 * LinkedHashMap需要维护元素的插入顺序，因此性能略低于HashMap的性能；但因为它以链表来维护内部顺序，所以在迭代访问Map里的全部元素时将有更好的性能。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.hashmap.linkedhashmap;