public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(30, "David Alaba");
        Person p3 = new Person(31, "Anna Gasser");

        p1.print();
        p2.print();
        p3.print();
    }
}
