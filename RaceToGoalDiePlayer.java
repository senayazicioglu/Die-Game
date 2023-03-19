/*bu class tsi >= 71 , maxTS >= 71, tur skoru >= 21 + round((maxTS - tsi) / 8) yada tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam eder*/
public class RaceToGoalDiePlayer implements DiePlayer{

 public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
  
   int tsi= myScore; /*oyuncunun toplam skoru tsi, maxTS ise
                     tüm oyuncular arasındaki maksimum toplam skor*/
   int maxTS=maxScore;
  
   if(tsi < 71 || maxTS < 71){
      return true;
    }
    
    else if(turnTotal < 21 + Math.round((maxTS-tsi)/8) || (turnTotal+tsi)<100){
      return true;
    }
    
    else return false;
    
  }
}

