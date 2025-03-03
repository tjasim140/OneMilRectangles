import org.w3c.dom.css.Rect;

public class Rectangle {
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle (){
        length= (int) (Math.random()*50+10);
        width = (int) (Math.random()*50+10);
        x= (int) (Math.random()*50);
        y= (int) (Math.random()*50);
    }

    public Rectangle (int x, int y, int length, int width){
        this.length=length;
        this.width=width;
        this.x=x;
        this.y=y;
    }

    public int getRightX (){
        return x+length;
    }

    public int getLeftX(){
        return x;
    }

    public int getTopY(){
        return y;
    }

    public int getBottomY(){
        return y-width;
    }



    public static boolean overlaps (Rectangle one, Rectangle two){
        if (two.getRightX()>one.getLeftX()&&two.getLeftX()<one.getRightX()){
            if(two.getBottomY()<one.getTopY()&&two.getBottomY()<one.getTopY()&&two.getTopY()>one.getBottomY()){
                return true;
            }
            if(two.getBottomY()<one.getBottomY()&&two.getTopY()>one.getBottomY()&&two.getTopY()< one.getTopY()){
                return true;
            }
        }
        if(two.getLeftX()<one.getRightX()&&two.getRightX()>one.getRightX()){
            if(two.getBottomY()<one.getTopY()&&two.getTopY()>one.getBottomY()){
                return true;
            }
            if(two.getBottomY()<one.getBottomY()&&two.getTopY()>one.getBottomY()&&two.getTopY()< one.getTopY()){
                return true;
            }
        }
        if(two.getRightX()>one.getRightX()&&two.getLeftX()<one.getLeftX()&&two.getTopY()>one.getTopY()&&two.getBottomY()<one.getBottomY()){
            return true;
        }
        return false;
    }

}
