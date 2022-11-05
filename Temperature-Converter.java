import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("****************************************************************************************************************");
	    System.out.println("                                         TEMPERATURE CONVERTER");
		System.out.println("****************************************************************************************************************");
		System.out.println();
		System.out.println();
		String again="yes";
		while(again.equals("yes")){
		System.out.println("In which unit you want to enter the temperature? (celsius/fahrenheit/kelvin)");
		String unit=scan.next();
		System.out.println("Enter the temperature");
		double x=scan.nextInt();
		System.out.println();
		System.out.println();
		if(unit.equals("celsius")){ 
		System.out.println("In which following Units you want to convert the temperature?");
		System.out.println("1>>>> Celsius");
		System.out.println("2>>>> Fahrenheit");
		System.out.println("3>>>> Kelvin");
		int choice=scan.nextInt();
		switch(choice){
		    case 1:
		        System.out.println("Already in celsius ");
		        break;
		    case 2:
		        double F = ((x * 9)/5) + 32;
		        System.out.println("celsius into fahrenheit "+F);
		        break;
		    case 3:
		        double k=x + 273.15;
		        System.out.println("celsius to kelvin "+k);
		        break;
		}
		    
		}
		else if(unit.equals("fahrenheit")){
		   System.out.println("                          In which following Units you want to convert the temperature?                         ");
		System.out.println("1>>>> Celsius");
		System.out.println("2>>>> Fahrenheit");
		System.out.println("3>>>> Kelvin");
			int choice=scan.nextInt();
		switch(choice){
		    case 1:
		        double C =((x-32)*5)/9;
		        System.out.println("Fahrenheit into celsius "+C);
		        break;
		    case 2:
		        System.out.println("Already in Fahrenheit");
		        break;
		    case 3:
		        double K =(((x - 32) * 5)/9) + 273.15;
		        System.out.println("Fahrenheit into Kelvin "+K);
		        break;
		    
		}
		}
		else if(unit.equals("kelvin")){
		   System.out.println("                          In which following Units you want to convert the temperature?                         ");
		System.out.println("1>>>> Celsius");
		System.out.println("2>>>> Fahrenheit");
		System.out.println("3>>>> Kelvin");
			int choice=scan.nextInt();
		switch(choice){
		    case 1:
		        double C = x - 273.15;
		        System.out.println("Fahrenheit into celsius "+C);
		        break;
		    case 2:
		        double F = (x - 273.15) * 9/5 + 32;
		        System.out.println("kelvin into Fahrenheit "+F);
		        break;
		    case 3:
		        System.out.println("Already in kelvin");
		        break;
		    
		}
		}
		else{
		    System.out.println("Sorry!!! not convertable you entered wrong unit");
		    break;
		}
		 System.out.println();
		  System.out.println();
		System.out.println("-------------------------------------------- Want to convert more(yes/no)???                                     ");
		again=scan.next();
		}
		 System.out.println();
		  System.out.println();
		System.out.println("-------------------------------------------- Thank you....Have a nice day :)                                          ");
		
	
}
}