package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClassObject {
	@Test
	public void ClassObject() {
		ClassObject c = new ClassObject();// Creating the object of the class "c"
		int a = c.add(10,10);//Getting method through 
		assertEquals(20,a);
		
	}

}
