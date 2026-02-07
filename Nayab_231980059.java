
//Nayab_231980059//

import java.util.Scanner;

public class Nayab_231980059{

public static void main(String[]args){

Scanner input=new Scanner (System.in);

//No of items from user//

System.out.print(" Enter the number of items : ");

int no_of_items=input.nextInt();

//Variables needed//

double price=0;
int quantity=0;
double sum_total=0;
double total_amount=0;

//For loop to take the price of each item and the number of each item to calculate the total amount// 

for(int i=1; i<=no_of_items; i++){

System.out.println("\n Item "+i);

System.out.print(" Enter the price of item : $");
price=input.nextDouble();

System.out.print(" Enter the quantity purchased : ");
quantity=input.nextInt();

total_amount=price*quantity;

//Sum of total amount from all the items//

sum_total +=total_amount;
}

//If number of items are less than 1 than does not print anything// 

if(no_of_items<1)
{
System.out.print("Please enter the number of items greater than 0");
}

//If number of items are greater than 1//

else{
System.out.println("\n  Total amount : $"+sum_total);
}

//for calculation of discount if number of items greater than 5//

if(no_of_items>5)
{
double discount=sum_total/10;
System.out.println("\n  10% Discount applied : $"+discount);

//total bill after discount//

double total_bill= sum_total-discount;
System.out.print("\n  Total bill after Discount : $"+total_bill);
}
}
}


