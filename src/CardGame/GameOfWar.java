/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author Trevor
 */
public class GameOfWar implements Game{
    Deck deck = new Deck();
    Hand playerOneHand = new Hand();
    Hand playerTwoHand = new Hand();
    Hand p1Winnings = new Hand();
    Hand p2Winnings = new Hand();
    Hand comparePile = new Hand();
    Card p1Card;
    Card p2Card;

    @Override
    public void initialize() {
        System.out.println("Full Deck:");
        System.out.println(deck);
        System.out.println("Shuffled Deck:");
        deck.Shuffle();
        System.out.println(deck);
        System.out.println("Player One Hand:");
        deck.splitDeck(playerOneHand, playerTwoHand);
        System.out.println(playerOneHand);
        System.out.println("Player Two Hand:");
        System.out.println(playerTwoHand);
        //System.out.println(playerOneHand.cards.get(0).getCardInfo());
    }

    @Override
    public void play() {
        p1Card = playerOneHand.remove();
        System.out.println(p1Card.getCardInfo());
        p2Card = playerTwoHand.remove();
        System.out.println(p2Card.getCardInfo());
        
    }

    @Override
    public void displayWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
