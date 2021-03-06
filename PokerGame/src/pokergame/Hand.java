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
public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();
    
    public void addCard(Deck cards)
    {
        hand.add(cards.getTop());      
    }
    
    public Card seeIndexHand(int index)
    {
        return hand.get(index);
    }
    
    public void seeAllHand()
    {
        for(Card item: hand)
            System.out.println(item.toString());
    }
    
    public void toRound(Round rd, int index)
    {
        rd.addCard(hand.get(index));
    }
}
