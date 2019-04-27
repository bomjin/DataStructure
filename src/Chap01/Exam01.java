package Chap01;

 class Exam01 {

    static int max3(int a,int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
    return max; //구한 최댓갑을 호출한 곳으로 반환
    }
}


