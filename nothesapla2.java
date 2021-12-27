import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

         System.out.println("not hesaplayıcıya hoş geldin!! \n vize ve final Notunuzu girin");
         Scanner nesne= new Scanner(System.in);
         int vize=nesne.nextInt();
         int final_notu=nesne.nextInt();
       double ort=0;
         ort=(vize0.4 + final_notu0.6);
        if(ort>40)
        {
            System.out.println( ort+" ortalama ile gectiniz!");

        }
        else
        System.out.println(ort+" ortalama ile kaldınız!");


    }
}