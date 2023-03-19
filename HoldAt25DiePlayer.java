/*Bu class her turda ya 1 gelene kadar ya tur skoru 25 yada büyük olana kadar ; yada alınan tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam eder*/
public class HoldAt25DiePlayer implements DiePlayer{

Die i2 = new Die();

public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){

if(i2.nextRoll()!=1 || turnTotal<25 || (turnTotal+myScore)<100){
  return true;
}
else return false;

}
}

