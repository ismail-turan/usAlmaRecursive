import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,üs;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Taban :");
        taban= scanner.nextInt();
        System.out.print("Üs :");
        üs= scanner.nextInt();
        System.out.println("Sonuç : "+pow(taban,üs));
    }
    static int pow(int taban,int üs){
        if (üs!=0){
            return  taban*pow(taban, üs-1);
        }else {
            return 1;
        }
    }
}