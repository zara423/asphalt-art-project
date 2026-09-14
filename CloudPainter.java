import org.code.neighborhood.*;
public class CloudPainter extends BackgroundPainter {

//paints one larger cloud in the upper left corner of the grid
public void paintClouds (String color, int gridSize){
setPaint(7);
  move();
  turnRight();
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  turnRight();
  move();
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);


  //paints second cloud

  turnLeft();
  move();
  turnLeft();
  move();
  move();
  move();
  move();
  paint(color);
  move();
  paint(color);
  resetPosition();
}



  
}