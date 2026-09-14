import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //create painter to paint background blue and give grid size
BackgroundPainter bp = new BackgroundPainter();
    bp.paintBackground("SkyBlue", 12*12);

    // create sun painter (make sure is put before frame painter in order to ensure the sun doensnt cover the frame)
SunPainter sp = new SunPainter();
    sp.paintSun("Gold", 12*12);
    
    // create ocean painter (make sure is put before frame painter in order to ensure the ocean doensnt cover the frame)
OceanPainter op = new OceanPainter();
    op.paintOcean("DodgerBlue", 12*12);

    // create beach painter (make sure is put before frame painter in order to ensure the beach doensnt cover the frame)
BeachPainter cami = new BeachPainter();
    cami.paintBeach("Moccasin", 12*12);
    cami.paintWater("White", 12*12);

    // create cloud painter (make sure is put before frame painter in order to ensure the clouds dont cover the frame)
CloudPainter cp = new CloudPainter ();
    cp.paintClouds("white", 12*12);





    
    
//call and create frame painter to do AFTER painting is complete
    FramePainter fp = new FramePainter();
    fp.paintFrame("SaddleBrown", 12*4);
  }
}