
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // 调用父类的构造方法
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void getAge(){
        System.out.println(name + " is " + age + " years old.");
    }

    public void eat() {
        super.eat(); // 调用父类的方法
        System.out.println(name + " is eating bones.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 1);
        dog.getAge();
        dog.bark();
        dog.eat();
    }
}