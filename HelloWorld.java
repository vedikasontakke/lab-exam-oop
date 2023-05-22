
interface Account {
    void set(String accNo, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Account, Person {
    private String name;
    private String accNo;
    private double balance;

    public void set(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + (balance * 0.05)); // Assuming 5% interest rate
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Name: " + name);
    }
}


class HelloWorld {
   public static void main(String[] args) {
        Customer customer = new Customer();

        // Accepting input for customer
        customer.store("John Doe");
        customer.set("1234567890", 10000);
   }
}