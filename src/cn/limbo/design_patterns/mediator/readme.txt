例子：
    有三个类，A，B，C其中A中的数据比B中的数据小10倍，C类小于B但是大于A
分析：
    ABC三个类都有关系，呈现出一种网格关系状态，只有三个类还好，但是同事关系类多起来了
    整个框架的耦合度极高，所以需要抽象出一个控制类用于ABC之间的通信关联
实现模式：中介者模式