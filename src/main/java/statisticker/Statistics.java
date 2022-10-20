package statisticker;

import java.util.List;

public class Statistics 
{
   public static class Stats {
       public float min;
       public float max;
       public float average;
       
       public Stats(float min,float max, float average)
       {
         this.min = min;
         this.max = max;
         this.average = average;
       }
       
   }
              
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
	 Stats stats = new Stats();
         float min=0f;
         float max= 0f;
         float average = 0f;

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

