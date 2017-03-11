/**
 * Created by ccjjltx on 2017/3/11.
 * Deque接口是Queue的子接口，它代表一个双端队列，Deque接口里面定义了一些双端队列的方法，这些方法允许从双端擂操作队列的元素
 * void addFirst(Object e):将指定的元素插入的双端队列的开头
 * void addLast(Object e):将指定的元素插入到双端队列的末尾
 * Iterator descendingIterator():返回该双端队列对应的迭代器，该迭代器将以逆向顺序来迭代队列中的元素
 * Object getFirst():获取但不删除双端队列的第一个元素
 * Object getLast():获取但不删除双端队列的最后一个元素
 * boolean offerFirst(Object e):将指定元素插入该双端队列的开头
 * boolean offerLast(Object e):将指定元素插入该双端队列的末尾
 * Object peekFirst():获取但不删除该双端队列的第一个元素；如果此双端队列为空，则返回null
 * Object peekLast():获取但是不删除该双端队列的最后一个元素：如果此双端队列为空，则返回null
 * Object pollFirst():获取并删除该双端队列的第一个元素；如果此双端队列为空，则返回null
 * Object pollLast():获取并删除该双端队列的最后一个元素；如果此双端队列为空，则返回null
 * Object pop()(栈方法):pop出该双端队列所表示的栈的栈顶元素。相当于removeFirst().
 * void push(Object e)(栈方法):将一个元素push进该双端队列所表示的栈的栈顶。相当于addFirst(e).
 * Object removeFirst():获取并且删除该双端队列的第一个元素
 * Object removeFirstOccurrence(Object o):删除该双端队列的第一次出现的元素o
 * Object removeLast():获取并且删除该双端队列的最后一个元素
 * boolean removeLastOccurrence(Object o):删除该双端队列的最后一次出现的元素o
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.queue.deque;