package com.$22_FileAndIOStream;

/*
    IO流:
        是存储和读取数据的解决方案, 用于读写文件中的数据
        数据的传输, 可以看做是一种数据的流动, 以内存为基准, 分为输入(input)和输出(output)
        流向内存 ==> 输入流, 读取数据; 流出内存 ==> 输出流, 写出数据
    IO分类:
        1. 按照数据的流向:
            a. 输入流: 把数据从其他设备上读取到内存中
            b. 输出流: 把数据从内存中写出到其他设备上
        2. 根据数据的类型:
            a. 字节流: 以字节为单位, 读写数据, 可以操作所有类型的文件
            b. 字符流: 以字符为单位, 读写数据, 只能操作纯文本文件
    JavaIO流体系:
        Java中I/O操作主要是指使用`java.io`包下的内容
        字节流:
            以字节为单位, 读写数据, 可以操作所有类型的文件
            InputStream: 字节输入流, 属于抽象类, 是字节输入流的父类
            OutputStream: 字节输出流, 属于抽象类, 是字节输出流的父类
        字符流:
            以字符为单位, 读写数据, 只能操作纯文本文件
            Reader: 字符输入流, 属于抽象类, 是字符输入流的父类
            Writer: 字符输出流, 属于抽象类, 是字符输出流的父类
 */

public class $2_IOStreamSummarize {
}
