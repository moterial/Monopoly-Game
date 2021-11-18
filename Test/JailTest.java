package Test;


import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JailTest {
    List<Player> playerList = new ArrayList<>();
    GoToJail goToJail;

    @BeforeEach
    public void addPlayer(){
        playerList.add(0, new Player(1));
        playerList.add(1, new Player(2));
        playerList.add(2, new Player(3));
    }

    @Test
    public void JailTest1(){
        goToJail = new GoToJail("GoToJail", 16);
        int jailMove;
        goToJail.Trigger_GoJail(playerList.get(0));
        jailMove = goToJail.escapeJail(playerList.get(0),playerList.get(0).getJailStop());
        System.out.println(jailMove);
        for(int i=0; i<playerList.get(0).getJailStop();i++){
            if(jailMove>0){
                System.out.println("Escaped done!");
                break;
            }else{
                jailMove = goToJail.escapeJail(playerList.get(0),playerList.get(0).getJailStop());
                playerList.get(0).setJailStop(playerList.get(0).getJailStop()-1);
            }
        }

    }
}
