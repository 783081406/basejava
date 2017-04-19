/**
 * Created by ccjjltx on 2017/4/19.
 * java.nio.file.attribute包下提供了大量的工具类，通过这些工具类，开发者可以简单地读取、修改文件属性
 * XxxAttributeView:代表某种文件属性的"视图"
 * XxxAttributes:代表某种文件属性的"集合",程序一般通过XxxAttributeView对象来获取XxxAttributes
 * <p>
 * 父接口:FileAttributeView
 * <p>
 * AclFileAttributeView:通过AclFileAttributeView,开发者可以为特定文件设置ACL(Access Control List)及文件所有者属性。它的getAcl()方法
 * 返回List<AclEntry>对象，该返回值代表了该文件的权限集。通过setAcl(List)方法可以修改该文件的ACL
 * <p>
 * BasicFileAttributeView:它可以获取或修改文件的基本属性，包括文件的最后修改时间、最后访问时间、创建时间、大小、是否为目录、是否为符号链接等。它
 * 的readAttributes()方法返回一个BasicFileAttributes对象，对文件夹基本属性的修改是通过BasicFileAttributes对象完成的
 * <p>
 * DosFileAttributeView:它主要用于获取或修改文件DOS相关属性，比如文件时候只读，是否隐藏，是否为系统文件，是否是存档文件等。
 * 它的readAttributes()方法返回一个DosFileAttributes对象，对这些属性的修改其实是由DosFileAttributes对象来完成的
 * <p>
 * FileOwnerAttributeView:它主要用于获取或修改文件的所有者。它的getOwner()方法返回一个UserPrincipal对象来代表文件所有者；
 * 也可调用setOwner(UserPrincipal owner)方法来改变文件的所有者
 * <p>
 * PosixFileAttributeView:它主要用于获取或修改POSIX(Portable Operating System Interface of INIX )属性，他的readAttributes()方法返回一个
 * PosixFileAttributes对象，该对象可以用于获取或修改文件的所有者，组所有者，访问权限信息（就是UNIX的chmod命令负责干的事情）。这个View只在UNIX、Linux
 * 等系统上有用
 * <p>
 * UserDefinedFileAttributeView:它可以让开发者为文件设置一些自定义属性。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio2.attribute;