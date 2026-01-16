package relationship;

public class Department {
    private int block;
    private String depName;

    public void setDep(int block , String depName) {
        this.block = block;
        this.depName = depName;
    }

    public Department getDep() {
        return this;
    }

    public int getBlock() {
        return block;
    }
}
