package info.lotharschulz.mybatisMappingTest01;

public class Things {

    private int ID;
    private String stuff;
    private String prop2;
    private int column_one;
    private int someotherprop;

    public Things() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getProp2() {
        return prop2;
    }

    public int getColumn_one() {
        return column_one;
    }

    public void setColumn_one(int column_one) {
        this.column_one = column_one;
    }

    
    
    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public int getSomeotherprop() {
        return someotherprop;
    }

    public void setSomeotherprop(int someotherprop) {
        this.someotherprop = someotherprop;
    }

    @Override
    public String toString() {
        return "Things{" + "ID=" + ID + ", stuff=" + stuff + ", prop2=" + prop2 + ", column_one=" + column_one + ", someotherprop=" + someotherprop + '}';
    }

}
