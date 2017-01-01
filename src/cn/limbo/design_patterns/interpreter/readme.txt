例子1：
    实现加减法的指令，如 1 + 2 + 3 + 4 - 5 + 6 - 7
分析：
    +, - 为操作性指令，以操作性指令构建一个树形结构
实现方式：
    解释器模式


例子2：
    Sunny软件公司欲为数据库备份和同步开发一套简单的数据库同步指令，通过指令可以对数据库中的数据和结构进行备份，
例如，输入指令“COPY VIEW FROM srcDB TO desDB”表示将数据库srcDB中的所有视图(View)对象都拷贝至数据库desDB；
输入指令“MOVE TABLE Student FROM srcDB TO desDB”表示将数据库srcDB中的Student表移动至数据库desDB。
试使用解释器模式来设计并实现该数据库同步指令。
分析：
    大致上可以做如下的分类：1.操作性指令：COPY，MOVE 2.介词：FROM，TO 3.类型：TABLE，VIEW。
实现方式：
    解释器模式
