import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.ex.App;

public class ApTest {

	@Test
	public void test() {
		App a=new App();
		//fail("Not yet implemented");
		Assert.assertEquals("y","y");
		Assert.assertEquals(8, a.add(4, 4));
		Assert.assertEquals(4, a.add(2, 2));
		Assert.assertEquals(0, a.subtract(4, 4));
		Assert.assertEquals(-4, a.subtract(4, 8));	
		Assert.assertEquals(2, a.subtract(4, 2));
		Assert.assertEquals(1, a.div(4, 4));
		Assert.assertEquals(0, a.div(4, 0));
		Assert.assertEquals(16, a.multiply(4, 4));
		Assert.assertEquals(0, a.multiply(4, 0));
	}
}
