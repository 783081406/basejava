/**
 * Created by ccjjltx on 2017/4/19.
 * Files提供了两个方法来遍历文件和子目录：
 * walkFileTree(Path start,FileVisitor<? super Path> visitor):遍历start路径下的所有文件和子目录
 * walkFileTree(Path start,Set<FileVisitOption> options,int maxDepth,FileVisitor<? super Path> visitor):与上一个方法的功能类似。
 * 该方法最多遍历maxDepth深度的文件
 * <p>
 * FileVisitor代表一个文件访问器，walkFileTree()方法会自动遍历start路径下的所有文件和子目录，遍历文件和子目录都会"触发"FileVisitor中相应的方法
 * FileVisitResult postVisitDirectory(T dir,IOException exc):访问子目录之后触发该方法
 * FileVisitResult preVisitDirectory(T dir,BasicFileAttributes attrs):访问子目录之前触发该方法
 * FileVisitResult visitFile(T file,BasicFileAttributes attrs):访问file文件时触发该方法
 * FileVisitResult visitFileFailed(T file,IOException exc):访问file文件失败时触发该方法
 * <p>
 * FileVisitResult，它是一个枚举类，代表了访问之后的后续行为
 * CONTINUE：代表"继续访问"的后续行为
 * SKIP_SIBLINGS：代表"继续访问"的后续行为，但不访问该文件或目录的兄弟文件或目录
 * SKIP_SUBTREE:代表"继续访问"的后续行为，但不访问该文件或目录的子目录树
 * TERMINATE：代表"终止访问"的后续行为
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio2.filevisitor;