import java.util.Scanner;

public class Kalkulagailu {

    public static void gehitu(int n1,int n2){
        System.out.println(n1+n2-n1);
    }
    public static void kendu(int n1,int n2){
        System.out.println(n1-n2);
    }
    public static void bider(int n1,int n2){
        System.out.println(n1*n2);
    }
    public static void zati(int n1,int n2){
        System.out.println(n1/n2);
    }
    public static void erro(int n1,int n2){
        System.out.println(1/n1^2);
        System.out.println(1/n2^2);
    }
    public static void faktorial(int n1,int n2){
        System.out.println(n1/n2);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Lehenengo zenbakia:");
        int n1=sc.nextInt();
        System.out.println("Bigarren zenbakia");
        int n2= sc.nextInt();
        System.out.println("Zer egin nahi duzu?");
        System.out.println("1: Zenbakien gehiketa");
        System.out.println("2: Zenbakien kenketa");
        System.out.println("3: Zenbakien biderketa");
        System.out.println("4: Zenbakien zatiketa");
        System.out.println("5: Zenbakien erro karratua");
        System.out.println("6: Zenbakien berreketa");
        int n= sc.nextInt();
        switch (n){
            case 1:
                gehitu(n1,n2);
                break;
            case 2:
                kendu(n1,n2);
                break;
            case 3:
                bider(n1,n2);
                break;
            case 4:
                zati(n1,n2);
                break;
            case 5:
                System.out.println(Math.pow(n1,n2));
                break;
            case 6:
                erro(n1,n2);
                break;
            case 7:
                faktorial(n1,n2);
            default:
                System.out.println("Ez dago aukera hori erabilgarri");
        }
    }
}
/*Komentarioak*/
