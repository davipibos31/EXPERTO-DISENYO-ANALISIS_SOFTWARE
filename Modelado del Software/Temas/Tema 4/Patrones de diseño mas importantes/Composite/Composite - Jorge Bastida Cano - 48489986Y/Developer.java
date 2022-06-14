// Developer.java
public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
    	// este es un nodo hoja por lo que este método no es aplicable a esta clase.
    }

    public Employee getChild(int i) {
    	// este es un nodo hoja por lo que este método no es aplicable a esta clase.
        return null;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        System.out.println();
        System.out.println("Nombre = " + getName());
        System.out.println("Sueldo = " + getSalary() + "€");
    }

    public void remove(Employee employee) {
    	// este es un nodo hoja por lo que este método no es aplicable a esta clase.
    }
}

