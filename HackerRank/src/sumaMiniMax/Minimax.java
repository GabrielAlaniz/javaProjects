/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaMiniMax;

/**
 *
 * @author gabri
 */
public class Minimax {

    static void miniMaxSum(int[] arr) {
        long m=999999999, M=0, suma=0, min, max;
        for(int i=0;i<arr.length;i++){
            suma+=arr[i];
            if(arr[i]<m) m = arr[i];
            if(arr[i]>M) M = arr[i];
        }
        min = suma-M;
        max = suma-m;
        System.out.println(min+" "+max);
        
    }


    public static void main(String[] args) {
        int[] arr = {769082435, 210437958, 673982045, 375809214, 380564127};
        
        miniMaxSum(arr);
        
    }
}
