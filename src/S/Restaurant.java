package S;

public class Restaurant {
    public static void main(String[]args){

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Cashier cashier = new Cashier();

        chef.cook();
        waiter.serve();
        cashier.bill();
    }
}
