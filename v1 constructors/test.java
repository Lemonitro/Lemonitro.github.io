class test{
public static void main(String[] args) {
    building building_1 = new building();
    System.out.println(building_1.info());
    System.out.println(building_1.upgrade_lvl);

    System.out.println(building_1.upgrade_lvl_tree.root.key);
    System.out.println(building_1.upgrade_lvl_tree.root);

    System.out.println(building_1.upgrade_lvl_tree.root.left.key);
    System.out.println(building_1.upgrade_lvl_tree.root.left);

    System.out.println(building_1.upgrade_lvl_tree.root.right.key);
    System.out.println(building_1.upgrade_lvl_tree.root.right);

    System.out.println(building_1.upgrade_lvl_tree.root.left.left.key);
    System.out.println(building_1.upgrade_lvl_tree.root.left.left);

    System.out.println(building_1.upgrade_lvl_tree.root.left.right.key);
    System.out.println(building_1.upgrade_lvl_tree.root.left.right);

    System.out.println(building_1.upgrade_lvl_tree.root.right.right.key);
    System.out.println(building_1.upgrade_lvl_tree.root.right.right);

    System.out.println(building_1.upgrade_lvl_tree.root.right.left.key);
    System.out.println(building_1.upgrade_lvl_tree.root.right.left);

    System.out.println(building_1.upgrade("Up"));
    System.out.println(building_1.upgrade("DOWN"));
}
}