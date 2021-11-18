package Test;



import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class incomeTaxTest {
    List<Player> playerList = new ArrayList<>();
    IncomeTax incomeTax;
    @BeforeEach
    public void addPlayer(){
        playerList.add(0, new Player(1));
        playerList.add(1, new Player(2));
        playerList.add(2, new Player(3));
    }

    @Test
    public void test1(){
        incomeTax = new IncomeTax("Income Tax", 4);
        playerList.get(0).setMoney(1415);
        incomeTax.Trigger_incomeTax(playerList.get(0));
        assertEquals(playerList.get(0).getMoney(),1275);

    }
}
