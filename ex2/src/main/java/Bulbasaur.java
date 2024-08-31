public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        // TODO: Initialize id and level with appropriate values
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        if (lv > 16 && lv < 32)
            id = 2;
        else if (lv > 32)
            id = 3;
        
        level = lv;

    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return level; // Placeholder return value
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        if (id == 1)
            return "Bulbasaur";
        else if (id == 2)
            return "Ivysaur";
        else
            return "Venusaur";
        //return ""; // Placeholder return value
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return id; // Placeholder return value
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return "The level is " + level + " and the id is " + id; // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // TODO: Implement this method
        // Compare this Bulbasaur object with another object
        if (obj instanceof Bulbasaur) {
            Bulbasaur b = (Bulbasaur)obj;
            if (id == b.getID() & level == b.getLevel())
                return true;
        }
        return false; // Placeholder return value
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur newBulbasaur = new Bulbasaur();
        newBulbasaur.setLevel(level);

        return newBulbasaur; // Placeholder return value
    }
}