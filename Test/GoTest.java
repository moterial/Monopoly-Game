package Test;

import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoTest {

    List<Player> playerList = new ArrayList<>();
    Go go;
    @BeforeEach
    public void addPlayer(){
        playerList.add(0, new Player(1));
        playerList.add(1, new Player(2));
        playerList.add(2, new Player(3));
    }

    @Test
    public void test1(){
        go = new Go("Go", 1);
        System.out.println(playerList.get(0).getMoney());
        go.Trigger_Go(playerList.get(0));
        System.out.println(playerList.get(0).getMoney());
        assertEquals(playerList.get(0).getMoney(),3000);

    }





}
