import java.util.Random;
import java.util.Scanner;

public class Enemy {
    private String Ename;
    private int Ehealty;
    private int Edamage;
    private int money;
    static Scanner scanner = new Scanner(System.in);


    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public int getEhealty() {
        return Ehealty;
    }

    public void setEhealty(int ehealty) {
        Ehealty = ehealty;
    }

    public int getEdamage() {
        return Edamage;
    }

    public void setEdamage(int edamage) {
        Edamage = edamage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public static int random() {
        Random random = new Random();
        int secim = 1, sayi = 0;
        while (secim != sayi) {
            secim = random.nextInt(5);
            sayi = random.nextInt(5);
        }
        return secim;
    }


    public void selectEnemy() {



        switch (random()) {
            case 0:
                setEname("vampir");
                setEdamage(5);
                setEhealty(15);
                setMoney(10);
                System.out.println("TÜRÜ:VAMPİR\t\t HASAR:5 \t\tSAGLIK:15 \t\tPARA:10");
            case 1:
                setEname("ayı");
                setEdamage(7);
                setEhealty(25);
                setMoney(16);
                System.out.println("TÜRÜ:AYI \t\tHASAR:7 \t\tSAGLIK:25 \t\tPARA:16");
                break;
            case 2:
                setEname("zombi");
                setEdamage(6);
                setEhealty(18);
                setMoney(7);
                System.out.println("TÜRÜ:ZOMBİ \t\tHASAR:6 \t\tSAGLIK:20 \t\tPARA:7");
                break;
            case 3:
                setEname("Konya");
                setEdamage(10);
                setEhealty(12);
                setMoney(20);
                System.out.println("TÜRÜ:Konya \t\tHASAR:10 \t\tSAGLIK:10 \t\tPARA:20");
                break;
            case 4:
                if (Game.n >= 5){
                    setEname("The Big Boss");
                    setEdamage(15);
                    setEhealty(35);
                    setMoney(50);
                    System.out.println("TÜRÜ:The Big Boss \t\tHASAR:15 \t\tSAGLIK:35 \t\tPARA:50");
                }
                break;
        }
    }


}
