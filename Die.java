/*sena betul yazicioglu-20120205061
*yazicioglusenabetul@gmail.com
*bu class 6 yüzlü zarı implement eder
*/

import java.util.Random;
public class Die {
 Random r= new Random();
 
 int nextRoll(){/*bu metot (1-6) aralığında rastgele sayı return eder*/
 return r.nextInt(6)+1;
}
}