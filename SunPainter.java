import org.code.neighborhood.*;
public class SunPainter extends BackgroundPainter {

  //create sun painter
  // intended to fill in a 3 by 3 square in the corner of the grid
  public void paintSun(String color, int gridSize) {


while (canMove("east")){
  move();
}
setPaint(8);
    while(hasPaint()){
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    }
    setPaint(1);
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);

    // minimizes stray painters
    //does nothing to the code or function
  resetPosition();
  }




}
