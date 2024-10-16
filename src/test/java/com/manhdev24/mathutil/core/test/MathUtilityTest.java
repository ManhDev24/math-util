package com.manhdev24.mathutil.core.test;

import com.manhdev24.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public void  testFactorialGivenWrongArgumentsThrowsException () {

        // MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ như kì vọng hay không
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-1);
        }); assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-100);
        }); assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(21);
        }); assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(22);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(50);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(100);
        });
    }

    // test case #4 : check getFactorial() with n =  -1 -2 -3- 4- 5 21 22 23 24
    @Test
    public void  testFactorialGivenWrongArgumentsMinus5ThrowsException () {

           // MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ như kì vọng hay không
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });
    }
    // thấy ngoại lệ mừng rơi nước mắt
    // vì hàm thiết kế rằng đưa n<0 || n> 29 thì ngoại lệ phải được ném ra
    // vậy nếu hàm ném ngoại lệ khi n <= -5 rõ ràng hàm đúng, hàm đúng thì phải xanh
    // xanh vì trả về ngoại lệ đúng như kì vọng

    // test case #3 (Gộp) : check getFactorial() with n = 2 3 4 5 6 ....

    @Test
    public void  testFactorialGivenRightArgumentsReturnWell (){

        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));


    }
    // bad smells = đoạn code bốc mùi ( robert c , martin)
     // code bị lặp lại trộn lộn xộn test  data và lệnh kiểm thử
    // ta cần tối ưu tinh chỉnh lại code - refactor , refactoring


    // test case #2 : check getFactorial() with n = 1
    // ...
    @Test
    public void  testFactorialGivenRightArgument1ReturnWell (){
        long expectedValue = 1; // hy vọng 0! trả về 1
        long actualValue = MathUtility.getFactorial(1); // giả bộ trả về 10

        // so sánh 2 thằng expected value vs actual
        assertEquals(expectedValue, actualValue);
    }




    // test case structure : ID, Description, Step/procedure
    //                  Expected result , status: pass/ fail
    //                      BUG ID (Bugzilla, jira)
    // test case #1 : check getFactorial() with n = 0
    // ...
    @Test
    public void  testFactorialGivenRightArgument0ReturnWell (){
        long expectedValue = 1; // hy vọng 0! trả về 1
        long actualValue = MathUtility.getFactorial(0); // giả bộ trả về 10

        // so sánh 2 thằng expected value vs actual
        assertEquals(expectedValue, actualValue);
    }

}