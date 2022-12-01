import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Player {
    static Scanner sc = new Scanner(System.in);
    private String cName;
    private int healthy;
    private int money;
    private int damage;
    private static int realhealty;





    public static int chaMenu() throws InterruptedException {
        System.out.println("LÜTFEN KARAKTERİNİZİ SECİNİZ\n\t\t");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1-TÜRÜ:SAMURAY\t HASAR:5 \tSAGLIK:21 \tPARA:15");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2-TÜRÜ:OKÇU \tHASAR:7 \tSAGLIK:18 \tPARA:20");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3-TÜRÜ:ŞOVALYE \tHASAR:8 \tSAGLIK:24 \tPARA:5");
        TimeUnit.SECONDS.sleep(2);
        int chaID = sc.nextInt();
        if (chaID < 1 || chaID > 3) {
            System.out.println("lütfen doğru karakter giriniz\n\t\t");
            chaID = sc.nextInt();
        }
        return chaID;
    }

    public void selectCha() throws InterruptedException {
        switch (chaMenu()) {
            case 1:
                setcName("SAMURAY");
                setHealthy(21);
                setRealhealty(21);
                setDamage(5);
                setMoney(15);
                break;
            case 2:
                setcName("OKÇU");
                setHealthy(18);
                setRealhealty(18);
                setDamage(7);
                setMoney(20);

                break;
            case 3:
                setcName("SOVALYE");
                setHealthy(24);
                setRealhealty(24);
                setDamage(8);
                setMoney(5);

                break;
            default:

                setcName("SAMURAY");
                setHealthy(21);
                setRealhealty(21);
                setDamage(5);
                setMoney(15);
                break;
        }




    }
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static int getRealhealty() {
        return realhealty;
    }

    public static void setRealhealty(int realhealty) {
        Player.realhealty = realhealty;
    }

    public void chainfo (){
    System.out.println("karakteriniz...\n\t\t");
    System.out.println("\n\t\tADI:"   + getcName());
    System.out.println("\n\t\tHASARI:"   + getDamage());
    System.out.println("\n\t\tSAĞLIĞI:"   + getHealthy());
    System.out.println("\n\t\tPARASI:"   + getMoney());
}

}