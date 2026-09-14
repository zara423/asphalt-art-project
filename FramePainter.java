import org.code.neighborhood.*;
public class FramePainter extends BackgroundPainter {

  // paints the grid brown around its perimeter
  // ****** make sure this is called last due to the fact that it will paint over everything in the perimeter
 public void paintFrame(String color, int gridSize) {
    setPaint(gridSize * 4);
   while (canMove("east")) {
      paintRow(color);
     turnRight();
    }
  move();
while (canMove("south")) {
      paintRow(color);
     turnRight();
    }
move();
 while (canMove("west")) {
      paintRow(color);
     turnRight();
    }
move();
while (canMove("north")) {
      paintRow(color);
     turnRight();
    }
move();

// minimizes stray painters across the whole grid

  resetPosition();

   
}
}