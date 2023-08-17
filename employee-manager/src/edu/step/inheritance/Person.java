package edu.step.inheritance;

public class Person {

    private String name;

    private String surname;

    private String birthdate;

    private final String idnp;

    private final double coefficient = 1.0;

    private Address address;

    public Person(String idnp) {
        this.idnp = idnp;
    }

    public Person(String idnp, String name) {
        this(idnp);
        this.name = name;
    }

    public Person(String name, String surname, String birthdate, String idnp, Address address) {
        this(idnp, name);
        this.surname = surname;
        this.birthdate = birthdate;
        this.address = address;
    }

    public static void main(String[] args) {
        Address a = new Address("Chisinau", "Columna", 25);
        a.print();
        Person p = new Person("John", "Smith", "14.10.2000", "3278234687236478",a);
    }
}
