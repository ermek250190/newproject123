package com.company.massivy;

public class Massiv3 {
    public static void main(String[] args) {
        int n[] = {2, 3, 4, 5, 6, 7, 8, 9, 7, 10, 1, 9, 44, 55, 66};

        int n2 []  = new int[n.length];//четные // 2 0 4 0 6 0 8 0 0 10 0 0 0 0 0 0 0
        int n3 []  = new int[n.length];// не четные



        for (int i = 0,j=0; i < n2.length; i++) {
           if(n[i]%2==0){
               n2[i]= n[i];
               j++;
           }
        }

        for (int i : n2) {
            System.out.print(i+" ");

        }
        System.out.println();

        for (int i = 0; i < n3.length; i++) {

        }














        for (int i : n2) {
            System.out.println(i);

        }


    }
}