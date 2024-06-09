public class CustomerManager {

    public void add(Customer customer){
        System.out.println("Eklendi! " + customer.customerNumber);
    }

    public void addMultiple(Customer[] customers){
        for (Customer customer : customers){
            add(customer);
        }
    }
}
