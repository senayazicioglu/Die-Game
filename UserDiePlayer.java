/*Bu class DiePlayer interface’ni implement etmekte ve oyuncunun consoledan oyunu
oynamasına yardımcı olmaktadır*/
import java.util.Scanner;

public class UserDiePlayer implements DiePlayer{
 
public boolean isRolling(int myScore,int turnTotal,int maxScore,int rolls){ 

System.out.println("tur toplamı:" + turnTotal + "roll or hold?");

Scanner i = new Scanner(System.in);
String girilen =i.nextLine();
boolean cikti;

if(girilen== " "){/*eger string girildiyse devam eder fakat diger durumlarda birakir */
cikti=true;
}

else
cikti=false;
  
  return cikti;
  }
}
