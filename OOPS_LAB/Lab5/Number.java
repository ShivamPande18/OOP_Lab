public class Number {
    
    private double value;

    boolean IsZero()
    {
        return(value==0);
    }

    boolean IsPositive()
    {
        return(value>=0);
    }

    boolean IsNegative()
    {
        return(value<0);
    }

    boolean IsOdd()
    {
        return(value%2==1);
    }

    boolean IsEven()
    {
        return(value%2==0);
    }

    boolean IsPrime()
    {
        for (int i = 2; i <= value/2; i++) {
            if(value%i==0) return false;
        }

        return true;
    }

    boolean IsArmstrong()
    {
        int temp = (int)value;
        int result = 0;

        while (temp!=0) {
            result += Math.pow(temp % 10, 3);
            temp /= 10;
        }

        if(result==value) return true;
        return false;
    }
}
