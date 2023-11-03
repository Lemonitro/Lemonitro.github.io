public class refinery_building extends building{
    public refinery_building(){
        super();
        this.value = 2000;
            building_table.put("Value", value);
        this.upgrade_lvl = 0;
            building_table.put("Upgrade Level", upgrade_lvl);
        this.building_name = "Refinery";
            building_table.put("Building Name", building_name);
        this.craft_recipe = "Null"; 
            building_table.put("Craft Recipe", craft_recipe);
    }

    public Object info(){
        System.out.println(this.building_table);
        return building_table;
    }

    public Object upgrade(){
    this.upgrade_lvl++;
    building_table.put("Upgrade Level", upgrade_lvl);
    return upgrade_lvl;
    
    }
}
