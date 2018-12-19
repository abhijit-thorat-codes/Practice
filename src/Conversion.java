import java.util.*;
import java.text.*;

public class Conversion {
  public static void main(String[] args)
   {
   //Unix seconds
	  long unix_seconds= System.currentTimeMillis();
   //convert seconds to milliseconds
   Date date = new Date(unix_seconds*1000L); 
   // format of the date
   SimpleDateFormat jdf = new SimpleDateFormat("HH:mm:ss ");
   jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
   String java_date = jdf.format(date);
   System.out.println("\n"+java_date+"\n");
   System.out.println("\n"+getData(java_date)+"\n");
   
   }
  
  public static long getData(String s){
	  long l=Long.parseLong(s);
	  return (l);
  }
}