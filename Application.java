import java.io.*;
import java.util.Scanner;

import controller.GAME_CONTROLLER;
import org.json.JSONObject;

public class Application {
	
   
    public static String command;



    public static void main(String[] args){


        JSONObject saveData = null;
    	
        // Initialize and utilize the system
    	System.out.println("\n" +
                "░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝\n" +
                "░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░\n" +
                "░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░\n" +
                "░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗\n" +
                "░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝");

        boolean started = true;

        
        //create game controller
    	GAME_CONTROLLER gc = new GAME_CONTROLLER();
   
        //keep looping if user input invalid input
        while(started) {
        
            System.out.println("");
            System.out.println("Select the commands below (Type the number): ");
            System.out.println("1.New game");
            System.out.println("2.Load game");
            System.out.println("3.How to play");
            System.out.println("0.Exit Monopoly");
            System.out.println("");

           
            //create scanner, get user input 
            Scanner scanner = new Scanner(System.in);
            
            command = scanner.nextLine();
            
      
            
            //functions
            switch (command){
                
            	//"0.Exit Monopoly"
                case "0":
 
                	System.exit(0);
                    
                    break;

                    
                //"1.New game"
                case "1":
                   
                	     
                	
                	int numOfPlayer = 0;
              
                	
                	boolean flagForCase1 = true;
                	//keep looping if user input invalid number
                    while(flagForCase1) {
                    	     	
                    	
                    	
                    	System.out.println("Enter the number of players (2 to 6): \n");
                    	
                    	
                    	
                    	try {
                         	
                    		//get user input and close scanner 
                    		numOfPlayer = scanner.nextInt();
                            
                    		
                    		
                    		
                             
           	
                    		//if input is not between 2 to 6, tell user and keep asking input
                    		if( (numOfPlayer > 6) || (numOfPlayer < 2)) {
                    		
                    		
                    			throw new ArithmeticException("Input should be number 2 to 6, try again...\n");
                    		
                    		
                    		}
                    	
                    	}
                    	
                    	//if input is not integer, keep looping
                        catch (Exception e) {
                            
                       	 System.out.println("Input should be number 2 to 6, try again...\n");
                       	 scanner.nextLine();
                       	 continue;
                            
                        }
                    	
                    	
                    	//input is valid, break loop
                    	break;
                    	
                    }  
                    
                    
                    
                    gc.startGame(numOfPlayer, saveData);
                    started = false;
                    break;

                    
                    
                //"2.Load game"
                case "2":


                    int saveNum = 1;
                    boolean flagForCase2 = true;
                    //keep looping if user input invalid number
                    //only have 3 save space, ask user which save they want to load
                    while(flagForCase2) {



                        System.out.println("Enter the save number(1, 2, 3): \n");

                        try {

                            //get user input and close scanner
                            saveNum = scanner.nextInt();


                            //if input is not between 2 to 6, tell user and keep asking input
                            if( (saveNum > 3) || (saveNum < 1)) {


                                throw new ArithmeticException("Input should be number 1 to 3, try again...\n");


                            }

                        }

                        //if input is not integer, keep looping
                        catch (Exception e) {

                            System.out.println("Input should be number 1 to 3, try again...\n");
                            scanner.nextLine();
                            continue;

                        }

                        //input is valid, break loop
                        break;

                    }

                    //read the json string from txt and turn into json object

                    try {

                        //load save file
                        saveData = new JSONObject( turnFileToString("save/save" + saveNum + ".json") );


                    } catch (Exception e) {
                        System.out.println("Error:" + e);
                        e.printStackTrace();
                    }

                    //pass the json to load game
                    gc.startGame(Integer.parseInt(saveData.getString("totalPayer")), saveData);
                  
                    break;


                //"3.How to play"
                case "3":


                    break;
                    
                    
                //validation
                default:
                	
                	System.out.println("Wrong input, try again...\n");	
                	

            }
            
        }





    }

    //change txt to string object
    private static String turnFileToString(String fileName){
        String str = "";
        try {
            InputStream is = new FileInputStream(fileName);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));

            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();

            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }

            String fileAsString = sb.toString();

            return fileAsString;

        } catch(Exception e){
            System.out.println("Error: " + e);
        }

        return str;
    }

}

