import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(15, 235, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff

    //grass
    fill(0, 175, 0);
    rect(0, 325, 400, 75);
    
    //house
    fill(255, 255, 0);
    rect(100 , 200, 200, 200);
    
    //roof
    fill(255, 0, 0);
    rect(100, 175, 200, 25);

    fill(255, 0, 0);
    rect(125, 150, 150, 25);

    fill(255, 0, 0);
    rect(150, 125, 100, 25);
    
    //sun
    fill(255, 240, 105);
    ellipse(375, 0, 100, 100);

    //door
    fill(166, 99, 0);
    rect(175, 300, 50, 100);

    fill(255);
    ellipse(190, 350, 10, 10);

    //window
    fill(150, 150, 255);
    ellipse(200, 240, 62, 62);
    
    stroke(0);
    line(170, 240, 230, 240);

    stroke(0);
    line(200, 210, 200, 270);

  }
  
  // define other methods down here.
}