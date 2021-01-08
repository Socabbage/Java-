package 第六次作业;

public class _9_6 {
        /** The radius of the circle */
        double radius;
        
        /** The number of objects created */
        static int numberOfObjects = 0;
                
        /** Construct a circle with radius 1 */
        _9_6() {
            radius = 1;
            numberOfObjects++;
        }
        
        /** Construct a circle with a specified radius */
        _9_6(double newRadius) {
            radius = newRadius;
            numberOfObjects++;
        }
        
        /**Return numberOfObjects*/
        static int getNumberOfObjects() {
            return numberOfObjects;
        }
        
        /** Return the area of this circle */
        double getArea() {
            return radius * radius * Math.PI;
        }
}