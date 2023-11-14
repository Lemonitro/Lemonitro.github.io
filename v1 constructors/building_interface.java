public interface building_interface{
    //internal Object(Building) changes
    //Info explains the building, it's use, what method of recipes it has, upgrade paths... etc
    //Craft sets the current recipe the building will have
    //Configure will change other specific recipe methods (Craft until, wait for... etc)
    public Object info();
    public Object craft(Object cRecipe);
    public Object configure();

    //external Object(Building) changes
    //Build will instatialized/construct building object
    //Rotate will rotate the building by specific degree
    //Sell, deletes the object/building
    //Move will move the object (Perhaps grid based map?)
    //Upgrade will change innate variables within constructed object/building
    public Object build();
    public Object rotate();
    public int sell();
    public Object move();
    public Object upgrade(String UpDown);
}