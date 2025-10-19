package com.example.tutorbuoi4.cap1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumServiceTest {
    ArraySumService service;
    @BeforeEach
    void setUp() {
        service = new ArraySumService();
    }

    @Test
    void tuongDuong_testArraySumHopLe() {
        int[] arr = {2,3,4,5,6,7};
        assertEquals(27, service.sumArray(arr));
    }

    @Test
    void null_testArrayFalse() {
        assertThrows(IllegalArgumentException.class, () ->{
            service.sumArray(null);
        });
    }

    @Test
    void duoiBienDuoi_testArrayFalse() {
        assertThrows(IllegalArgumentException.class, () ->{
            service.sumArray(new int[]{-1, 2, -3});
        });
    }



    @AfterEach
    void tearDown() {
        service = null;
    }
}