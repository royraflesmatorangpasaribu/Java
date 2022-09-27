import java.util.Scanner;

public class TugasRoy {

    public static void main(String[] args) {
        
        	//input
		Scanner input = new Scanner(System.in);
		System.out.println("Program By Roy Rafles Matorang Pasaribu");
		int menu = 1, option, totalChar = 0, i = 0, charCount = 0, totalNum, limit, exclude, hasil = 0;
        	double x, y, result = 0 ;
		String text = "";
		char findChar;
		//do-while loop
		do{
			System.out.println("\nInput 1 atau 2 atau 3 untuk Melihat Menu, Input 4 untuk Keluar Program");
			menu = input.nextInt();
			//if-else if statement / ladder if statements
			if(menu == 1){
   				System.out.println("1. Penjumlahan");
				System.out.println("2. Pengurangan");
				System.out.println("3. Pembagian");
				System.out.println("4. Perkalian");
				System.out.println("");
				System.out.print("Pilih Opsi (1,2,3,4) : ");
				option = input.nextInt();
				System.out.print("Input x = ");
				x = input.nextDouble();
				System.out.print("Input y = ");
				y = input.nextDouble();
            		//Switch statement
				switch(option){
					case 1:
						result = x + y;
						System.out.println("Hasil = "+result);
						//break:
						break;
					case 2:
						result = x - y;
						System.out.println("Hasil = "+result);
						break;
					case 3:
						result = x / y;
						System.out.println("Hasil = "+result);
						break;
					case 4:
						result = x * y;
						System.out.println("Hasil = "+result);
						break;
					default:
						System.out.println("Pilihan Opsi Tidak Tersedia");
				}
				
			}
			else if(menu == 2){
				System.out.println("1. Menghitung karakter dari teks tanpa spasi");
				System.out.println("2. Menghitung total karakter spesifik dari teks tanpa spasi");
				System.out.println("");
				System.out.print("Pilih Opsi : ");
				option = input.nextInt();
				System.out.print("Input Text : ");
				text = input.next();
				//if-else statement
				if(option == 1){
					System.out.print("Input karakter : ");
					findChar = input.next().charAt(0);
					//while loop
					while(i < text.length()){
						if(text.charAt(i) == findChar){
							charCount++;
						}i++;
					}
					hasil = charCount;
					charCount = 0;
				}
				else{
					//for loop
		           		for(i = 0; i < text.length(); i++){
						if(text.charAt(i)!=' '){
							charCount++;
						}
		           		}
		            		hasil = charCount;
		            		charCount = 0;
				}
                		System.out.print("Hasil = "+hasil);
		    	}
		    	else if(menu == 3){
				System.out.println("1. Cetak number menggunakan Limit");
				System.out.println("2. Cetak number dengan Exclude");
				System.out.println("");
				System.out.print("Pilih Opsi : ");
				option = input.nextInt();
				System.out.print("Input total number = ");
				totalNum = input.nextInt();
				if(option == 1){
					System.out.print("Input limit = ");
					limit = input.nextInt();
					for(i = 0; i < totalNum; i++){
					    	//nested if statement
						if(i == limit){
							break;
						}
						System.out.print(i+1+" ");
					}
				}
				else{
					System.out.print("Exclude number = ");
					exclude = input.nextInt();
					for(i = 1; i <= totalNum; i++){
						//if statement
						if(i == exclude){
							//continue
							continue;
						}
    		            			System.out.print(i+" ");
					}
				}
			}
			else{
				System.out.println("\nTerima Kasih \nProgram by 2117051058");
			}
		}while(menu == 1 || menu == 2 || menu == 3);
    }
}
