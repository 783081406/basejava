/**
 * Created by ccjjltx on 2017/3/14.
 * (01) 函数接口不同
 * Enumeration只有2个函数接口。通过Enumeration，我们只能读取集合的数据，而不能对数据进行修改。
 * Iterator只有3个函数接口。Iterator除了能读取集合的数据之外，也能数据进行删除操作。
 * <p>
 * (02) Iterator支持fail-fast机制，而Enumeration不支持。
 * Enumeration 是JDK 1.0添加的接口。使用到它的函数包括Vector、Hashtable等类，这些类都是JDK 1.0中加入的，Enumeration存在
 * 的目的就是为它们提供遍历接口。Enumeration本身并没有支持同步，而在Vector、Hashtable实现Enumeration时，添加了同步。
 * 而Iterator 是JDK 1.2才添加的接口，它也是为了HashMap、ArrayList等集合提供遍历接口。Iterator是支持fail-fast机制的：当
 * 多个线程对同一个集合的内容进行操作时，就可能会产生fail-fast事件。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.enumeration;