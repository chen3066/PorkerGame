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
    }
    
    public Card seeHand(int index)
    {
       return hands.seeIndexHand(index);
    }
    
    
    public int HandRankSum()
    {
        int sum=0;
        for(int i=0;i<hands.seeAllHandRank().length;i++)
        {
            sum=sum+hands.seeAllHandRank()[i];
        }
        return sum;
        
    }
    
    
    public void play(Round rd,int a)
    {
        hands.toRound(rd, a);
    }
}
