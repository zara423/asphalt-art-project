import org.code.neighborhood.*;
public class BeachPainter extends BackgroundPainter {

  // paints the beach but only the sand in one color
public void paintBeach (String color, int gridSize){

  setPaint(36);
  turnRight();
  while(canMove("south")){
    move();
  }
  turnLeft();
  paintRow(color);
  turnLeft();
  move();
  turnLeft();
  paintRow(color);
 turnRight();
  move();
  turnRight();
  paintRow(color);
  
  
}
  // paints the waterline where the sand meets the ocean in one color
public void paintWater (String color, int gridSize){
setPaint(12);
  turnLeft();
  move();
 turnLeft();
  paintRow(color);
    
  
  // minimizes stray painters
    //does nothing to the code or function
  resetPosition();
  
}

}