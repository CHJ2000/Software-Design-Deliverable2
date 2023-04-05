/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable2;

import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private int id;
    private String name;
    private int score;
    private GroupOfCards hand;
    //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param id
     * @param name the unique ID to assign to this player.
     */
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.score = 0;
        this.hand = new GroupOfCards();
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

    public int getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return this.score;
    }

    /**
     * 
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public GroupOfCards getHand() {
        return this.hand;
    }

    /**
     * 
     * @param hand
     */
    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }

    public void showHand() {
        // TODO - implement Player.showHand
        throw new UnsupportedOperationException();
    }

    public void reshuffle() {
        // TODO - implement Player.reshuffle
        throw new UnsupportedOperationException();
    }

    public void leaveGame() {
        // TODO - implement Player.leaveGame
        throw new UnsupportedOperationException();
    }

    public List<Integer> getScoreHistory() {
        // TODO - implement Player.getScoreHistory
        throw new UnsupportedOperationException();
    }

}
