package objectClass;

public class InternalParts {
	private int ram;
	private int rom;
	
	InternalParts(int ram , int rom){
		this.ram = ram;
		this.rom = rom;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}
	
	
}
