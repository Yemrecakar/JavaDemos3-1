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

        if(ort>90 && ort<100)

        {
            System.out.println("AA");
        }
        else if(ort>85 && ort<89)
        {
            System.out.println("BA");

        }
        else if(ort>80 && ort<84)
        {
            System.out.println("BB");

        }
        else if(ort>70 && ort<79)
        {
            System.out.println("CB");


        }
        else if(ort>60 && ort<69)
        {
            System.out.println("CC");

        }
        else if(ort>55 && ort<59)
        {
            System.out.println("DC");

        }
        else if(ort>50 && ort<54)
        {
            System.out.println("DD");

        }
        else if(ort>40 && ort<49)
        {
            System.out.println("FD");

        }
        else
        System.out. println("FF");
    }
}
  
