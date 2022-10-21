package statisticker;

import java.util.List;
import java.util.Collections;
import statisticker.Stats;

public class Statistics 
{   
   public static Stats getStatistics(List<Float> numbers) {
		Stats s = new Stats();
		
		float sum =0.0f;
		// compute average
		int numbersSize = numbers.size();
		if(numbersSize>0)
		{
		   for(int i=0;i<numbersSize;i++)
		   {
			   sum = sum + numbers.get(i);
		   }
		   s.average = sum /numbersSize;
		   Collections.sort(numbers);
		   s.min = numbers.get(0);
		   s.max = numbers.get(numbersSize-1);
		}
		else
		{
			s.average= s.min= s.max=Float.NaN;
		}
		return s;		
	}
}
