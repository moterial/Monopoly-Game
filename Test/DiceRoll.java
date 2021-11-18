package Test;


import model.*;
import org.junit.jupiter.api.Test;



public class DiceRoll {

    Dice dice;

    @Test
    void diceTest1(){
        dice = new Dice();
        int result = dice.getResult();
        System.out.println("The result is "+result);

    }



}
