package Array;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
	Integer a[] = {1,2,3,4,4,7,8,8,10};	

   @Test
   public void containsNumber() {	  
      assertEquals(true, containsNumber.contains(a,2));
   }
}