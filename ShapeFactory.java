public class ShapeFactory {

    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_TRIANGLE = 1;
    public static final int TYPE_ELLIPSE = 2;
    public static  int Circle_Count = 0;
    public static  int Triangle_Count = 0;
    public static  int Ellipse_Count = 0;
    public static Shape getShape(int shapeType) {
    if(Circle_Count+Triangle_Count+Ellipse_Count<5){
        if(shapeType == 0){
            if(Circle_Count<2)
            {
                Circle_Count++;
                System.out.println("You have "+Circle_Count+" Circles");
                return new Circle();
            }
            else {
                System.out.println("Exceed Circle Maximum instances");
                return null;
            }
        }
        else if (shapeType == 1){
            if(Triangle_Count<2)
            {
                Triangle_Count++;
                System.out.println("You have "+Triangle_Count+" Triangles");
                return new Triangle();
            }
            else {
                System.out.println("Exceed Triangle Maximum instances");
                return null;
            }
        }
        else if(shapeType == 2){
            if(Ellipse_Count<2)
            {
                Ellipse_Count++;
                System.out.println("You have "+Ellipse_Count+" Ellipse");
                return new Ellipse();
            }
            else {
                System.out.println("Exceed Ellipse Maximum instances");
                return null;
            }
        }
        else {
            return null;
        }
    }
    else{
        System.out.println("Exceed Shape Maximum instances");
        return null;
    }
    }
}
