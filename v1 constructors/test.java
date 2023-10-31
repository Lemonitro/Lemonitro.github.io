class test{
public static void main(String[] args) {
    building building_1 = new building();
    System.out.println(building_1);
    System.out.println("");
    building_1.info();
    building_1.upgrade();
    System.out.println("");
    building_1.info();

    refinery_building refinery_1 = new refinery_building();
    refinery_1.info();
    refinery_1.upgrade();
    refinery_1.info();
    System.out.println(refinery_1.upgrade_lvl);
    refinery_1.upgrade();
    System.out.println(refinery_1.upgrade_lvl);
    System.out.println(refinery_1.building_table.get("Upgrade Level"));
    refinery_1.info();

}
}