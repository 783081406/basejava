/**
 * Created by ccjjltx on 2017/3/20.
 * method类和它从member类继承而来的方法使得我们可以莫得方法声明的完整信息：
 * boolean	equals(Object obj):将此方法与指定的对象进行比较。
 * AnnotatedType  getAnnotatedReturnType():返回一个AnnotatedType对象，它表示使用一个类型来指定由此可执行文件表示的方法/构造函数的返回类型。
 * <T extends Annotation> T	getAnnotation(Class<T> annotationClass):如果此类注释存在，则返回此元素对指定类型的注释，否则返回null
 * Annotation[]	getDeclaredAnnotations():返回直接出现在此元素上的注释。
 * Class<?>	getDeclaringClass():返回表示声明由此对象表示的可执行文件的类或接口的Class对象。
 * Object	getDefaultValue():返回由此Method实例表示的注释成员的默认值。
 * Class<?>[]	getExceptionTypes():返回一个Class对象数组，这些对象表示声明为由此对象表示的底层可执行程序抛出的异常类型。
 * Type[]	getGenericExceptionTypes():返回一个Type对象数组，它们表示此可执行对象声明要抛出的异常。
 * Type[]	getGenericParameterTypes():返回一个Type对象数组，它们以声明顺序表示由此对象表示的可执行文件的形式参数类型。
 * Type	getGenericReturnType():返回一个Type对象，该对象表示此Method对象表示的方法的形式返回类型。
 * int	getModifiers():返回此对象表示的可执行文件的Java语言修饰符。
 * String	getName():返回此Method对象表示的方法的名称
 * Annotation[][]	getParameterAnnotations():返回一个Annotations二维数组，它以声明顺序表示此对象所表示的可执行文件的形式参数上的注释
 * int	getParameterCount():返回由此对象表示的可执行文件的形式参数数（无论是显式声明还是隐含声明，或不返回）。
 * Class<?>[]	getParameterTypes():返回一个Class对象数组，该对象表示此对象所表示的可执行文件的声明顺序中的形式参数类型。
 * Class<?>	getReturnType():返回一个Class对象，该对象表示此Method对象表示的方法的形式返回类型。
 * TypeVariable<Method>[]	getTypeParameters():Returns an array of TypeVariable objects that represent the type variables declared
 * by the generic declaration represented by this GenericDeclaration object, in declaration order.
 * int	hashCode():
 * Object	invoke(Object obj, Object... args):在指定的具有指定参数的对象上调用此Method对象表示的底层方法。
 * boolean	isBridge():如果此方法是bridge method，则返回true; 否则返回false。
 * boolean	isDefault():如果此方法是默认方法，则返回true; 否则返回false。
 * boolean	isSynthetic():Returns true if this executable is a synthetic construct; returns false otherwise.
 * boolean	isVarArgs():如果此可执行文件声明为采用可变数量的参数，则返回true; 否则返回false。
 * String	toGenericString():返回描述此方法的字符串，包括类型参数。
 * String	toString()
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.reflect.rmethod;