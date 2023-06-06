import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        //sumTwoNumber();
        factorial();

    }
    public static void sumTwoNumber(){

        Scanner reader = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Girin: ");
        int sayi1 = reader.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        int sayi2 = reader.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Sayıların Toplamı: " + toplam);
    }
    public static void factorial(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        int num = reader.nextInt();
        int sayac=num;
        long faktoriyel = 1;
        while(sayac>1)
        {
            faktoriyel*=sayac;
            sayac--;
        }
       /* for(int i = 1; i <= num; ++i)
        {
            faktoriyel *= i;
        }*/
        System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, faktoriyel);
    }
}