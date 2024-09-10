package Bai2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Mai", 30, "Male", "123456", "Ha Noi");

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("Phone: " + person.phone);
        System.out.println("Address: " + person.address);
    }
}
