package com.movex.ads;

import org.junit.Test;
import static org.junit.Assert.*;

public class HomeControllerTest {
	

	@Test
	public void junittest(){
		HomeController t = new HomeController();
		int result = t.junittest(10);
		assertEquals(11, result, 1);
		
	}
}
