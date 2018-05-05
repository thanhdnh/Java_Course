package dnhthanh.hueic.edu.vn;

public class Diem2D {
	protected float x;
	protected float y;

	float getX() {
		return x;
	}

	void setX(float x) {
		this.x = x;
	}

	float getY() {
		return y;
	}

	void setY(float y) {
		this.y = y;
	}
	
	public Diem2D() {
		this.x = this.y = 0;
	}
	
	public Diem2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
