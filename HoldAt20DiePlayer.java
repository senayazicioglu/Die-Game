/*Bu class her turda ya 1 gelene kadar ya tur skoru 20 yada büyük olana kadar ; yada   alınan tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam eder*/
public class HoldAt20DiePlayer implements DiePlayer{

Die i = new Die();

public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){ 

if(i.nextRoll()!=1 || turnTotal<20 || (turnTotal+myScore)<100 ){ 
  return true;
}
else 
return false;

}
}