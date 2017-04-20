/**
 * Created by ccjjltx on 2017/4/20.
 * 对于绝大多数的应用程序来说，通常要求有一个主线程，但也可以在该线程内创建多条执行流，这些顺序执行流就是线程，每个县城也是互相独立的
 * <p>
 * 一个线程必须有一个父进程。线程可以拥有自己的堆栈、自己的位置计数器和自己的局部变量，但不拥有系统资源，它与父进程的其他线程
 * 共享该进程所拥有的全部资源。因为多个线程共享父进程里的全部资源，因为多个线程共享父进程里的全部资源，因此编程更加方便；但必须更加小心，
 * 因为需要确保线程不会妨碍同一进程里的其他线程
 * <p>
 * 线程可以完成一定的任务，可以与其他线程共享父进程中的共享变量及部分环境，相互之间协同来完成进程所要完成的任务
 * <p>
 * 线程是独立运行的，它并不知道进程中是否还有其他线程存在。线程的执行是抢占式的，也就是说当前运行的线程在任何时候都可能被挂起，一边另外一个线程很可以运行
 * <p>
 * 一个线程可以创建和撤销另一个线程，同一个进程中的多个线程之间可以并发执行。
 * <p>
 * 创建线程的三种方法：
 * 1.继承Thread
 * 2.继承Runnable
 * 3.Callable接口（可以看作是Runnable接口的增强版，Callable接口提供了call()方法比run()方法功能更强大）
 * <p>
 * Future接口下的几个方法：
 * boolean cancel(boolean myInterruptIfRunning):试图取消该Future里关联的Callable任务
 * V get():返回Callable任务里call()方法的返回值。调用该方法将导致程序阻塞，必须等到子线程结束后才会得到返回值
 * V get(long timeout,TimeUnit unit):返回Callable任务里call()方法的返回值。该方法让程序最多阻塞timeout和unit指定的时间，如果经过
 * 指定时间后Callable任务依然没有返回值，将会抛出TimeoutException异常
 * boolean isCancelled():如果在Callable任务正常完成前被取消，则返回true
 * boolean isDone():如果Callable任务已完成，则返回true
 * <p>
 * 创建并启动有返回值的线程的步骤：
 * 1.创建Callable接口的实现类，并实现call()方法，该call()方法，该call()方法将作为线程执行体，且该call()方法有返回值，再创建Callable实现类的实例
 * 也可以直接使用Lambda表达式创建Callable对象
 * 2.使用FutureTask类来包装Callable对象，该FutureTask对象封装了该Callable对象的call()方法的返回值
 * 3.使用FutureTask对象作为Thread对象的target创建并启动新线程
 * 4.调用FutureTask对象的get()方法来获取子线程执行结束后的返回值
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread;