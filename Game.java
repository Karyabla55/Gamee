import java.util.Scanner;

public class Game {
 public static Player yusuf =new Player();
    static Scanner scanner=new Scanner(System.in);
public static void Login(){
    yusuf.selectCha();

start();
}
public static void start(){

    System.out.println("\n\t\t*********************************\n\t\t");
    System.out.println("\n\t\teylem gerçekleştirmek için bir yer seçiniz\n\t\t");
    System.out.println("\n\t\t1. güvenli ev (düşman yok)\n\t\t");
    System.out.println("\n\t\t2.düşmanlara saldırmak için \n\t\t");
    System.out.println("\n\t\t3. mağaza (silah veya zırh alabilirsiniz)\n\t\t");
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
            break;
        case 3:
            Story.info();
            break;

    }

}

}


