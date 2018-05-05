package dnhthanh.hueic.edu.vn;

public class Diem3D extends Diem2D {
	private float z;

	private float getZ() {
		return z;
	}

	private void setZ(float z) {
		this.z = z;
	}
	
	public Diem3D(float x, float y, float z) {
		//super(x, y);
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
