public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString() {
        return super.toString() + ", z = " + z;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof ThreeDPoint)) return false;
        if (!super.equals(o)) return false;

        ThreeDPoint that = (ThreeDPoint) o;

        return getX() == that.getX() && getY() == that.getY() && z == that.z;
    }
}
