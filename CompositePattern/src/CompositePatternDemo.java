public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Mehedi","CEO",3000);
        Employee headSales = new Employee("hehedi","CEO",3000);
        Employee headMarketing = new Employee("ehedi","CEO",1000);
        CEO.add(headMarketing);
        CEO.add(headSales);
        System.out.println(CEO);
        for (Employee head : CEO.getSubordinates()){
            System.out.println(head);
        }
    }
}