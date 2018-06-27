package CardGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
public class Card {
    private Suit suit;
    private Number number;
    
    public Card(Suit suit, Number number){
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " of " + suit; //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCardInfo(){
        return number.getNumericalValue();
    }
}
