/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author zhang
 */
public class Deck {
    ArrayList<Card> deck = new ArrayList<>();
    
    public void deckShuffle()
    {
        Collections.shuffle(deck);
    }
    public void fillDeck()
    {
        for(int j=0; j<13; j++){
            deck.add(new Heart(j+1,"Heart"));
            deck.add(new Spade(j+1,"Sapde"));
            deck.add(new Club(j+1,"Club"));
            deck.add(new Diamond(j+1,"Diamond"));
            }
        }
    
    public void printDeck()
    {
        for(Card item:deck) {   
        
            System.out.println(item);
    }
    }
    
    public void removeTop()
    {
        deck.remove(0);
    }
    
    public Card getTop()
    {
        return deck.get(0);
    }
}   
   
