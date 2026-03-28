package beans;

public class TestBeans {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Shiwani");
        p.setAge(20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}