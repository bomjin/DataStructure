package Chap01;

 class Exam01_Test {

     static int max4(int a, int b, int c, int d) {
         int max = a;
         if(b > max)
             max = b;
         if(c > max)
             max = c;
         else if(d > max)
             max =d;
         return max;

     }
     static int min3(int e, int f, int g) {

         int min =  e;
         if(f < min)
             min =f;
         if(g < min)
             min =g;
         return min;


     }
     static int min4(int h, int i, int j, int k) {


         int min = h;
         if(h < min)
             min=h;
         if(i < min)
             min=i;
         if(j < min)
             min=j;
         else
             min=k;
         return min;




     }


     }

