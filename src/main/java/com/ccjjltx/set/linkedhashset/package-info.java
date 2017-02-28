/**
 * Created by ccjjltx on 2017/2/28.
 * LinkedHashSet集合也是根据元素的hashCode值来决定元素的存储位置，但它可以使用链表维护元素的次序
 * 这样是的元素看起来是以插入的顺序保存的，也就是说，但遍历LinkedHashSet集合里的元素时
 * LinkedHashSet将会按元素的添加顺序来访问集合里面的元素
 * LinkedHashSet需要维护元素的插入顺序，因此性能略低于HashSet的性能，但在迭代访问Set里面全部元素时将会很好的性能
 * 因此它以链表来维护内部顺序
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.set.linkedhashset;