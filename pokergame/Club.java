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
public class Club extends Card{
    private String type="Club";
    public Club(int rank, String tp)
    {
        super(rank);
        this.type=tp;
    }

}
