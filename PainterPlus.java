import org.code.neighborhood.*;
public class PainterPlus extends Painter {

  //create TURN RIGHT method
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
//
  
 //create TAKE ALL PAINT method
public void takeAllPaint() {
  while (isOnBucket())
  takePaint();
}
  //
  
  // make MOVE FAST method
public void moveFast(){
  while(canMove())
    move();
}
  //make PAINT TO EMPTY method
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }
//make PAINT DONUT method
  public void paintDonut (String color){
    while(hasPaint()){
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
    }
  }
// make turn around method
  public void turnAround (){
    turnLeft();
    turnLeft();
  }
  
} 