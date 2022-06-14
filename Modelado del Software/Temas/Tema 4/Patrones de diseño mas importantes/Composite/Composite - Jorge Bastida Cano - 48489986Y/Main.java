// Main.java
public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Developer("John Doe", 10000);
        Employee emp2 = new Developer("Linus Trovalds", 15000);
        Employee manager1 = new Manager("Steve Wozniak", 25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3 = new Developer("Richard Stallman", 20000);
        Manager generalManager = new Manager("Jorge Bastida", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
