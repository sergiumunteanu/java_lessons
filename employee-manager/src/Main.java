import edu.step.Product;
import edu.step.people.Employee;
import edu.step.people.Programmer;
import edu.step.service.ProductManager;

public class Main {
    public static void main(String[] args) {

        // data
//        Product milk = new Product("Alba 3.5%");
//
//        System.out.println(milk.getName());
//        milk.setName("Alba 3.5%");
//        System.out.println(milk.getName());
//
//        Product milk2 = new Product("JLC 2.5%");
//        System.out.println(milk2.getName());
//
//        Product chocolate = new Product("Snickers");
//        Product cocaCola = new Product("Coca Cola 2.5");
//
//
//        // services
//        ProductManager john = new ProductManager();
//        ProductManager peter = new ProductManager();

        Programmer p1 = new Programmer();
        p1.setSalary(100);

        Programmer p2 = p1;

        System.out.println(p1.getSalary());
        System.out.println(p2.getSalary());
        p2.setSalary(200);
        System.out.println(p1.getSalary());
        System.out.println(p2.getSalary());
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void action() {
        int result;
        result = 20;


        int sum = result + 20;
    }
}