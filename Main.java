import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        {
            String choice;
            System.out.println("Wybierz pizze od 1-3");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next();

            switch (choice) {
                case "1":
                    waiter.getPizza();
                    System.out.println("Wybrałeś Margheritę");
                    break;
                case "2":
                    waiter.getPizza();
                    System.out.println("Wybrałeś Hawaiian");
                    break;
                case "3":
                    waiter.getPizza();
                    System.out.println("Wybrałeś Pepperoni");
                    break;

                default:
                    System.out.println("Zły wybór");
                    break;
            }
        }
    }
}


