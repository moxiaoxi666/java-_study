package IO;

import java.io.*;

class Point implements Serializable {
    private static final long serialVersionUID = -696428266422162361L;
    private int x;
    private int y;
    private int z;
    private int a;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class SerializableDemo {
    static void serialization(Point point) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.dat"));
        oos.writeObject(point);
        oos.close();
    }
    static Point deserialization() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.dat"));
        Point point1 = (Point)ois.readObject();
        return point1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Point point = new Point();
        point.setX(10);
        point.setY(20);
       // serialization(point);
        Point point1 = deserialization();
        System.out.println(point1);
    }
}
