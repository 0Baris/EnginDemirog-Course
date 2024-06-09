
public class Main {
    public static void main(String[] args) {

        IndividualCustomer customer = new IndividualCustomer();
        customer.customerNumber = "123456";

        CorporateCustomer customer1 = new CorporateCustomer();
        customer1.customerNumber = "234567";


        SendikaCustomer customer2 = new SendikaCustomer();
        customer2.customerNumber = "345678";

        Customer[] customers = {customer,customer1,customer2};

        CustomerManager customerManager = new CustomerManager();
        /*
        customerManager.add(customer);
        customerManager.add(customer1);
        customerManager.add(customer2);
        */

        customerManager.addMultiple(customers);


    }
}