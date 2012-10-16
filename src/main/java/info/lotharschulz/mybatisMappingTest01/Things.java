package info.lotharschulz.mybatisMappingTest01;

public class Things {

    private int ID;
    private int column_one;
    private String column_B;

    public Things() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getColumn_B() {
        return column_B;
    }

    public void setColumn_B(String column_B) {
        this.column_B = column_B;
    }

    public int getColumn_one() {
        return column_one;
    }

    public void setColumn_one(int column_one) {
        this.column_one = column_one;
    }

    @Override
    public String toString() {
        return "Things{" + "ID=" + ID + ", column_one=" + column_one + ", column_B=" + column_B + '}';
    }

}
