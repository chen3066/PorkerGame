/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergame;

/**
 *
 * @author zhang
 */
public class Card {
    private int cardRank;
    
    public Card(int rank)
    {
        cardRank=rank;
    }
    
    @Override
    public String toString()
    {
            return Integer.toString(cardRank);
    }

}
