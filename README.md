# SoftwareDesign
java之软件设计
===

#### 迭代器模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/IteratorPattern <br>
#### 观察者模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/ObserverPattern<br>
#### 装饰器模式: https://github.com/nuclearenergyant/SoftwareDesign/tree/master/DecoratorPattern/src/demo01
#### 抽象工厂模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/AbstractModel
#### 组合模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/CombinationMode
java之组合模式——文件夹~文件问题（透明模式）
#### 命令模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/CommandPattern
#### 代理模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/ProxyPattern
#### 外观模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/FacadePattern
java之外观模式（文件加密）：

某系统需要提供一个文件加密模块，加密流程包括三个操作，分别是读取源文件、加密、保存加密之后的文件。 这三个操作相对独立，其业务代码封装在三个不同的类中。现需要提供一个统一的加密外观类，用户可以直接使用该外观类完成文件的读取、加密和保存三个操作。 要求使用Java和外观模式来实现该加密模块。

现用户需要更换加密方式，请引入抽象外观类重新设计该加密模块，要求符合开闭原则
#### 克隆模式 （原型模式）：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/Prototype
#### 策略模式 ：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/StrategyPattern
例题：
某软件公司为某电影院开发了一套影院售票系统，在该系统中需要为不同类型的用户提供不同的电影票打折方式，具体打折方案如下：
(1) 学生凭学生证可享受票价8折优惠。
(2) 年龄在10周岁及以下的儿童可享受每张票减免10元的优惠（原始票价需大于等于20元）。
(3) 影院VIP用户除享受票价半价优惠外还可进行积分，积分累计到一定额度可换取电影院赠送的奖品。
该系统在将来可能还要根据需要引入新的打折方式。
#### 职责链模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/BehavioralPattern

某企业的SCM(Supply Chain Management，供应链管理)系统中包含一个采购审批子系统。该企业的采购审批是分级进行的，即根据采购金额的不同由不同层次的主管人员来审批，主任可以审批5万元以下（不包括5万元）的采购单，副董事长可以审批5万元至10万元（不包括10万元）的采购单，董事长可以审批10万元至50万元（不包括50万元）的采购单，50万元及以上的采购单就需要开董事会讨论决定。
