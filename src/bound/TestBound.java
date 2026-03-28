package bound;

public class TestBound {
    public static void main(String[] args) {

        BoundPerson p = new BoundPerson();

        p.addPropertyChangeListener(evt -> {
            System.out.println("Changed: " + evt.getOldValue() + " -> " + evt.getNewValue());
        });

        p.setName("Shiwani");
        p.setName("Kapil");
    }
}