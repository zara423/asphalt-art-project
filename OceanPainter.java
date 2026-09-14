import org.code.neighborhood.*;
public class OceanPainter extends BackgroundPainter {
//allows painter to navigate and fill in the bottom portion of the canvas/grid in one color
  //keeps the ocean level and neat
public void paintOcean (String color, int gridSize){
turnRight();
  setPaint(84);
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
  turnLeft();
  move();
 turnLeft();
  paintRow(color);
  turnRight();
  move();
  turnRight();
  paintRow(color);
turnLeft();
  move();
  turnLeft();
  paintRow(color);
  turnRight();
  move();
  turnRight();
  paintRow(color);

  
  // minimizes stray painters
    //does nothing to the code or function
  resetPosition();
  
}






  
}