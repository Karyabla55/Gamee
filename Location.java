import java.awt.font.GlyphMetrics;
import java.util.concurrent.TimeUnit;

public class Location {

    public static  Enemy enemy=new Enemy();
    public static Player player;

    public static void SaveHome() throws InterruptedException {
        System.out.println("güvenli eve hoşgeldiniz \n\t\t");
        System.out.println("lütfen bekleyiniz canınız dolduruluyor ...\n\t\t");
        Game.yusuf.setHealthy(Player.getRealhealty());
        System.out.println("canınız dolduruldu:\n\t\t"+Game.yusuf.getHealthy());
        Game.start();
    }
    public static void Jungle() throws InterruptedException {
        System.out.println("ormana geldiniz \n\t\t");
        System.out.println("karsınıza bir düşman cıktı\n\t\t");
        enemy.selectEnemy();
        while(Game.yusuf.getHealthy()>0) {
            System.out.println("düşman size \t" + enemy.getEdamage() + "\tvurdu\t");
            TimeUnit.SECONDS.sleep(2);
            Game.yusuf.setHealthy(Game.yusuf.getHealthy() - enemy.getEdamage());
            if(Game.yusuf.getHealthy()<=0 ){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("düşman sizi öldürdü oyun sonlandı\n\t\t");
                break;
            }
            TimeUnit.SECONDS.sleep(2);
            System.out.println("sağlıgınız:\t" + Game.yusuf.getHealthy());
            TimeUnit.SECONDS.sleep(1);
            enemy.setEhealty(enemy.getEhealty() - Game.yusuf.getDamage());
            TimeUnit.SECONDS.sleep(1);
            System.out.println("düşmanın kalan sağlığı:\t" + enemy.getEhealty());
                 if(enemy.getEhealty()<=0){
                System.out.println("düşmanı öldürdünüz tebrikler...\n\t\t");
                System.out.println("kalan sağlığınız:\t"+ Game.yusuf.getHealthy());

                Game.yusuf.setMoney(Game.yusuf.getMoney()+enemy.getMoney());
                System.out.println("güncel paranız:\t"+Game.yusuf.getMoney());
                Game.start();
            }
        }


      }




}

