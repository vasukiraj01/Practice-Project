package com.exp4;
import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
public class Assertion {
		
        @Test
       
        public void assertTests() {
                String str = null;
                String str2 = "some value";
                String str3="some value";
                
                String a1[] = { "A", "B" };
                String a2[] = { "A", "B" };
                
                assertTrue(4 > 0);
               
                assertFalse(5 < 1);
                
                assertNull(str);
                
                assertNotNull(str2);
                
                assertSame(str, str);
                
                assertNotSame(str, str2);
                
                assertEquals(5, 5);
                
                assertNotEquals(5, 6);
                
                assertArrayEquals(a1, a2);
                
                assertSame(a1,a2);//fail
               
                assertSame(str2,str3);
                
                assertThrows(RuntimeException.class, new ThrowingRunnable() {
					public void run() throws Throwable {
					        throw new RuntimeException();
					}
				});       
        
        }
		
        
}