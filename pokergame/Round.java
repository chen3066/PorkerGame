/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;
import java.util.ArrayList;
/**
 *
 * @author zhang
 */
public class Round {
    ArrayList<Card> round = new ArrayList<>();
    
    public void addCard(Card card)
    {
        round.add(card);
    }
}
