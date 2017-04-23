/**
 * Created by ccjjltx on 2017/4/22.
 * java5新增了一个Executors工厂类类生产线程池，几个静态方法来创建线程池：
 * 返回一个ExecutorService对象，该对象代表一个线程池，他可以执行Runnable对象或Callable对象所代表的线程
 * newCacheThreadPool():创建一个具有缓冲功能的线程池，系统根据需要创建线程，这些线程将会被缓冲在线程池中
 * newFixedThreadPool(int nThreads):创建一个可重用的，具有固定线程数的线程池
 * newSingleThreadExecutor():创建一个只有单线程的线程池，它相当于调用newFixedThread Pool()方法时传入参数为1
 * <p>
 * 返回一个ScheduledExecutorService线程池，它是ExecutorService的子类，可以在指定延迟后执行线程任务
 * newScheduledThreadPool(int corePoolSize):创建具有指定线程数的线程池，它可以在指定延迟后执行线程任务。corePoolSize指池中
 * 所保存的线程数，即使线程是空闲的也被保留在线程池内
 * newSingleThreadScheduledExecutor():创建只有一个线程的线程池，他可以在指定延迟后执行线程任务
 * <p>
 * java8新增可以充分利用CPU并行的能力，这两个方法生成的work stealing池，都相当于后台线程池，如果所有的前台线程池都失望了，work stealing池中
 * 的线程会自动死亡
 * ExecutorService newWorkStealingPool(int parallelism):创建持有足够的线程的线程池来支持给定的并行级别，该方法还会使用多个队列
 * 来减少竞争
 * ExecutorService newWorkStealingPool():该方法是前一个方法的简化版本，如果当前及其有4个CPU，则目标并行级别被设置为4，也就是相当于前一个
 * 方法传入4作为参数
 * <p>
 * ExecutorService代表尽快执行线程的线程池(只要线程池中有空闲线程，就立即执行线程任务),程序只要将一个Runnable对象或Callable对象(代表线程任务)
 * 提交给线程池，该线程池就会尽快执行该任务，提供如下三个方法：
 * Future<?> submit(Runnable task):将一个Runnable对象提交给指定的线程池，线程池将在有空闲线程时执行Runnable对象代表的任务。
 * 其中Future对象代表Runnable任务的返回值——但run()方法没有返回值，所以Future对象将在run()方法执行结束返回null.但可以调用Future的
 * isDone()、isCancelled()方法来获得Runnable对象的执行状态
 * <T> Future<T> submit(Runnable task,T result):将一个Runnable对象提交到指定的线程池，线程池将在有空闲时执行Runnable对象代表的任务。其中result
 * 显式指定线程执行结束后的返回值，多以Future对象将在run()方法执行结束后返回result
 * <T> Future<T> submit(Callable<T> task):将一个Callable对象提交给指定的线程池，线程池将在有空闲线程时执行Callable对象代表的任务。其中Future代表Callable
 * 对象的call()方法的返回值.
 * <p>
 * ScheduledExecutorService代表可在指定延迟后或周期性地执行线程任务的线程池，4个方法：
 * ScheduleFuture<V> schedule(Callable<V> callable,long delay,TimeUnit unit):指定callable将在delay延迟后执行
 * ScheduleFuture<?> schedule(Runnable command,long delay,TimeUnit unit):指定command任务将在delay延迟后执行，而且以设定频率重复执行。也就是说，在
 * initialDelay后开始执行，依次依次在initialDelay+period、initialDelay+2*period...处重复执行，依次类推。
 * ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,long initialDelay,long delay,TimeUnit unit):创建并执行一个在给定初始延迟后首次启用的
 * 定期操作，随后在每一次执行终止和下一执行开始之间都存在给定的延迟。如果任务在任一次执行时遇到异常，就会取消后续执行；否者，只能通过程序来显式
 * 取消或终止该任务
 * <p>
 * 使用线程池执行线程任务的步骤如下：
 * 1.调用Executors类的静态工厂方法创建一个ExecutorService对象，该对象代表一个线程池
 * 2.创建Runnable实现类或Callable实现类的实例类的实例，作为线程执行任务
 * 3.调用ExecutorService对象的submit()方法来提交Runnable实例或Callable实例
 * 4.当不想提交任何任务时，调用ExecutorService对象的shutdown()方法来关闭线程池
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.executors;