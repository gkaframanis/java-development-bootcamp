package models;
public class Machine {
    private Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }
    
    public Item getItem(int row, int spot) {
        return this.items[row][spot] == null ? null : new Item(this.items[row][spot]);
    }
    
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    public void dispense(int row, int spot) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Can't call dispense when machine is empty.");
        }
        if (items[row][spot].getQuantity() == 0) {
            throw new IllegalArgumentException("Can't dispense an item with quantity of 0.");
        }
        items[row][spot].setQuantity(items[row][spot].getQuantity() - 1);
    }

        /**
     * Name: isEmpty
     *
     * @return (boolean)
     * Inside the function:
     *   • returns true if there are no more items.
     * 
     */

    public boolean isEmpty() {
        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items[i].length; j++) {
                if (this.items[i][j] != null){
                    return false;
                }
            }
            
        }
        return true;
     }

     public int getLength() {
        return this.items.length;
     }

     public int getRowLength() {
        return this.items[0].length;
     }

    public String toString() {
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }

}
