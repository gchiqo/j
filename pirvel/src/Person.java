public class Person extends Human{

    public Person(String name, int age) {
        super(name, age);
    }

    @java.lang.Override
    void eatFood(String foodName) {
        System.out.println(this.name + ":  eating "+foodName);
    }

    @java.lang.Override
    String sayHelloTo(Human anotherHuman) {
        return this.name + ": hi "+anotherHuman.name+" how you doing";
    }
}