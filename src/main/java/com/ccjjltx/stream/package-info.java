/**
 * Created by ccjjltx on 2017/2/28.
 * 对聚合操作的使用归结为3个部分：
 * 1.数据源部分：通过stream()方法，取得集合对象的数据集（创建Stream）
 * 2.通过一系列中间（Intermediate)方法，对数据集进行过滤、检索、排序、匹配、抽取等数据集的再次处理
 * （转换stream，每次转换成原来stream对象不改变，返回一个新Stream对象，可多次转换）
 * 3.通过最终(terminal)方法完成对数据集中元素的处理(对Stream进行聚合(Reduce)操作，获取想要的结果)
 *
 * ======================中间方法：中间操作允许流保持打开状态，并允许直接调用后续方法。返回值是另一个流===========
 * filter(Predicate predicate):过滤Stream中所有不符合predicate的元素
 * mapToXxx(ToXxxFunction mapper):对Stream中包含的元素使用给定的转换函数进行转换操作，新生成的Stream只包含转换生成的元素
 * 方法分别是：mapToInt,mapToLong和mapToDouble。比如mapToInt就是把原始Stream转换成一个新Stream，这个新生成的Stream中的元素
 * 都是int类型。之所以有这三种变种方法，可以免除自动装箱/拆箱的额外消耗
 * flatMap:和map相似，不同的是每个元素转换得到的是Stream对象，会把子Stream中的元素压缩到父集合中
 * peek(Consumer action):依次对每个元素执行一些操作，该方法返回的流与原来流包含相同的元素。该方法主要用于调试
 * limit(long maxSize):该方法用于保证对该留的后续访问中最大允许访问的元素个数
 * skip(long n):返回一个丢弃原Stream的前N个元素后剩下元素组成的新Stream，如果原Stream中包含的元素个数小于N，那个返回空Stream
 * sorted():该方法用于保证流中的元素在后续的访问中处于有序状态
 * ======================末端方法：末端方法是对流的最终操作。当对某个Stream执行末端方法后，该流将会被消耗且不再可用=====
 * forEach(Consumer action):遍历流中所有元素，对每个元素执行action
 * toArray():将流中所有元素转换成一个数组
 * reduce():该方法有三个重载的版本，都用于通过某个操作来合并流中的元素
 * min():返回流中所有元素的最小值
 * max():返回流中所有元素的最大值
 * count():返回流中所有元素的数量
 * boolean anyMatch(Predicate predicate):判断流中是否至少包含一个元素符合Predicate条件
 * allMatch(Predicate predicate):判断流中是否每个元素都符合Predicate条件
 * noneMatch(Predicate predicate):判断流中是否所有元素都不符合Predicate条件
 * findFirst():返回流中的第一个元素
 * findAny():返回流中的任意一个元素
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.stream;