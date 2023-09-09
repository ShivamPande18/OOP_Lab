class IntWrapper {
    int value;
    
    IntWrapper(int value) {
        this.value = value;
    }
}

public class SwapByReference {
    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(5);
        IntWrapper b = new IntWrapper(10);

        System.out.println("Before swapping: a = " + a.value + ", b = " + b.value);

        swapByReference(a, b);

        System.out.println("After swapping (Call by Reference): a = " + a.value + ", b = " + b.value);
    }

    public static void swapByReference(IntWrapper x, IntWrapper y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}
