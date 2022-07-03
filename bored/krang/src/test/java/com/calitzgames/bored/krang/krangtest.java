package com.calitzgames.bored.krang;

import org.junit.Assert;
import org.junit.Test;

public class krangtest {

    private final Krang m_krang = new Krang();
    @Test
    public void print_lin_test(){
        String test_str = "This is a test string";
        String returned_str = m_krang.print_lin(test_str);

        Assert.assertEquals(test_str, returned_str);
    }
}
