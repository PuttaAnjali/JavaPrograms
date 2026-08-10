import java.util.Scanner;

class Customer {
    int custId;
    String custName, custAddress;

    Customer(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    void display() {
        System.out.println("Customer Id: " + custId);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddress);
    }
}

class Acc {
    int accId;
    String accType;
    Customer cust;
    double accBal;

    Acc(int accId, String accType, Customer cust, double accBal) {
        this.accId = accId;
        this.accType = accType;
        this.cust = cust;
        this.accBal = accBal;
    }

    void display() {
        cust.display();
        System.out.println("Account Id: " + accId);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + accBal);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Customer Address:");
        String address = sc.nextLine();

        Customer cust = new Customer(id, name, address);

        System.out.println("Enter Account Id:");
        int aid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Type:");
        String type = sc.nextLine();

        System.out.println("Enter Account Balance:");
        double bal = sc.nextDouble();

        Acc acc = new Acc(aid, type, cust, bal);

        System.out.println("\nCustomer and Account Details:");
        acc.display();

        sc.close();
    }
}
