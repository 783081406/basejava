/**
 * Created by ccjjltx on 2017/3/19.
 * 首先要生成Class对象，然后再生成Instance
 * 其中Class对象的生成方式主要有三种：
 * 1.Class.forName("类名字符串"):(类名字符串都必须要全称，包名+类名）
 * 2.类名.class
 * 3.实例对象.getClass()
 * <p>
 * 方法：
 * <U> Class<? extends U>	asSubclass(Class<U> clazz):强制转换这个Class对象以表示由指定的类对象表示的类的子类。
 * T	cast(Object obj):将对象转换为由此Class对象表示的类或接口。
 * boolean desiredAssertionStatus():返回将分配给此类的断言状态（如果在调用此方法时要初始化该类）
 * static Class<?>	forName(String className):返回与具有给定字符串名称的类或接口关联的Class对象。
 * static Class<?>	forName(String name, boolean initialize, ClassLoader loader):使用给定的类装载器返回与具有给定字符串名称的类或接口关联的Class对象。
 * AnnotatedType[]	getAnnotatedInterfaces():返回一个AnnotatedType对象的数组，它们表示使用类型来指定由此Class对象表示的实体的超级接口。
 * AnnotatedType	getAnnotatedSuperclass():返回一个AnnotatedType对象，它表示使用类型来指定由此Class对象表示的实体的超类。
 * <A extends Annotation> A	getAnnotation(Class<A> annotationClass):如果此类注释存在，则返回此元素对指定类型的注释，否则返回null。
 * Annotation[] getAnnotations():返回此元素上存在的注释。
 * <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass):返回与此元素相关联的注释。
 * String	getCanonicalName():返回由Java语言规范定义的基础类的规范名称。
 * Class<?>[]	getClasses():返回一个包含Class对象的数组，该对象表示由此Class对象表示的类的成员的所有公共类和接口。
 * ClassLoader	getClassLoader():返回类的类加载器
 * Class<?>	getComponentType():返回表示数组的组件类型的类。
 * Constructor<T>	getConstructor(Class<?>... parameterTypes):返回一个构造函数对象，该对象反映由此Class对象表示的类的指定的公共构造函数。
 * Constructor<?>[]	getConstructors():返回一个包含Constructor对象的数组，该对象反映由此Class对象表示的类的所有公共构造函数。
 * <A extends Annotation> A	getDeclaredAnnotation(Class<A> annotationClass):如果此类注释直接存在，则返回此元素对指定类型的注释，否则返回null。
 * Annotation[]	getDeclaredAnnotations():返回直接出现在此元素上的注释。
 * <A extends Annotation> A[]	getDeclaredAnnotationsByType(Class<A> annotationClass):返回此元素对指定类型的注释（如果此类注释直接存在或间接出现）。
 * Class<?>[]	getDeclaredClasses():返回一个Class对象数组，反映所有声明为由此Class对象表示的类的成员的类和接口。
 * Constructor<T>	getDeclaredConstructor(Class<?>... parameterTypes):返回一个构造函数对象，该对象反映由此Class对象表示的类或接口的指定构造函数。
 * Constructor<?>[]	getDeclaredConstructors():返回一个Constructor对象数组，反映由此Class对象表示的类声明的所有构造函数。
 * Field	getDeclaredField(String name):返回一个Field对象，该对象反映由此Class对象表示的类或接口的指定的已声明字段。
 * Field[]	getDeclaredFields():返回一个Field对象数组，反映由此Class对象表示的类或接口声明的所有字段。
 * Method	getDeclaredMethod(String name, Class<?>... parameterTypes):返回一个Method对象，该对象反映由此Class对象表示的类或接口的指定声明方法。
 * Method[]	getDeclaredMethods():返回一个包含Method对象的数组，该对象反映由此Class对象表示的类或接口的所有声明的方法，包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
 * Class<?>	getDeclaringClass():如果由此Class对象表示的类或接口是另一个类的成员，则返回表示声明它的类的Class对象。
 * Class<?>	getEnclosingClass():返回基础类的直接包装类。
 * Constructor<?>	getEnclosingConstructor():如果这个Class对象在构造函数中表示一个本地或匿名类，则返回一个Constructor对象，该对象表示底层类的直接包含的构造函数。
 * Method	getEnclosingMethod():如果此Class对象表示方法中的本地或匿名类，则返回一个表示基础类的直接包围方法的Method对象。
 * T[]	getEnumConstants():返回此枚举类的元素，如果此Class对象不表示枚举类型，则返回null。
 * Field	getField(String name):返回一个Field对象，该对象反映由此Class对象表示的类或接口的指定公共成员字段。
 * Field[]	getFields():返回一个包含Field对象的数组，该对象反映由此Class对象表示的类或接口的所有可访问的公共字段。
 * Type[]	getGenericInterfaces():返回表示由此对象表示的类或接口直接实现的接口的类型。
 * Type	getGenericSuperclass():返回表示此类所表示的实体（类，接口，基本类型或void）的直接超类的类型。
 * Class<?>[]	getInterfaces():确定由此对象表示的类或接口实现的接口。
 * Method	getMethod(String name, Class<?>... parameterTypes):返回一个Method对象，该对象反映由此Class对象表示的类或接口的指定的公共成员方法。
 * Method[]	getMethods():返回一个包含Method对象的数组，该对象反映由此Class对象表示的类或接口的所有公共方法，包括由类或接口声明的那些方法以及从超类和超级接口继承的类。
 * int	getModifiers():返回此类或接口的Java语言修饰符，以整数编码。
 * String	getName():将由此Class对象表示的实体（类，接口，数组类，基本类型或void）的名称作为String返回。
 * Package	getPackage():获取此类的包。
 * ProtectionDomain	getProtectionDomain():返回此类的ProtectionDomain。
 * URL	getResource(String name):查找具有给定名称的资源。
 * InputStream	getResourceAsStream(String name):查找具有给定名称的资源。
 * Object[]	getSigners():获取此类的签名者
 * String	getSimpleName():返回在源代码中给定的基础类的简单名称
 * Class<? super T>	getSuperclass():返回表示由此类表示的实体（类，接口，基本类型或void）的超类的类
 * String	getTypeName():返回此类型名称的信息字符串。
 * TypeVariable<Class<T>>[]	getTypeParameters():Returns an array of TypeVariable objects that represent the type variables declared by the generic declaration represented by this GenericDeclaration object, in declaration order.
 * boolean	isAnnotation():如果此Class对象表示注释类型，则返回true。
 * boolean	isAnnotationPresent(Class<? extends Annotation> annotationClass):如果此元素上存在指定类型的注释，则返回true，否则返回false。
 * boolean	isAnonymousClass():当且仅当底层类是一个匿名类时返回true。
 * boolean	isArray():确定此Class对象是否表示数组类。
 * boolean	isAssignableFrom(Class<?> cls):确定由此Class对象表示的类或接口是否与由指定的Class参数表示的类或接口相同，或者是其超类或超类接口。
 * boolean	isEnum():当且仅当此类在源代码中被声明为枚举时，返回true。
 * boolean	isInstance(Object obj):确定指定的对象是否与此类表示的对象的赋值兼容。
 * boolean	isInterface():确定指定的Class对象是否表示接口类型。
 * boolean	isLocalClass():当且仅当底层类是local class时返回true。
 * boolean	isMemberClass():当且仅当底层类是成员类时返回true。
 * boolean	isPrimitive():确定指定的Class对象是否表示基本类型。
 * boolean	isSynthetic()如果此类是synthetic class(合成类)，则返回true; 否则返回false。
 * T	newInstance():创建由此Class对象表示的类的新实例。
 * String	toGenericString():返回描述此类的字符串，包括关于修饰符和类型参数的信息。
 * String	toString():
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.reflect.rclass;