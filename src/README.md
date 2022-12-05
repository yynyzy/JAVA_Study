# JAVA 学习笔记

## JAVA 基础

- 使用 javac + 文件名 将文件编译为 class字节码文件，然后通过 java + 文件名 运行 class 文件。
- 文档注： javadoc -d 文件夹名 -xx -yy Demo.java
- java 赋值或运算时，精度小的会往精度大的转换。（byte，short，char 之间不会自动转化，三者运算计算结果为 int 类型）
- 面向对象三大特征：
  - 封装（encapsualton）
  - 继承（extend）
  - 多态（）
- 访问修饰符
  - 访问级别    访问控制修饰符    同类    同包     子类  不同包
  - 公开         public        1      1       1       1
  - 受保护       protected     1      1       1        0
  - 默认         没有修饰符     1     1       0        0
  - 私有         private       1    0       0        0
