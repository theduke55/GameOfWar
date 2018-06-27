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
public enum Suit {
    SPADES (3),
    HEARTS (2),
    DIAMONDS (1),
    CLUBS (0);
    
    private final int numericalValue;
    
    Suit(int numericalValue){
        this.numericalValue = numericalValue;
    }
}
