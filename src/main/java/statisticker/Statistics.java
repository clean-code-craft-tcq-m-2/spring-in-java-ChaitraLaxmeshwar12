package statisticker;

import java.util.List;
import statisticker.Stats;

public class Statistics 
{   
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Stats s = new Stats();
        // compute average
         float sum=0f;
         if(numbers.size()>0)
         {
              int listsize = numbers.size();
              for(int i=0;i<listsize;i++)
              {
                     sum = sum + numbers.get(i); 
              }
              s.average = sum/listsize;
         }
         else
         {
              s.average = Float.NAN;      
         }
        retutn s;
}
}
