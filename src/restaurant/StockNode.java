package restaurant;

/**
 * PICK UP LINE (FOR FUN):
 * *are you a hash table? cuz you’re the key that gives value to my life*
 * 
 * ************
 * This file is the "node" in the linkedlist at each index in the stock hashtable.
*/

public class StockNode {
    private Ingredient item; // data portion of node
    private StockNode next;  // link to next node

    /*
     * Constructor
     * @param item the Ingredient
     * @param next list to the next node in the list
     */
    public StockNode(Ingredient item, StockNode next) {
        this.item = item;
        this.next = next;
    }

    // Getter and Setter methods
    public Ingredient getIngredient() { return item; }
    public void setIngredient(Ingredient item) { this.item = item; }
    
    public StockNode getNextStockNode() { return next; }
    public void setNextStockNode(StockNode next) { this.next = next; }
}
