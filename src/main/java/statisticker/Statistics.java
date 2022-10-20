package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
   public static class Stats {
       public Float min;
       public Float max;
       public Float avg;
       
       public Stats(Float minimum,Float maximum, Float average)
       {
         this.min = minimum;
         this.max = maximum;
         this.avg = average;
       }
       
   }
              
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
	 Stats stats =  new Stats();
         Float stats.min=0.0f;
         Float stats.max= 0.0f;
         Float stats.average = 0.0f;

        // 1. Find average
        float sum=0f;
        int size=numbers.size();
        if(size>0)
        {
        for(int i=0;i<size;i++)
        {
            sum = sum + numbers.get(i);
        }
        stats.average = sum/size;
        Collections.sort(numbers);
        stats.min= numbers.get(0);
        stats.max = numbers.get(size-1);
        }
       else
        {
             stats.min = Float.NaN;
	     stats.max = Float.NaN;
	     stats.average = Float.NaN;
        }
        return stats;
    } 
    }

