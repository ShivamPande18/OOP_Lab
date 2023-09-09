import java.util.Scanner;

class Account{
    String customerName;
    String accType;

    int accNumber; 
    
    float rate;
    float amount;

    Account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        customerName = sc.nextLine();
        System.out.println("Enter account Number:");
        accNumber = sc.nextInt();
        System.out.println("Enter amount:");
        amount = sc.nextFloat();
        sc.close();
    }

    void deposite(int val){
        amount+= val;
        display();
    }

    void deposite(float val){
        amount+= val;
        display();
    }

    void withdraw(int val){
        amount-=val;
        display();
    }

    void display(){
        System.out.println("Amount left : " + amount);
    }
    
}

class SavingsAccount extends Account{
    SavingsAccount(){
        rate = 5;
    }
    float getSI(int time){
        return(amount*rate*time)/100;
    }
}

class CurrentAccount extends Account{
    CurrentAccount(){
        rate=0;
    }

    void checkMin(){
        if(amount<100){
            System.out.println("Minimum balance reached:");
            float dec = amount*.5f;
            amount -= dec;
        }
    }
}

class Customer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. For saving account.\n2. For current account");
        int ch = sc.nextInt();
        if(ch == 1){
            SavingsAccount acc = new SavingsAccount();
            System.out.println("Enter amount to deposite:");
            int val = sc.nextInt();
            acc.deposite(val);
            
            System.out.println("Enter time to calc and deposite SI:");
            val = sc.nextInt();
            float interest = acc.getSI(val);
            System.out.println("Interest: " + interest);
            acc.deposite(interest);

            System.out.println("Enter amount to withdraw:");
            val = sc.nextInt();
            acc.withdraw(val);
        }
        else{
            CurrentAccount acc = new CurrentAccount();
            System.out.println("Enter amount to deposite:");
            int val = sc.nextInt();
            acc.deposite(val);

            System.out.println("Enter amount to withdraw:");
            val = sc.nextInt();
            acc.withdraw(val);
            acc.checkMin();
        }
        sc.close();
    }
}
