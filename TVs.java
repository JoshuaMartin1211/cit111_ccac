/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject;

//import java.util.Scanner;
/**
 *
 * @author joshm
 */
public class TVs {
     private int tvPrice;
    private String tvName;
    private double tvSize;



    public int getPrice(){
        return tvPrice;
    }
    public void setPrice(int tvPrice){
        this.tvPrice = tvPrice;
    }
    public String getTvName(){
    return tvName;
    }
    public void setTvName(String tvName){
        this.tvName = tvName;
    }
    public double getTvSize(){
        return tvSize;
    }
    public void setTvSize(double tvSize){
        this.tvSize = tvSize;
    }
}
