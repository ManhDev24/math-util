package com.manhdev24.mathutil.core;

public class MathUtility {
    // class này sẽ cung cấp các hàm tiện ích cho mọi nơi sử dụng
    // tiện ích cho mọi nơi dùng => thường thiết kế là static
    // hàm tính n giai thừa
    // hàm tính n! = 1 2 3 4 5
    // < 0! và 21! > ta ko tính được, ko có âm giai thừa. 20! vừa đủ kiểu long
    // 0! = 1! =1
    // 0! và 21 ! ta sẽ chửi, ném ra ngoại lệ
    public static long getFactorial (int n){
        if ( n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20!!!");
        if( n == 0 || n == 1 )
            return 1;

        // sống sót đến bước này thì n = 2 , 3 ,4 ... 20

        long result = 1; // tich ban dau = 1
        for (int i = 2; i <= n; i++) {
            result *= i; // nhân dồn vào
        }
        return result;

    }

}
