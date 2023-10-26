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

}
}