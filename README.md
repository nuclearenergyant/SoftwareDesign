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
#### 模板方法模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/TemplateMethodPattern

某软件公司要为某银行的业务支撑系统开发一个利息计算模块，利息的计算流程如下：
(1) 系统根据账号和密码验证用户信息，如果用户信息错误，则系统显示出错提示。
(2) 如果用户信息正确，则根据用户类型的不同使用不同的利息计算公式计算利息（如活期账户和定期账户具有不同的利息计算公式）。
(3) 系统显示利息。
现使用模板方法模式设计该利息计算模块
#### 建造者模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/BuilderPattern
某游戏软件公司决定开发一款基于角色扮演的多人在线网络游戏，玩家可以在游戏中扮演虚拟世界中的一个特定角色，角色根据不同的游戏情节和统计数据（例如力量、魔法、技能等）具有不同的能力，角色也会随着不断升级而拥有更加强大的能力。
作为该游戏的一个重要组成部分，需要对游戏角色进行设计。通过分析发现，游戏角色是一个复杂对象，它包含性别、面容、服装、发型这几个组成部分。其中：
1）“天使”拥有美丽的面容和披肩的长发，并身穿一袭白裙；
2）“恶魔”极其丑陋，留着光头并穿一件刺眼的黑衣。
3）“英雄”拥有英俊的面容，飘逸的长发，并身穿盔甲。
随着该游戏的升级将不断增加新的角色。
现使用建造者模式来模拟实现游戏角色的创建。
#### 适配器模式：https://github.com/nuclearenergyant/SoftwareDesign/tree/master/AdapterPattern/src/demo01
海尔（Haier）、TCL、海信（Hisense）都是家电制造商，它们都生产电视机（Television）、空调（AirConditioner）、冰箱（Fridge）。现需要设计一个系统，描述这些家电制造商以及它们所制造的电器，要求绘制类图并用Java代码模拟实现。

