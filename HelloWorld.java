import java.time.LocalDate;       // 日付 (例: 2025-09-14)
import java.time.LocalTime;       // 時刻 (例: 10:30:45)
import java.time.LocalDateTime;   // 日付＋時刻
import java.time.ZonedDateTime;   // タイムゾーン付き日付時刻
import java.time.format.DateTimeFormatter; // 日付時刻のフォーマット
import java.time.Duration;        // 時間の差分（時間・分・秒）
import java.time.Period;          // 日付の差分（年・月・日）
import java.util.Date;
public class HelloWorld {  
       public static void main(String[] args) {  
           System.out.println("Hello, World!"); 
           System.out.println("2回目の練習");
           Date today4print = new Date();
           System.out.println( today4print); 
           LocalDateTime now = LocalDateTime.now();
           System.out.println(now);
           DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
           System.out.println(now.format(fmt));
       }
   }
