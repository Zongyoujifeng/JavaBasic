# Java基础学习
## day01
    1.Java入门程序 public static void main(String[] args)相关关键字的含义
    2.《Java编程思想》中提供的简短打印方法进行输出语句的打印
    3.Java操作符
         优先级
         别名问题
         算数操作运算符：+-*/%
    4.初始化
         构造器
         默认构造器：当行创建一个对象的时候，会调用默认构造器-即使没有明确定义。但如果已经定义了一个构造器（无论是否含参），编译器就不会自动创建默认构造器
         重载 方法重载的规则：
         
         构造器调用必须置于最起始位置，否则编译器会报错
            
            1. 方法名一致，参数列表中参数的顺序，类型，个数不同。
            2. 重载与方法的返回值无关，存在父类和子类，同类中。
            3. 可以抛出不同的异常，可以有不同的修饰符
         方法重写的规则：
         
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
         
         