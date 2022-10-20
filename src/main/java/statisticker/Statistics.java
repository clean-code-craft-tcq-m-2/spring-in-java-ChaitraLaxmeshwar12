package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
   public static class Stats {
       public Float min;
       public Float max;
       public Float avg;    
   }
              
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
	 Stats stats =  new Stats();
         

        // 1. Find average
        float sum=0f;
	sum = stats.min = stats.max = stats.average=0.0f;
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

