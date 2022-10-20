package statisticker;

import java.util.List;

public class Statistics 
{
   public static class Stats {
       public Float min;
       public Float max;
       public Float avg;
       
       public Stats(float minimum,float maximum, float average)
       {
         this.min = minimum;
         this.max = maximum;
         this.avg = average;
	 return;
       }
       
   }
              
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
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
        average = sum/size;
        Collections.sort(numbers);
        min= numbers.get(0);
        max = numbers.get(size-1);
        }
       else
        {
             min = Float.NaN;
	     max = Float.NaN;
	     average = Float.NaN;
        }
        return new  Stats(min,max,average);
    } 
    }

