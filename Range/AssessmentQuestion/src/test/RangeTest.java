package test;

import com.RangeExercise;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class RangeTest {
   @Test
   public void testRangeExercise() {
	   
	   String[] ranges = {"94133,94133", "94200,94299", "94600,94699"};
	   
	   List<String> outputRanges = new ArrayList<String>();
	   outputRanges.add("94133,94133");
	   outputRanges.add("94200,94299");
	   outputRanges.add("94600,94699");       
       assertEquals(RangeExercise.mainCaller(ranges),outputRanges);
   }
}