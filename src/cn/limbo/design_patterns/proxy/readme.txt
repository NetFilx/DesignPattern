例子：
    某软件公司承接了某信息咨询公司的收费商务信息查询系统的开发任务，该系统的基本需求如下：
   (1) 在进行商务信息查询之前用户需要通过身份验证，只有合法用户才能够使用该查询系统；
   (2) 在进行商务信息查询时系统需要记录查询日志，以便根据查询次数收取查询费用。
   该软件公司开发人员已完成了商务信息查询模块的开发任务，现希望能够以一种松耦合的方式向原有系统增加身份验证和日志记录
   功能，客户端代码可以无区别地对待原始的商务信息查询模块和增加新功能之后的商务信息查询模块，而且可能在将来还要在该信
   息查询模块中增加一些新的功能。
分析：
    真实的查询是被代理的对象，代理类需要做的是控制被代理对象，这里就是查询信息这个类，而身份验证和日志输出只是相应的
    控制
实现方式：
    代理模式
代理模式和装饰模式的区别：
    1.装饰模式的核心是加强功能，代理模式的核心是控制
    2.代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，
    只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
    3.代理类的被代理对象在代理类被创建的时候就已经被确定了，而装饰类的对象在需要装饰的时候才知道装饰的对象是什么