import java.util.Scanner;

public class App {
    /*
    Proje Konusu 
    #Java ile kullanıcının girdiği değerler ile üs alan programı yazın.

    Örnek Çıktı
    Üs Alınacak Sayı : 2
    Üs Olacak Sayı : 3
    Cevap : 8
    Bonus Geliştirme
    Projede kullandığınız döngü tipinden farklı bir tip ile yapın. (For ile yaptıysanız While ya da While ile yaptıysanız For döngüsü ile yapınız.)
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number;
        int exponential;
        int result;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        System.out.print("Üstel sayı giriniz: ");
        exponential = input.nextInt();

        for (result = 1; exponential > 0; exponential--){
            result *= number;
        }
        System.out.println(result);
    }
}
