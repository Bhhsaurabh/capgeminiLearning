package objectClass;

public class Phone {
    private String brand;
    InternalParts[] p;

    Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    int i = 0;
    public void setInternalParts(InternalParts p) {
    	if(this.p == null) {
    		this.p = new InternalParts[10];
    	}
        if (i < this.p.length) {
            this.p[i] = p;
            i++;
        }
    }

    public InternalParts[] getInternalParts() {
        return p;
    }

    @Override
    public String toString() {
        String result = "Brand Name: " + brand + "\n";

        for (InternalParts g : p) {
            if (g != null) {   // prevents NullPointerException
                result += "Ram: " + g.getRam() + "\n";
                result += "Rom: " + g.getRom() + "\n";
            }
        }
        return result;
    }
}