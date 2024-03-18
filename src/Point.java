import java.util.Objects;

public class Point implements Comparable {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    public int compareTo(Object o) {
        if (this == o) return 0;
        Point comp = (Point)o;
        return comp.x - x;
    }
}
