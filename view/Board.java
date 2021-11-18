package view;

import java.util.ArrayList;
import java.util.List;
import model.*;


public class Board {
	
	
	private int sizeOfBoard = 20;
	List<Square> squareList = new ArrayList<>();

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\033[0;34m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_lightBlue = "\033[0;36m";


	//method to create Board
	public void createBoard() {

		//create squares



	
		//create Go at position 1			
		squareList.add(0, new Go("Go", 1));
		//create Property Central at position 2
		squareList.add(1, new Property("Central", 2, 800, 90,"light blue"));
		squareList.add(2, new Property("Wan Chai", 3, 700, 65,"light blue"));
		squareList.add(3, new IncomeTax("Income Tax", 4));
		squareList.add(4, new Property("Stanley", 5, 600, 60,"light blue"));
		squareList.add(5, new InJailOrJustVisiting("InJailOrJustVisiting", 6));
		squareList.add(6, new Property("Shek O", 7, 400, 60,"red"));
		squareList.add(7, new Property("Mong Kok", 8, 500, 40,"red"));
		squareList.add(8, new Chance("Chance", 9));
		squareList.add(9, new Property("Tsing Yi", 10, 400, 15,"red"));
		squareList.add(10, new FreeParking("FreeParking", 11));
		squareList.add(11, new Property("Shatin", 12, 700, 75,"blue"));
		squareList.add(12, new Chance("Chance", 13));
		squareList.add(13, new Property("Tuen Mun", 14, 400, 20,"blue"));
		squareList.add(14, new Property("Tai Po", 15, 500, 25,"blue"));
		squareList.add(15, new GoToJail("GoToJail", 16));
		squareList.add(16, new Property("Sai Kung", 17, 400, 10,"yellow"));
		squareList.add(17, new Property("Yuen Long", 18, 400, 25,"yellow"));
		squareList.add(18, new Chance("Chance", 9));
		squareList.add(19, new Property("Tai O", 20, 600, 25,"yellow"));
		
		
		//test

		

	
	}

	public void printBoard(){

		//*******************************************************************Top level**************************************************************************//
		System.out.println(" —————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
		System.out.print("|     FreeParking    |");
		System.out.print("       Shatin       |");
		System.out.print("       Chance       |");
		System.out.print("      Tuen Mun      |");
		System.out.print("       Tai Po       |");
		System.out.println("      GoToJail      |");

		//Top level: price//
		System.out.print("|                    |");
		System.out.print("      HKD $700      |");
		System.out.print("                    |");
		System.out.print("      HKD $400      |");
		System.out.print("      HKD $500      |");
		System.out.println("                    |");

		//Top level: player
		System.out.print("|         11         |");
		System.out.print("         12         |");
		System.out.print("         13         |");
		System.out.print("         14         |");
		System.out.print("         15         |");
		System.out.println("         16         |");

		//Top level: color
		System.out.print("|                    |");
		System.out.print(ANSI_BLUE+"        blue        "+ANSI_RESET+"|");
		System.out.print("                    |");
		System.out.print(ANSI_BLUE+"        blue        "+ANSI_RESET+"|");
		System.out.print(ANSI_BLUE+"        blue        "+ANSI_RESET+"|");
		System.out.println("                    |");

		//*******************************************************************Second level**************************************************************************//
		System.out.println(" —————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
		System.out.print("|      Tsing Yi      |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("      Sai Kung      |");

		//Second level: price
		System.out.print("|      HKD $400      |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("      HKD $400      |");

		//Second level: player
		System.out.print("|         10         |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("         17         |");

		//Second level: color
		System.out.print("|"+ANSI_RED+"        red         "+ANSI_RESET+"|");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println(ANSI_YELLOW+"       yellow       "+ANSI_RESET+"|");


		//*******************************************************************Third level**************************************************************************//
		System.out.println(" —————————————————————                                                                                   —————————————————————");
		System.out.print("|       Chance       |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("     Yuen Long      |");

		//Third level: price
		System.out.print("|                    |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("      HKD $400      |");

		//Third level: player
		System.out.print("|          9         |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("         18         |");

		//Third level: color
		System.out.print("|                    |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println(ANSI_YELLOW+"       yellow       "+ANSI_RESET+"|");

		//*******************************************************************Fourth level**************************************************************************//
		System.out.println(" —————————————————————                                                                                   —————————————————————");

		System.out.print("|      Mong Kok      |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("       Chance       |");

		//Fourth level: price
		System.out.print("|      HKD $500      |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("                    |");

		//Fourth level: player
		System.out.print("|          8         |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("         19         |");

		//Fourth level: color
		System.out.print("|"+ANSI_RED+"        red         "+ANSI_RESET+"|");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("                    |");

		//*******************************************************************Fifth level**************************************************************************//
		System.out.println(" —————————————————————                                                                                   —————————————————————");

		System.out.print("|       Shek O       |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("       Tai O        |");

		//Fifth level: price
		System.out.print("|      HKD $400      |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("      HKD $600      |");

		//Fifth level: player
		System.out.print("|          7         |");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println("         19         |");

		//Fifth level: color
		System.out.print("|"+ANSI_RED+"        red         "+ANSI_RESET+"|");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                     ");
		System.out.print("                    |");
		System.out.println(ANSI_YELLOW+"       yellow       "+ANSI_RESET+"|");

		//*******************************************************************Bottom level**************************************************************************//
		System.out.println(" —————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
		System.out.print("|     In Jail or     |");
		System.out.print("       Stanley      |");
		System.out.print("  IncomeTax Pay10%  |");
		System.out.print("      Wan Chai      |");
		System.out.print("       Central      |");
		System.out.println("         Go         |");

		//Bottom level: price
		System.out.print("|    Just Visiting   |");
		System.out.print("      HKD $600      |");
		System.out.print("                    |");
		System.out.print("      HKD $700      |");
		System.out.print("      HKD $800      |");
		System.out.println("                    |");

		//Bottom level: player
		System.out.print("|          6         |");
		System.out.print("          5         |");
		System.out.print("          4         |");
		System.out.print("          3         |");
		System.out.print("          2         |");
		System.out.println("          1         |");

		//Bottom level: color
		System.out.print("|                    |");
		System.out.print(ANSI_lightBlue+"     light blue     "+ANSI_RESET+"|");
		System.out.print("                    |");
		System.out.print(ANSI_lightBlue+"     light blue     "+ANSI_RESET+"|");
		System.out.print(ANSI_lightBlue+"     light blue     "+ANSI_RESET+"|");
		System.out.println("                    |");
		System.out.println(" —————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");

	}


	public List<Square> getSquareList() {
		return squareList;
	}

	public int getSizeOfBoard() {
		return sizeOfBoard;
	}

	public void setSizeOfBoard(int sizeOfBoard) {
		this.sizeOfBoard = sizeOfBoard;
	}




	

}
