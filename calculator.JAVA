/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Hello World");
		int menu = 1, option, x, y, result = 0, totalChar = 0, i = 0, charCount = 0, totalNum, limit, exclude;
		String text = "";
		char findChar;
		do{
		    System.out.println("Press 1 or 2 or 3 to view menu");
		    menu = input.nextInt();
		    if(menu == 1){
    		    System.out.println("1. Addition");
    		    System.out.println("2. Substraction");
    		    System.out.println("3. Division");
    		    System.out.println("4. Multiplication");
    		    System.out.println("");
    		    System.out.println("Your option : ");
    		    option = input.nextInt();
    		    System.out.println("Input x = ");
    		    x = input.nextInt();
    		    System.out.println("Input y = ");
    		    y = input.nextInt();
    		    switch(option){
    		        case 1:
    		            result = x + y;
    		            break;
    		        case 2:
    		            result = x - y;
    		            break;
    		        case 3:
    		            result = x / y;
    		        case 4:
    		            result = x * y;
    		        default:
    		            System.out.println("");
    		    }
    		    System.out.println("Result = "+result);
		    }
		    else if(menu == 2){
		        System.out.println("1. Count character from text without space");
    		    System.out.println("2. Count total specific character from text");
    		    System.out.println("");
    		    System.out.println("Your option : ");
    		    option = input.nextInt();
		        System.out.println("Input text : ");
		        text = input.next();
		        if(option == 1){
		            System.out.println("Enter character : ");
		            findChar = input.next().charAt(0);
		            while(i < text.length()){
		                if(text.charAt(i) == findChar){
		                    charCount++;
		                }i++;
		            }
		            result = charCount;
		        }else{
		            for(i = 0; i < text.length(); i++){
		                if(text.charAt(i)!=' '){
		                    charCount++;
		                }
		            }
		            result = charCount;
		        }
		        System.out.println("Result = "+result);
		        
		    }
		    else if(menu == 3){
		        System.out.println("1. Print number using limit");
    		    System.out.println("2. Print exluce number");
    		    System.out.println("");
    		    System.out.println("Your option : ");
    		    option = input.nextInt();
    		    System.out.println("Input total number = ");
    		    totalNum = input.nextInt();
    		    if(option == 1){
		            System.out.println("Input limit = ");
    		        limit = input.nextInt();
    		        for(i = 0; i < totalNum; i++){
    		            if(i == limit){
    		                break;
    		            }
    		            System.out.print(i+" ");
    		        }
		        }else{
		            System.out.println("Exclude number = ");
    		        exclude = input.nextInt();
    		        for(i = 0; i < totalNum; i++){
    		            if(i == exclude){
    		                continue;
    		            }
    		            System.out.print(i+" ");
    		        }
		        }
		    }
		    else{
		        System.out.println("Thank you");
		    }
		}while(menu == 1 || menu == 2 || menu == 3);
    }
    
}
