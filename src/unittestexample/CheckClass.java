/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unittestexample;

/**
 *
 * @author lebogangmok
 */
public class CheckClass {
    
    public boolean checkString(String myString)
    {
        /*if (myString.contains("!") && myString.length() < 4){
            return true;
        }
        else{
            return false;
        }*/
        
        return (myString.contains("!") && myString.length() <=4);
    }
    
    public int sum(int a, int b){
        
        /*int add = a +b;
        return add;*/
        
        return (a+b);
    }
    
}
