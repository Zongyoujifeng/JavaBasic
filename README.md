# Java基础学习
## day01
    1.Java入门程序 public static void main(String[] args)相关关键字的含义
    2.《Java编程思想》中提供的简短打印方法进行输出语句的打印
    3.Java操作符
         优先级
         别名问题
         算数操作运算符：+-*/%
    4.初始化
         构造器：专门用来创建对象的方法，当我们通过关键字new来创建对象的时候，其实是在调用构造方法
         注意事项：
         * 1.构造方法的名称必须和所有类名称完全一样
         * 2.构造方法不要写返回值类型，连void都不写
         * 3.构造方法不能return一个具体的返回值
         * 4.如果没有编写任何构造方法，编译器会有一个默认构造方法，什么都不做
         * 5.如果写了一个构造方法，将不再使用默认构造方法
         默认构造器：当行创建一个对象的时候，会调用默认构造器-即使没有明确定义。但如果已经定义了一个构造器（无论是否含参），编译器就不会自动创建默认构造器
         构造器调用必须置于最起始位置，否则编译器会报错
          
         重载 
         方法重载的规则：


​        
​         方法重载
​            1. 方法名一致，参数列表中参数的顺序，类型，个数不同。
​            2. 重载与方法的返回值无关，存在父类和子类，同类中。
​            3. 可以抛出不同的异常，可以有不同的修饰符
​         方法重写的规则：
​         
            1. 参数列表必须完全与被重写的方法一致，返回类型完全与被重写方法的返回类型一致
            2. 构造方法不能被重写，声明为final的方法不能被重写，声明为static的方法不能被重写，但是能够被再次声明
            3. 访问权限不能比父类中被重写的方法的访问权限更低
            4. 重写的方法能够抛出任何非强制异常（UncheckedException，也叫非运行时异常），无论被重写的方法是否抛出异常。
               但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。
## day02
         this 关键字：
            只能在方法内部使用，表示对“调用方法的那个对象”的引用。但是在方法内部调用同一个类的另外一个方法不必使用this，直接调用即可
            this 对象对于将当前对象传递给其他方法很有用
            同一个构造器内只能使用this调用一次另外的构造器
            编译器禁止在除构造器的方法外调用构造器
         static关键字
            static方法就是没有this的方法 在没有创建任何对象的前提下只能通过类调用static方法
            static不能应用于局部变量，因此它只能作用于域   
         初始化顺序：即使变量定义散布于方法定义之间，它们仍然会在任何方法（包括构造器）被调用之前得到初始化
         静态数据的初始化
         首先初始化静态变量 然后是普通变量，然后构造器初始化，然后普通方法初始化
         对象创建的过程，假设一个名为Dog的类
         1.即使没有显示地使用static关键字，构造器实际也是静态方法。因此当首次创建类型为Dog的对象时（构造器可以看成静态方法），或者Dog类的静态方法/静态域首次被访问时，
         Java解释器必须查找类路径，以定位Dog.class文件
         2.然后载入Dog.class（将会创建一个Class对象），有关静态初始化的所有动作都会执行。因此，静态初始化只在Class对象首次加载的时候进行一次。
         3.当用new Dog()创建对象的时候，首先将在堆上为Dog对象分配足够的存储空间。
         4.这块存储空间会被清零，这就自动将Dog对象中的所有基本类型数据都设置成了默认值，而引用则被设置成了null
         5.执行所有出现于字段定义处的初始化动作
         6.执行构造器。
### day03
    I  访问权限控制
    包访问权限允许将包内所有相关的类组合起来，以使它们彼此之间可以轻松地相互作用
    取得对某成员的访问权的唯一途径：
        1.使该成员称为public
        2.通过不加访问权限修饰词并将其他类放置在同一包内的方式赋予包访问权。
        3.继承而来的类既可以访问public成员也可以访问protected成员（但是访问private成员不行）。只有在两个类都处于同一个包内时，它才可以
        访问包权限的成员
        4.提供访问器和变异器的方法（也称get/set方法），以读取和改变数值。
     访问权限的控制通常被称为具体实现的隐藏。把数据和方法包装进类中，以及具体实现的隐藏，常共同被称作是封装。其结果是一个同时带有特征和行为的数据类型。
     出于两个重要的原因，访问权限控制将权限的边界划在了数据类型的内部。第一个原因，设定程序员可以使用和不可以使用的界限，第二将接口与具体实现分离。
     
     * Java中有四种权限修饰符
      *             public > protected > default(不写) > private
      *
      * 同一类       Yes       Yes         Yes            Yes
      * 同一包       Yes       Yes         Yes            No
      * 不同包子类    Yes       Yes         No            No
      * 不同包非子类  Yes       No          No            No

 



​      
​      
​    II 继承可以视为对类的复用
​    继承来的方法可以重新修改，也可以重新定义新的方法
​    创建一个导出类的对象时，该对象包含了一个基类的子对象。这个子对象与你用基类直接创建的对象是一样的。二者的区别在于，后者来自于外部，而基类的子对象被包装导出类对象内部。
​    在构造器中调用基类构造器来执行初始化，基类构造器具有执行基类初始化所需的知识和能力。Java会自动在导出类的构造器中插入对基类构造器的调用
​    构建过程是从基类“向外”扩散的，所以基类在导出类构造器可以访问它之前，就已经完成了初始化。
​    
    如果没有默认的基类构造器，但是想要调用一个带参数的基类构造器，就必须用关键字super显示地调用基类构造器     
    
    调用基类构造器必须是你在导出类构造器中要做的第一件事
    
    在面向对象编程中，生成和使用程序代码最可能采用的方法就是直接将数据和方法包装进一个类中，并使用该类的对象。也可以运用组合技术使用现有类来开发新的类，而继承技术其实是不太常用的。
    应当慎用继承。如果必须向上转型，则继承是必要的，但如果不需要，则应当好好考虑是否需要继承。
    
    使引用成为final没有使基本类成为final的用处大
### day04
    Java允许生成“空白final”
    final参数
    使用final的原因：
    I.第一个原因把方法锁定，以防任何继承类修改它的含义。想要在继承中保持方法行为不变，并且不会被覆盖
    II.效率。
    类中所有private方法都隐式地指定为final。可以对private方法添加final修饰词但是没有添加任何额外的意义
    * final关键字本身代表最终的不可改变的
     * 常见四种用法
     * 1.可以用来修饰一个类
     * 2.可以用来修饰一个方法
     * 3.可以用来修饰一个局部变量
     * 4.可以用来修饰一个成员变量
     对于类方法来说，abstract和final关键字不能同时使用，因为矛盾
     
    封装：通过合并特征和行为来创建新的数据类型。“实现隐藏”
    则通过细节“私有化”把接口和实现分离开来。
    多态的作用是消除类型之间的耦合关系。多态调用允许一种类型表现出与其他相似的类型之间的区别，只是从同一基类导出而来。这种区别是根据方法行为的不同而表示出来的，
    虽然这些方法都可以通过同一个基类来调用。
    
    一个标准的类通常需要满足下面四个组成部分
     * 1.所有的成员变量都需要使用private关键字修饰
     * 2.为每一个成员变量编写一对Getter和Setter方法
     * 3.编写一个无参的构造方法
     * 4.编写一个有参构造方法
     
    数组的特点
      * 1.数组是一种引用数据类型
      * 2.数组当中的多个数据，类型必须统一
      * 3.数组长度在程序运行期间不可改变
      * 数组的初始化,在内存中创建一个数组，并且向其中赋予一些默认值
      *
      * 两种常见的初始化
      * 1.动态初始化（指定长度）
      * 2.静态初始化
      * 动态初始化数组的格式
      * 数据类型 [] 数组名称 = new 数据类型[数组长度]
      * 等号左右数据类型必须保持一致
      
    Java的内存需要划分成5个部分
    1. 栈（Stack）: 存放的都是方法中的局部变量。方法的运行一定要在栈当中。
    局部变量：方法的参数，或者是方法{}内部的变量
    作用域：一旦超出作用域，立刻从栈内存当中消失
    2. 堆（Heap）:凡是new出来的东西，都在堆当中
        堆内存里面的东西都有一个地址值：16进制
        堆内存里面的数据，都有默认值，规则：
            如果是整数   默认为0
            如果是浮点数 默认为0.0
            如果是字符   默认为'\u0000'
            如果是布尔   默认为false
            如果引用类型 默认为null
    3. 方法区（Method Area）：存储class相关信息，包含方法的信息
    4. 本地方法栈（Native Method Stack）：与操作系统相关
    5. 寄存器（PC register）：与CPU相关
    
    抽象类（abstract）和接口（interface）有什么异同？
    不同：
        抽象类：
     1. 抽象类可以定义构造器
     2. 可以有抽象方法和具体方法
     3. 接口中的成员全都是public的
     4. 抽象类中可以定义成员变量
     5. 有抽象的类必须被声明为抽象类，而抽象类未必要有抽象方法
     6. 抽象类中可以包含静态方法
     7. 一个类只能继承一个抽象类
        接口
     1. 接口不能定义构造器
     2. 方法全部都是抽象方法
     3. 抽象类中的成员可以是private、默认、protected、public
     4. 接口定义的成员变量实际上都是常量
     5. 接口中不能有静态方法
     6. 一个类可以实现多个接口
     相同点
     1. 不能实例化
     2. 可以将抽象类和接口类型作为引用类型
     3. 一个类如果继承了某个抽象类或者实现了某个接口都需要对其中的抽象方法全部进行实现，否则该类仍然需要被声明为抽象类
     
     * 方法重写的注意事项
     *
     * 1.必须保证父子类之间方法的名称相同，参数列表也相同
     * 2.子类方法的返回值必须【小于等于】父类方法的返回值
     * 3.子类方法的权限必须【大于等于】父类方法的权限
     * public > protected > (default) > private


​     
​      继承关系中，父子类构造方法的特点
​      * 1. 子类构造方法当中有一个默认的隐含的“super()”调用，所以一定是先调用的父类构造方法，后执行子类构造方法
​      * 2. 子类构造可以通过super关键字来重载父类重载构造
​      * 3.super的父类构造调用必须是子类构造调用的第一句
​      
       super 关键字用来访问父类内容，而this关键字用来访问本类内容
       * 1.在本类成员方法中，访问本类的成员变量
       * 2.在本类的成员方法中，访问本类的另一个成员方法
       * 3.在本类的构造方法中，访问本类的另一个构造方法
       *
       * this在构造方法中调用只能调用一次，第一句
       * super()和this两个构造调用，不能同时使用
       
       抽象方法，就是加上abstract关键字，去掉大括号，直接分号结束
        * 抽象类，抽象方法所在的类，必须是抽象类才行，在class之前写上abstract
        *
        * 如何使用抽象类和抽象方法
        *
        * 1.不能直接创建抽象类对象
        * 2.必须用一个子类继承抽象父类
        * 3.子类必须覆盖重写抽象父类当中的所有抽象方法


​        
​        一个抽象类不一定含有抽象方法
​         *
​         * 只要保证抽象方法所在的类是抽象类
​         *
​         * 这样没有抽象方法的抽象类，也不能直接创建对象，在一定特殊场景下使用

### day05
   1.<font color=red>私有方法无法被覆盖</font>  
         
   2.<font color=red>只有普通方法的调用可以是多态的</font>  


​         
​         