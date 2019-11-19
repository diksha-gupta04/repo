package com.infosys.demo;
import org.junit.Test;

//import static org.junit.Assert.*;

import org.junit.Assert;

public class AppTest 
{
	@Test
    public void testApp()
    {
        Assert.assertEquals(App.message(), "Hello");
    }
}
