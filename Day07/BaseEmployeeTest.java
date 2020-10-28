package com;

import Day07.BaseEmployee;
import Day07.MarkeEmployee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @ClassName BaseEmployeeTest
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/26
 **/

public class BaseEmployeeTest {
    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        BaseEmployee be = new MarkeEmployee("admin");
        assertEquals(3000, be.getSalary());
    }

}
