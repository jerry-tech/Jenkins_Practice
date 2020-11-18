package com.test;

import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class ttt {

    @Test
    public void addNumbers() {
     Main main = new Main();
     int total = main.addNumbers(2, 4);

      assertTrue(total > 3);
    }
}