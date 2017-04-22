/**
 * Created by ccjjltx on 2017/4/22.
 * BlockingQueue也是Queue子接口，但它的主要用途并不是作为容器，而是作为线程同步工具。
 * BlockingQueue具有一个特征：当生产者线程试图先BlockingQueue中放入元素时，如果该队列已满，则该线程被阻塞；但消费者线程试图从
 * BlockingQueue中去除元素时候，如果该队列已经空，则该线程被阻塞
 * 提供两个支持阻塞方法：
 * put(E e):尝试把E元素放入BlockingQueue中，如果该队列的元素已满，则阻塞该线程
 * take():尝试从BlockingQueue的头部取出元素，如果该队列的元素已空，则阻塞该线程
 * <p>
 * BlockingQueue继承了Queue接口，当然也可使用Queue接口中的方法，归纳起来分为三组：
 * 在队列尾部插入元素，包括add(E e)、offer(E e)和put(put e)方法，当该队列已满时，这三个方法分别会抛出异常，返回false、阻塞队列
 * 在队列头部删除并且返回删除的元素。包括remove()、poll()和take()方法。当该队列已空时，这三个方法分别会抛出异常、返回false、阻塞队列
 * 在队列头部取出但不删除元素。包括element()和peek()方法，当队列已空时，这两个方法分别抛出异常、返回false
 * <p>
 * BlockingQueue的5个实现类：
 * ArrayBlockingQueue:基于数组实现的BlockingQueue队列
 * LinkedBlockingQueue:基于链表实现的BlockingQueue队列
 * PriorityBlockingQueue:它并不是标准的阻塞队列。与前面接收的PriorityQueue类似，该队列调用remove()、poll()、take()等方法取出元素时候，
 * 并不是取出队列中存在时间最长的元素，而是队列中最小的元素。PriorityBlockingQueue判断元素的大小即可根据元素(实现Comparable接口）
 * 的本身大小来自然排序，也可使用Comparator进行定制排序
 * SynchronousQueue:同步线程。对该队列的存、取操作必须交替进行
 * DelayQueue:它是一个特殊的BlockingQueue，底层基于PriorityBlockingQueue实现。不过DelayQueue要求集合元素都实现Delay接口（该接口里只有一个
 * long getDelay()方法),DelayQueue根据集合元素的getDelay()
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.blocking;