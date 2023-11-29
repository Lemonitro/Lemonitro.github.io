public class refinery_building extends building{
    private String Lumber = "Lumber";// I'll make it later...
    private String Cutstone = "Cutstone";
    public Object[] refinery_recipes = new Object[]{Lumber, Cutstone};

    public refinery_building(){
        super();
        this.value = 2000;
            building_table.put("Value", value);
        this.upgrade_lvl_tree.root = new Node(0);
            building_table.put("Upgrade Level", upgrade_lvl);
        this.building_name = "Refinery";
            building_table.put("Building Name", building_name);
        this.craft_recipe = "Null"; 
            building_table.put("Craft Recipe", craft_recipe);
    }

    //COMPLICATED S**** I DONT WANT TO MAKE SENSE OF
    /*There once was a man, called Kirito. He was gay, a gay boy, a gaymer you might say. and one day he said "LINK START" and got trapped in a fantasy world (Typical isekai amr) only to then fall in love with the first non-npc looking person in the game, ergo Balls. Balls and Kirito nurtured a relationship that trancended conventional bounds, they somehow once Mpreg Balls, and they had a child, called Yui. Only Yui wasn't legally immigrated to the server so she done got deported back to motherland, only leaving a crystal behind.
     * Btw, there was a female characther, but women are bad, so we forget about her. Unless its gay. Btw, its good that Kirito and Balls are gay, bc it made the story gay, and all thats is gay is happy
     * Balls and Kirito fough to the end to win the game and escape its clutches, so they would be more then ecouples, and eboyfriend. Also they wanted to play league together in botlane but there was no league in SAO.
      */

    public Object info(){
        return building_table;
    }

    public Object recipeinfo(){
        return refinery_recipes;
    }

    public Object upgrade(){
    this.upgrade_lvl_tree.root.left = new Node(2);
    upgrade_lvl = upgrade_lvl_tree.root.left;
    building_table.put("Upgrade Level", upgrade_lvl);
    return upgrade_lvl;
    }

    public Object craft(Object cRecipe){
        this.craft_recipe = cRecipe;
        building_table.put("Craft Recipe", cRecipe);
        return craft_recipe;
    }


}
