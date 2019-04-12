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
public class Diamond extends Card{
    private String type="Diamond";
    public Diamond(int rank, String tp)
    {
        super(rank);
        this.type=tp;
    }

}
