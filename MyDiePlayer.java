/*Bu class her turda ya 1 gelene kadar ya tur skoru 35 yada büyük olana kadar ; yada alınan tur skoru ile toplam skorun toplamı 100 yada büyük olana kadar atmaya devam eder*/
public class MyDiePlayer implements DiePlayer{
 
 Die i3 = new Die();

 public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){

if(i3.nextRoll()!=1 || turnTotal<35 || (turnTotal+myScore)<100){
  return true;
}
else return false;

}
}
