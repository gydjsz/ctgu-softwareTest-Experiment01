package com.ctgu.commission;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class CommissionTest {
    private int lock;
    private int stock;
    private int barrel;
    private String result;

    public CommissionTest(int lock, int stock, int barrel, String result) {
        this.lock = lock;
        this.stock = stock;
        this.barrel = barrel;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {33, 41, 17, "488.00美元"},
                {100, 10, 10, "lock的取值不在有效范围1~70内"},
                {10, 100, 10, "stock的取值不在有效范围1~80内"},
                {10, 10, 100, "barrel的取值不在有效范围1~90内"}
        });
    }

    @Test
    public void theCommission() {
        assertEquals(result, Commission.theCommission(lock, stock, barrel));
    }
}