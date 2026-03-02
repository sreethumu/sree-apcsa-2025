package polygon;

public class Main {
    public static void main(String [] args)
    {
        IrregularPolygon myPolygon = new IrregularPolygon();
        double[][] bowtiePoints = { { 0, 0 }, { 100, 50 }, { 100, 0 }, { 0, 50 } };
        for(int i=0; i<bowtiePoints.length; i++){
            myPolygon.add(new java.awt.geom.Point2D.Double(bowtiePoints[i][0], bowtiePoints[i][1]));
        }
        myPolygon.draw();

        TestSuite.run();
    }
    
}
