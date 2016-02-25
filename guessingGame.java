package assignment;

import java.util.Random;
import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args){
		
		loginCheck();
		guessNumber();
		
		//ask user
		String again;
		
		Scanner inS=new Scanner(System.in);
		
		//ask whether play again or no
		while(true){
		System.out.println("Do you want to play again?");
		System.out.println("Please type 'y','Y' or 'n','N'");
		again=inS.next();
		
		if(again.equals("y")||again.equals("Y")){
			guessNumber();}
		
		else if(again.equals("n")||again.equals("N")){
			System.out.println("Thank you for playing game");
			break;
		}
		
		//prompt user to enter valid input 'y', 'Y' or 'n', 'N'
		else{
		    System.out.println("Please type 'y','Y' or 'n','N'");
			again=inS.next();
		    if(again.equals("y")||again.equals("Y")){
				guessNumber();
			}
			else if(again.equals("n")||again.equals("N")){
				System.out.println("Thank you for playing game");
				break;
			}
		    
		}	}	
		
	 }
	
	//login check
	public static void loginCheck(){
		String username="keita",password="admin";
		
		Scanner inS=new Scanner(System.in);
		
		while(true){
		System.out.println("Type username");
		username=inS.nextLine();
			
		System.out.println("Type password");
		password=inS.nextLine();
		
		if(username.equals("keita")&&password.equals("admin")){
			System.out.println("Welcome "+username);
			break;
		}
		else{
			System.out.println("your username or password is incorrect");
		}
		}
		
	}
	
	//guess secret number game
	public static void guessNumber(){
		//user number
		int userNum;
				
		//How many times the user can try
		int numberOfTries=5;
				
				
				
		//secret number...answer.Between 1 to 20
		Random rannumber = new Random();
		int secretNum = rannumber.nextInt(20)+1;
				
		Scanner inS = new Scanner(System.in);
				
		//ask the user until that count will be 5
		while(numberOfTries>0){
			numberOfTries--;
			System.out.println("Type number between 0 to 20");
			userNum = inS.nextInt();
					
		//if the number is collect
		if(userNum==secretNum&&numberOfTries>0){
			System.out.println("You won");
			break;
				
		}
				
		//if usernumber is lower than secretnumber
		else if (userNum<secretNum&&numberOfTries>0){
			System.out.println("You guessed low number");
					
				}
				
		//if usernumber is higher than secretnumber
		else if (userNum>secretNum&&numberOfTries>0){
			System.out.println("You guessed high number");
					
				}
		else{
			System.out.println("You lose.Game over");
			break;
					
				}
					
				}

	}

}