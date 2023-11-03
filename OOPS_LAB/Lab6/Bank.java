class Bank {
    public double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Bank Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Bank Interest Rate: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Bank Interest Rate: " + axis.getRateOfInterest() + "%");
    }
}
