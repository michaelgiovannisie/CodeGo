person1.name
person1.age
person1.sayHello()
Person person2 = new Person("Eveline", 30);
person1.sayHello()
person1.haveBirthday()
person.printDetails()
System.out.println(person.isAdult())
person.haveBirthday()
System.out.println(person.isAdult())
Person person = new Person("Cindra", 25, "Ambidextrous");
person.printDetails()
class Person {
    String name;
    int age;
    String hand;
    Person (String n, int a, String h) {
        name = n;
        age = a;
	hand = h;
    }
    
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
	System.out.println("Handedness: " + hand);
    }
    
    boolean isAdult() {
        return age >= 18;
    }
    
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
person.printDetails()