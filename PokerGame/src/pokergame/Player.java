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
public class Player {
    private String name;
    private String score;
    private String id;
    private Hand hands;
    
    public Player(String nm, String sc, String i, Hand hd )
    {
        this.hands=hd;
        this.id=i;
        this.name=nm;
        this.score=sc;
    }
    
    //ArrayList<Card> hand = new ArrayList<>();
    
    public void draw(Deck cards)
    {
        hands.addCard(cards);
        cards.removeTop();  
    }
    
    public Card seeHand(int index)
    {
       return hands.seeIndexHand(index);
    }
    
    public void printAllHand()
    {
        hands.seeAllHand();
    }
    public void play(Round rd,int a)
    {
        hands.toRound(rd, a);
    }
}
