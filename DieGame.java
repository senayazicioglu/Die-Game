/*Bu class oyunun temel kurallarını gerceklestirmektedir*/
import java.util.Scanner;
public class DieGame{
 
  public static final int GOAL_SCORE = 100;/*kazanmak icin alinacak skor*/
  private final  DiePlayer[] players;/*oyuncu dizisi*/
  private int[] scores;
  
  public DieGame(DiePlayer[] players){ /*DieGame'i verilen oyuncular dizisi ile
birlikte başlatmaktadır. Her oyuncunun başlangıç skoru 0 dır*/
  
  this.players=players;
  scores=new int[players.length];
  
  for(int i=0; i<players.length ; i++){
    scores[i]=0;
  }
}
  
  int myScore,turnTotal,rolls,maxScore;/*isRolling icindeki degiskenleri tanimladik*/
  
  int playTurn(DiePlayer p, int playerNum){ 

  Die obj =new Die();
  int i,turToplam=0;
  boolean j = p.isRolling(myScore, turnTotal, maxScore, rolls);
 
  do{
    i=obj.nextRoll();
    turToplam=i+turToplam;
  }while(j && i!=1);
   
    if(j){
    return turToplam;
  }
  
    else if(i==1){
      return 0;
    }
   
    else return 0;
  }


public int play(){ /*tum oyuncular icin sirasiyla playTurnu cagirmakta ve kazanan belli olana kadar buna devam etmektedir. Bu metod kazanan oyuncunun dizideki indexini return etmektedir*/
    int kazanan=0;

    while(getMaxScore()!=100){
        for(int x=0; x<players.length; x++){
            scores[x]= playTurn(players[x], x);
        }
    }

    printScores();

    for(int y=0; y<players.length; y++){
        if(scores[y]==100){
           kazanan= y;
        }
    }

    return kazanan;
}

int getMaxScore(){/*oyuncular arasındaki maximum skoru return eder*/
    int gecici = scores[0];
    for(int z=0; z<scores.length; z++){
        if(scores[z] > gecici){
        gecici= scores[z];
        }
    }
    return gecici;
}


void printScores(){ /*oyuncuların skorlarını yazdırmaktadır*/
    for(int w=0 ;w<players.length; w++){
    System.out.println(scores[w]);
    }
}
}
