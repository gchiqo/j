public abstract class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eatFood(String foodName);

    abstract String sayHelloTo(Human anotherHuman);
}
