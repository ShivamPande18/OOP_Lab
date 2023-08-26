import java.util.Scanner;

public class MagicSquare {

    boolean isMagic(int arr[][], int dim)
    {
        
        int diagSum=0;
        int sum=0;
        int flag = 0;

        for (int i = 0; i < dim; i++) {
            int rowSum=0;
            for (int j = 0; j < dim; j++) {
                rowSum+=arr[i][j];

                if(i+j == dim-1)    diagSum += arr[i][j];
            }
            if(flag == 0){
                flag = 1;
                sum = rowSum;
            }
            else
                if(rowSum != sum)return false;
        }

        if(sum!=diagSum) return false;

        return true;
    }
    
    public static void main(String[] args) {
        MagicSquare sq = new MagicSquare();
        int dim; 

        System.out.println("Enter the size\n");
        Scanner sc = new Scanner(System.in);
        dim = sc.nextInt();

        System.out.println("Enter values3");
        int arr[][] = new int[dim][dim] ;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        if(sq.isMagic(arr, dim)) System.out.println("Is magic");
        else System.out.println("Not is magic");
    }
}
