import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Story {
    static Story weapon = new Story();
    static Story armor = new Story();

    private int resistance;

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void info() throws InterruptedException {
        System.out.println("zırh almak istiyorsanız : 1\n\t\t");
        System.out.println("silah almak istiyorsanız : 2\n\t\t");
        int secim = scanner.nextInt();
        if (secim == 1) {
            System.out.println("zırhlar size karşı saldırıların direncini azaltır\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+7 direnc sağlıcak zırh  ve 20 para :1\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+10 direnc sağlıcak zırh  ve 30 para:2\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+15 direnc sağlıcak zırh ve 40 para:3\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("güncel paranız:\t\t"+Game.yusuf.getMoney());
            int secimm = scanner.nextInt();
            switch (secimm) {
                case 1:
                    armor.setResistance(7);
                    if (Game.yusuf.getMoney() >= 20) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 20);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız: \t"+ Game.yusuf.getMoney());
                        Player.setRealhealty(Player.getRealhealty() + armor.getResistance());
                        Game.yusuf.setHealthy(Game.yusuf.getHealthy()+armor.getResistance());
                        System.out.println("\nzırhınız giyildi\n\t\t");
                        System.out.println("toplam sağlığınız : \t\t"+ Game.yusuf.getHealthy());

                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();

                    }
                    break;
                case 2:
                    armor.setResistance(10);
                    if (Game.yusuf.getMoney() >= 30) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 30);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız: \t"+ Game.yusuf.getMoney());
                        Player.setRealhealty(Player.getRealhealty() + armor.getResistance());
                        Game.yusuf.setHealthy(Game.yusuf.getHealthy()+armor.getResistance());
                        System.out.println("\nzırhınız giyildi\n\t\t");
                        System.out.println("toplam sağlığınız : \t\t"+ Game.yusuf.getHealthy());
                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();
                    }
                    break;
                case 3:
                    armor.setResistance(15);
                    if (Game.yusuf.getMoney() >= 40) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 40);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız: \t"+ Game.yusuf.getMoney());
                        Player.setRealhealty(Player.getRealhealty() + armor.getResistance());
                        Game.yusuf.setHealthy(Game.yusuf.getHealthy()+armor.getResistance());
                        System.out.println("\nzırhınız giyildi\n\t\t");
                        System.out.println("toplam sağlığınız : \t\t"+ Game.yusuf.getHealthy());
                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();
                    }
                    break;
                default:
                    Game.start();
                    break;
            }

        } else if (secim == 2) {
            System.out.println("silahlar size vurus gücü kazandırır\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+4 vurus gücü sağlıcak   ve 15 para :1\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+7 vurus gücü sağlıcak   ve 20 para:2\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("+12 vurus gücü  sağlıcak  ve 35 para:3\n\t\t");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("güncel paranız:\t\t"+Game.yusuf.getMoney());
            int secimm = scanner.nextInt();
            switch (secimm) {
                case 1:
                    weapon.setResistance(4);
                    if (Game.yusuf.getMoney() >= 15) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 15);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız: \t"+ Game.yusuf.getMoney());
                        Game.yusuf.setDamage(Game.yusuf.getDamage() + weapon.getResistance());
                        System.out.println("\nsilahınız alındı\n\t\t");
                        System.out.println("saldırı gücünüz :\t\t"+Game.yusuf.getDamage());
                        TimeUnit.SECONDS.sleep(1);
                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();
                    }
                    break;

                case 2:
                    weapon.setResistance(7);
                    if (Game.yusuf.getMoney() >= 20) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 20);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız:\t "+ Game.yusuf.getMoney());
                        Game.yusuf.setDamage(Game.yusuf.getDamage() + weapon.getResistance());
                        System.out.println("\nsilahınız alındı\n\t\t");
                        System.out.println("saldırı gücünüz :\t\t"+Game.yusuf.getDamage());
                        TimeUnit.SECONDS.sleep(1);
                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();
                    }
                    break;
                case 3:
                    weapon.setResistance(12);
                    if (Game.yusuf.getMoney() >= 35) {
                        Game.yusuf.setMoney(Game.yusuf.getMoney() - 35);
                        System.out.println("satın alım gercekleşti\n\t\t");
                        System.out.println("kalan paranız: \t"+ Game.yusuf.getMoney());
                        Game.yusuf.setDamage(Game.yusuf.getDamage() + weapon.getResistance());
                        System.out.println("\nsilahınız alındı\n\t\t");
                        System.out.println("saldırı gücünüz :\t\t"+Game.yusuf.getDamage());
                    }
                    else{
                        System.out.println("paranız bu ürünü almaya yetmiyor\n\t\t");
                        Game.start();
                    }
                    break;
                default:
                    Game.start();
                    break;

            }
        }
        Game.start();
    }

}


