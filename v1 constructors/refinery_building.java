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

    public Object info(){
        return building_table;
    }

    public Object upgrade(){
    this.upgrade_lvl_tree.root.left = new Node(2);
    upgrade_lvl = upgrade_lvl_tree.root.left;
    building_table.put("Upgrade Level", upgrade_lvl);
    return upgrade_lvl;
    }

    public Object craft(String cRecipe){
        for(int x=0; x<refinery_recipes.length; x++){
            if(refinery_recipes[x].equals(cRecipe)){
                this.craft_recipe = refinery_recipes[x];
                this.building_table.put("Craft Recipe", craft_recipe);
                return refinery_recipes[x];
            }
        }
        return false;
    }
}
