import org.w3c.dom.css.Rect;

import javax.sound.midi.Receiver;
import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(10, 15,20,10 );
        Rectangle test = new Rectangle();

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        for(int i=0;i<1000000;i++){
            rectangles.add(new Rectangle());
        }

        int count = 0;
        for (Rectangle rectangle:rectangles){
            if(overlaps(original,rectangle)){
                count++;
            }
        }

        System.out.println((double)count/1000000);

    }
    public static boolean overlaps (Rectangle one, Rectangle two){
        if (two.getRightX()>one.getLeftX()&&two.getLeftX()<one.getRightX()){
            if(two.getBottomY()<one.getTopY()&&two.getTopY()>one.getBottomY()){
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
        return false;
    }
}

