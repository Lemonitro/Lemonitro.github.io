public class refinery_building extends building{
    public refinery_building(){
        super();
        value = 2000;
        building_table.put("Value ", " " + value);
        upgrade_lvl = 0;
        building_table.put("Upgrade Level ", " " + upgrade_lvl);
        building_name = "Refinery";
        building_table.put("Building Name ", " " + building_name);
        craft_recipe = "None";
        building_table.put("Craft Recipe ", " " + craft_recipe);
    }
    
    public Object info(){
        System.out.println(this.building_table);
        return building_table;
    }
}
