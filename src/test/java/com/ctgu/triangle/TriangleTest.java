package com.ctgu.triangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(Parameterized.class)
public class TriangleTest {
    private int a;
    private int b;
    private int c;
    private String type;

    public TriangleTest(int a, int b, int c, String type) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = type;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {3, 4, 5, "一般三角形"},
                {1, 1, 2, "非三角形"},
                {4, 4, 5, "等腰三角形"},
                {4, 4, 4, "等边三角形"}
        });
    }

    @Test
    public void classifyTriangle() {
        assertEquals(type, Triangle.classifyTriangle(a, b, c));
    }
}