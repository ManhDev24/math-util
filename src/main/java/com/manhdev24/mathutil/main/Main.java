package com.manhdev24.mathutil.main;

import com.manhdev24.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();

    }

    // ta sẽ test hàm của ta viết ra, gọi là unit testing - test những đơn vị code cơ bản nhất
    // ta cần test hàm getFactorial() với các bộ data đưa vào -> những test case
    // test case những bộ data đưa vào hàm vào app và cách thức xài bộ data này và kết quả kì vọng app/ hàm sẽ trả về


    // TEST CASE 1 :

    //DESCRIPTION
    //  to check, to verify the getFactorial() method with correct given argument, e.g n = 5
    //  kiểm tra hàm giai thừa có đúng với n = 5 hay ko?

    // STEP/PROCEDURES:(CÁC BƯỚC TEST HÀM/APP, NHẤN GÌ , NHẬP GÌ)
    // CALL getFactorial() method with valid arg : getFactorial(5)

    // EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 0)
    // TO HAVE THE NUMBER 120 AS THE RESULT OF 5!

    // STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP, CHẠY HÀM)
    // PASS , FAILED (BUG)
    // CHỜ XEM HÀM, APP XỬ LÍ ĐƯỢC SỐ MẤY  - ACTUTAL VALUE
    // ĐI SO SÁNH VỚI EXPECTED VALUE Ể LUẬN ĐÚNG SAI
    // MLEM VÌ 0! TRẢ VỀ 1 THẬT MÀ
    // VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHẠY ĐÚNG N = 0 HAY KO

    static void testFactorialGivenRightArgument5ReturnsWell(){
        int n = 5; // dự tính tính 0!
        long expectedResult = 120;
        long actualResult = MathUtility.getFactorial(n);  // tính thử 0! bằng hàm
        // so sánh
        System.out.println(n + "! = \n"
                                    +"expected value: " + expectedResult + "\n"
                                    +"actual value: " + actualResult);
    }

    // TEST CASE 1 :

    //DESCRIPTION(Mô tả mục đích test case, test case dùng test điều gì ?)
    //  to check, to verify the getFactorial() method with correct given argument, e.g n = 0
    //  kiểm tra hàm giai thừa có đúng với n = 0 hay ko?

    // STEP/PROCEDURES:(CÁC BƯỚC TEST HÀM/APP, NHẤN GÌ , NHẬP GÌ)
    // CALL getFactorial() method with valid arg : getFactorial(0)

    // EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 0)
    // TO HAVE THE NUMBER 1 AS THE RESULT OF 0!

    // STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP, CHẠY HÀM)
    // PASS , FAILED (BUG)
    // CHỜ XEM HÀM, APP XỬ LÍ ĐƯỢC SỐ MẤY  - ACTUTAL VALUE
    // ĐI SO SÁNH VỚI EXPECTED VALUE Ể LUẬN ĐÚNG SAI
    // MLEM VÌ 0! TRẢ VỀ 1 THẬT MÀ
    // VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHẠY ĐÚNG N = 0 HAY KO

    static void testFactorialGivenRightArgument0ReturnsWell(){
        int n = 0; // dự tính tính 0!
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);  // tính thử 0! bằng hàm
        // so sánh
        System.out.println(n + "! = \n"
                +"expected value: " + expectedResult + "\n"
                +"actual value: " + actualResult);
    }

}