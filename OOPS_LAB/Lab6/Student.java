import java.util.Scanner;

class Student{

    String name;
    
    int regNo;
    int age;

    int ugCnt = 0;
    int pgCnt = 0;

    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, reg no and age of student");
        name = sc.nextLine();
        regNo = sc.nextInt();
        age = sc.nextInt();
    }
}

class UG extends Student{
    int sem;
    int fees;
x
    UG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sem and fees");
        sem = sc.nextInt();
        fees = sc.nextInt();
        ugCnt++;
    }
}

class PG extends Student{
    int sem;
    int fees;

    PG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sem and fees");
        sem = sc.nextInt();
        fees = sc.nextInt();
        pgCnt++;
    }
}

class Main{
    public static void main(String[] args) {
        UG ugs[] = new UG[10];
        PG pgs[] = new PG[10];
        int ugInd=0,pgInd=0;
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 for ug and 2 for pg 3 to quit");
            ch = sc.nextInt();
            if(ch==1){
                ugs[ugInd] = new UG();
                ugInd++;
            }
            else if(ch==2){
                pgs[pgInd] = new PG();
                pgInd++;
            }
            else{
                break;
            }
        }
        System.out.println("UG students");
        for (int i = 0; i < ugs.length; i++) {
            System.out.println(ugs[i].name);
        }
        System.out.println("PG students");
        for (int i = 0; i < pgs.length; i++) {
            System.out.println(pgs[i].name);
        }
        sc.close();
    }
}
