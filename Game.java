import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    static int n= 0;
 public static Player yusuf =new Player();
    static Scanner scanner=new Scanner(System.in);
public static void Login() throws InterruptedException {
    yusuf.selectCha();


start();
}
public static void start() throws InterruptedException {
    for (int i=0;i<10;i++){
        System.out.println(" ");
    }
    yusuf.chainfo();
    TimeUnit.SECONDS.sleep(2);
    System.out.println("\n\t\t*********************************\n\t\t");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("\n\t\teylem gerçekleştirmek için bir yer seçiniz\n\t\t");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("\n\t\t1. güvenli ev (düşman yok)\n\t\t");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("\n\t\t2.düşmanlara saldırmak için \n\t\t");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("\n\t\t3. mağaza (silah veya zırh alabilirsiniz)\n\t\t");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("\n\t\t************************************\n\t\t");
    System.out.print("\n\t\tgitmek istediğinizi yer:\n\t\t");
    int secim= scanner.nextInt();
    while(secim<1 || secim>5){
        System.out.println("\n\t\tlütfen geçerli bir yer giriniz\n\t\t");
        secim= scanner.nextInt();
    }
    switch (secim){
        case 1:
            Location.SaveHome();
            break;
        case 2:
            Location.Jungle();

            n+=1;
            break;
        case 3:
            Story.info();
            break;


    }

}

}


