import java.util.Scanner;

public class PlayDie {
    public static void main(String[] args) {
        
        DiePlayer[] strateji = new DiePlayer[4]; /*4 tane farklı stratejilerde oynayan oyuncu oluşturduk*/

        strateji[0] = new HoldAt20DiePlayer();
        strateji[1] = new HoldAt25DiePlayer();
        strateji[2] = new RaceToGoalDiePlayer();
        strateji[3] = new MyDiePlayer();

        int[] tplm = new int[4];
        for (int i = 0; i < 4; i++) {
            tplm[i] = 0;
        }
            for (int j= 0; j < 1000; j++) { /*1000 defa tekrarlayıp hangi stratejinin kaç defa kazandığını belirlemek icin olusturduk*/
                DieGame dieGame = new DieGame(strateji);
                tplm[dieGame.play()]++;
                System.out.println(" ");
            }

        System.out.println("toplamlar:");
        for(int p=0;p<4;p++){ /*butun stratejilerin toplam kac kere kazandıgını yazdırır*/
            System.out.println(tplm[p]);
        }
        }
    }
 
