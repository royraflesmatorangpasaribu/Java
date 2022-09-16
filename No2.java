/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1.java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class No2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < a.length; i++){
            angka [i] = input.next();
        }
        
        int x, i, j, temp;
	for(i=0; i<x; i++){
		for(j=x-1; j>=i+1; j--){
			if (a[j]<a[j-1]){
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
        
        System.out.println(a[n]);
        
        
    }
    
}
