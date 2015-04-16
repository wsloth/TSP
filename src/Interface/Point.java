/**
 * -- Point class for the field grid --
 * One object made by this class represents one point in the
 * grid map.
 */

package Interface;

public class Point {

    private int index;
    private String status;
    private int x;
    private int y;
    private boolean selected;

    public Point(int index, int x, int y) {
        this.index = index;
        this.status = "";
        selected = false;
        this.x = x;
        this.y = y;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.selected = true;
    }

    public boolean getSelected() {
        return selected;
    }
    
    public int getIndex() {
        return index;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateDistance(Point newPoint) {
        if (this == newPoint) {
            return 0;
        } else {
            double distance = Math.sqrt(
                    ((newPoint.getX() - this.getX()) * (newPoint.getX() - this.getX())) +
                            ((newPoint.getY() - this.getY()) * (newPoint.getY() * this.getY()))
            );
            return distance;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "index=" + index +
                ", status='" + status + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", selected=" + selected +
                '}';
    }
}
