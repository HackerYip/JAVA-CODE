package demo3;

    //多态
    //语文的角度：一种事物，多种形态（这种说法不算对，也不算错）
    //程序的角度：具体点就是去完成某个行为，当不同的对象去完成时会产生不同的状态
    //1.向上转型 ①直接赋值 ②方法的参数 ③方法的返回值
    //
    //2.方法重写 ①静态方法不能进行重写 ②private方法不能进行重写 ③子类的访问修饰限定符要大于等于父类 ④被final修饰的方法。也不可以被重写
    //
    //3.多态
    //
    //向下转型 不安全
    //
    //
    //
    //
    //
    //




class Animal{
    public String name;
    public int age;


    public void eat(){
        System.out.println(this.name + "吃饭!");
    }
}


class Cat extends Animal{
    public String hair;


    public void eat() {
        System.out.println(this.name + "吃猫粮！");
    }

    public void mew(){
        System.out.println(this.name + "正在叫");
    }
}

class Dog extends Animal{

    public void eat(){
        System.out.println(this.name + "吃狗粮");
    }

}

class Bird extends Animal{

    public void eat(){
        System.out.println(this.name + "吃鸟粮");
    }

    public void fly(){
        System.out.println("正在飞！");

    }
}

public class TestDemo {

    public static void main(String[] args) {
        Animal animal = new Cat();
        if(animal instanceof Bird) {//这句话的意思是：这个引用 引用的对象是不是一个Bird的实例。（上一行代码是猫）
            Bird bird = (Bird) animal;//报错
            bird.fly();
        }
    }

    public static void main5(String[] args) {
        Animal animal = new Bird();
        //animal.fly();//不能
        Bird bird = (Bird)animal;//向下转型，不安全
        bird.fly();
    }


    public static void function(Animal animal){
        animal.eat();
    }

    public static void main4(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        function(cat);
        function(dog);
    }
    public static void func(Animal animal){

    }

    public static Animal func2(){
        //return new Animal();
        return new Cat();//向上转型的第三种方式
    }

    public static void main3(String[] args) {
        Cat cat = new Cat();
        func(cat);//也发生了向上转型
    }

    public static void main2(String[] args) {
       /* Cat cat = new Cat();
        Animal animal = cat;*/

        Animal animal = new Cat();//这就是向上转型
        animal.name = "mimi";
        animal.eat();//为什么调用子类的？？实际上编译的时候，这里还是Animal的eat()，动态绑定（多态的基础）
        //animal.mew();//只能点到eat()，只能访问父类自己的特有的成员
    }


    public static void main1(String[] args) {
        Cat cat = new Cat();
        cat.mew();

        Animal animal = new Animal();
        //animal.mew();//这里通过父类引用 只能访问父类自己特有的方法
        animal.eat();//这里通过父类引用 只能访问父类自己特有的方法
    }
}
