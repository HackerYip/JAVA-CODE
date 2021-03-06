package inheritancedemo;

//继承，其实就是对 共性的抽取，从而打到代码的复用
//class Cat extends Animal
//这里面的Animal一般叫做父类，或者超类，基类
//Cat一般叫做子类，或者派生类
//一般是 is a 关系（cat is an animal）（something is a/an type）
class Animal{
    public String name;
    public int age;
    public String sex;

    public void eat(){
        System.out.println(this.name + "eat()!");
    }

    public void sleep(){
        System.out.println(this.name+ "睡觉!");
    }
}


class Cat extends Animal{//此时就有了Animal类里面定义的属性，同时也能访问其中的方法
    public String name;
    public int age;
    public String sex;

    public void eat(){
        System.out.println(this.name + "eat()!");
    }

    public void mew(){
        System.out.println("cat:mew()!");
    }
}

class Dog extends Animal{
    public String name;
    public int age;
    public String sex;

    public void eat(){
        System.out.println(this.name + "eat()!");
    }

    public void bark(){
        System.out.println("dog:bark()!");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "mimi";
        cat.sleep();
        cat.eat();
        cat.mew();
    }
}
