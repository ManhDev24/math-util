package com.manhdev24.mathutil.core.test;

import com.manhdev24.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // class này sẽ chứa các hàm kiểm thử code  theo style DDT
    // DATA DRIVEN TESTING, TA TÁCH CODE KIỂM THỬ (CÁC LỆNH ASSERT() ) RIÊNG
    // KO GỘP CHUNG VỚI BỘ DATA KIỂM THỬ
    // MỤC TIÊU DỄ ỌC CODE KIỂM THỬ , DỄ ĐÁNH GIÁ ĐƯỢC XEM CÓ BAO NHIÊU TEST CASE ĐANG ĐƯỢC TEST
    // ĐÃ ĐỦ HAY CHƯA VÌ NÓ RẤT DỄ NHÌN
    // -> GIÚP NGUYÊN LÍ PESTICIDE PARADOX

    // BỘ DATA ĐƯA VÀO TEST SẼ ĐỂ RIÊNG Ở 1 HÀM PUBLIC STATIC
    // hàm này trả về 1 mảng các con số âm < 0 hoặc > 20 đó là những n gây ra ngoại lệ khi ta xài hàm getFactorial()
    // ta test xem hàm có ném ngoại lệ hay ko với data cà trớn
    public  static  Integer[] initWrongDataSet(){
        return new Integer[] { -1,-2,-3,-4,-100,-1000, 21,22 ,23,190,100,1999};
    }
    // Test case # 1.... : check if getFactorial() throws Illega lArgumentException
    // in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowException(int n){
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    // Test case #... : checkFactorial() with right argument and runs well
    // n = 0, 1 ,2 ,3 ,4 .... 18 19 20

    public static Object[][] initRightDataSet(){
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {5, 120},
                {6, 7200}
        };
    }
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }

}