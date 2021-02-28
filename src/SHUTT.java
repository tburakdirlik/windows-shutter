import java.io.BufferedReader;
import java.time.LocalTime;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SHUTT {

 public static void main(String[] args) throws IOException {

     
     LocalTime time1 = java.time.LocalTime.now().plusHours(1); 
     
     System.out.println(time1);
     LocalTime time2 = LocalTime.of(23, 59, 00);
     
     
    
     
     long second = ChronoUnit.SECONDS.between(time1, time2); 
     System.out.println("We have " + second + " time ");
     
     if(second>0){
         try {
             TimeUnit.SECONDS.sleep(second);
         } catch (InterruptedException ex) {
             Logger.getLogger(SHUTT.class.getName()).log(Level.SEVERE, null, ex);
         }
         
            System.out.println("after a " + second+ " second pc w'll be closed ");
     
            Runtime runtime = Runtime.getRuntime();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
            long a=1;
            Process proc = runtime.exec("shutdown -s -t " +a);          
     }
        }
}