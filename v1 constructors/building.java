//ALL buildings will implement this for generic constructors
import java.util.Hashtable;

public class building implements building_interface{
    private static final Object Object = null;
    public int value = 0; //Cost of the building (To calculate sell)
    public int upgrade_lvl = 0; //Current upgrade
    public String building_name = ""; //Building name (Also type)
    public Object craft_recipe; //Craft recipe in the building
    Hashtable<String, Object> building_table = new Hashtable<>();

    //building should be the generic constructor that all buildings will extend from
    public building(){
        this.value = 0;
            building_table.put("Value", value);
        this.upgrade_lvl = 0;
            building_table.put("Upgrade Level", upgrade_lvl);
        this.building_name = "Placeholder";
            building_table.put("Building Name", building_name);
        this.craft_recipe = "Null"; 
            building_table.put("Craft Recipe", craft_recipe);
    }

    //The way this works, is that the constructor will also create a hashtable will all the information/variables it uses
    //Info should return the hashtable (Albeit maybe customized for style n what not)
    public Object info(){
        System.out.println(this.building_table);
        return building_table;
    }

    //Changes craft_recipe to another object (Maybe make it so its resource objects?)
    //E.g Quarry, can have as its crafting recipe: Iron, Gold etc. it will generate these resources (Creates new objects within a object class)
    public Object craft(Object cRecipe){
        this.craft_recipe = cRecipe;
        return craft_recipe;
    }

    //Might change specific elements within craft_recipe...
    //How many it makes, queue times, etc. Might be called when building "upgrades" so can be used internally and externally
    public Object configure(){
        System.out.println(building_table);
        //Wait for input (What specifically you want to change... then move forward from there)
        return Object;
    }

    //SAME THING AS CONSTRUCTOR. Except planning to implement spectral building (visually), and build fuction confirms the placement
    //Implemment position afterwards?
    public Object build(){
        return Object;
    }

    //Rotates the building, buildings are squares and have four facets that can act differently depending on the building/upgrade level
    //Rotate should faciliate creating factories without having to create numerous awkward paths with treads
    //Implemment position afterwards?
    public Object rotate(){
        return Object;
    }

    //Sell uses value in the equation and returns the result as currency
    //Sell equation will range with factors of building value (value > increases sell price return. upgrade > lessens price return)
    public int sell(){
        return 0;
    }

    //Move will change the coordinates of the building
    //Not necessarily seen until unity implementation/grids
    //Implemment position afterwards?
    public Object move(){
        return Object;
    }
    
    //Changes upgrade_level of the building, internally calls configure to change possible settings
    //Might also add extra features.
    public Object upgrade(){
    this.upgrade_lvl++;
    building_table.put("Upgrade Level", upgrade_lvl);
    return upgrade_lvl;
    }
}
