import java.util.ArrayList;

public class PointTester
{
    public static void swapPoints(ArrayList<Point> pntArrList, int ind1, int ind2, int sizeMove) {
        ArrayList<Point> movePts = new ArrayList<Point>();
        if (pntArrList.size()-ind2 < sizeMove) {
            sizeMove = pntArrList.size()-ind2;
        }

        for (int i = 0; i < sizeMove; i++) {
            movePts.add(pntArrList.get(i+ind2));
        }
        for (int i = movePts.size()-1; i >= 0; i--) {
            pntArrList.add(ind1, movePts.get(i));
        }
    }

    public static void sortPoints(ArrayList<Point> pntArrList) {
        for (int scanOffset = 2; scanOffset < pntArrList.size(); scanOffset*=2) {
            System.out.println(scanOffset);
            for (int i = 0; i < pntArrList.size(); i += scanOffset) {
                Point p1 = (Point) pntArrList.get(i);
                Point p2;
                if (i + (scanOffset)/2 >= pntArrList.size()) {
                    p2 = null;
                } else {
                    p2 = (Point) pntArrList.get(i + (scanOffset) / 2);
                }
                if (p2 != null && p1.compareTo(p2) < 0) {
                    swapPoints(pntArrList, i, i + (scanOffset/2), scanOffset/2);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        ThreeDPoint pointD = new ThreeDPoint("D", 12, -3, 8);
        ThreeDPoint pointE = new ThreeDPoint("E", 13, -3, 8);
        ThreeDPoint pointF = new ThreeDPoint("F", 12, -3, 4);
        ThreeDPoint pointG = new ThreeDPoint("G", 10, -3, 8);
        ThreeDPoint pointH = new ThreeDPoint("H", 10, 15, 8);

        Point point1 = new Point("a", 6, 7);
        Point point2 = new Point("a", 8, 345);
        Point point3 = new Point("a", 60, 34);
        Point point4 = new Point("a", 45, 5432);

        ArrayList<Point> pntArrList = new ArrayList<Point>();

        pntArrList.add(point1);
        pntArrList.add(pointD);
        pntArrList.add(pointE);
        pntArrList.add(point2);
        pntArrList.add(pointF);
        pntArrList.add(point3);
        pntArrList.add(pointG);
        pntArrList.add(point4);
        pntArrList.add(pointH);


        for (Point pnt : pntArrList) {
            System.out.println(pnt);
        }
        System.out.println("----------------");

        sortPoints(pntArrList);

        for (Point pnt : pntArrList) {
            System.out.println(pnt);
        }
    }
}
