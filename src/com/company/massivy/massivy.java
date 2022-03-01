package com.company.massivy;

public class massivy {


    public static void main(String[] args) {

        int [] b  = {123,3123,243,234,5534,64,24,534,453,35,46,46};
        int max=b[1];
        for (int i =1;i < b.length;i++) {
            if(b[i]<max){
                max=b[i];
            }

        }
        System.out.println(max);



//    int maxint=b[1];
////
////        for (int i = 1; i < b.length; i++) {
////            if (b[i]<maxint){
////                maxint=b[i];
////            }
////        }
////        System.out.println(maxint);





    }
//    int n [] = {2,3,4,5,6,7,8,9,7,10,1,9,44,55,66};
//    int  n2 [] = new int[];
//
//        for (int i = 0; i < n.length; i++) {
//        if(n[i]%2==0){
//            System.out.println(n[i]);
//        }
//    }

}
