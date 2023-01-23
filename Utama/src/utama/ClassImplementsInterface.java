/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

/**
 *
 * @author RoyRaflesMatorangPasaribu
 */
public class ClassImplementsInterface implements Interface1, Interface2 {
    @Override
    public void myMethod1(){
        System.out.println("Method 1");
    }
    @Override
    public void myMethod2(){
        System.out.println("Method 2");
    }
    @Override
    public void myMethod3(){
        System.out.println("Method 3");
    }
}
