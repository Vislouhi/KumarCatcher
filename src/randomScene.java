//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.ArrayList;
// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    System.out.println("P");
    VisibleItems i = new VisibleItems();
    i.scanLineForSegments(new Vector3f(0f,0f,0f),new Vector3f(0.9f,0.2f,-0.8f));
    
  }
}

public class VisibleItems
{
 private ArrayList<SegmentPosition> segmentPosition=new ArrayList<>();
  
  public void scanLineForSegments(Vector3f position,Vector3f direction)
  {
    Vector3f step=direction;
    step.mul(GameParameters.lookForSegmentsStep);
    Vector3f currentPosition = position;
    int i;
    int j;
    int k;
    
    for(int m=0;m<GameParameters.lookForSegmentsDepth;m++){
      
      i=(int)(currentPosition.x/GameParameters.sceneCubeSize);
      j=(int)(currentPosition.y/GameParameters.sceneCubeSize);
      k=(int)(currentPosition.z/GameParameters.sceneCubeSize);
    	currentPosition.add(step);
      System.out.println("i="+i+"j="+j+"k="+k);
      System.out.println("i="+currentPosition.x+"j="+currentPosition.y+"k="+currentPosition.z);
    
    }
  }
  
}
// you can add other public classes to this editor in any order
public class SegmentPosition
{
  private int i;
  private int j;
  private int k;
  
  
  public SegmentPosition(int i,int j, int k){
    this.i=i;
    this.j=j;
    this.k=k;
  }
  public int getI(){return this.i;}
  public int getJ(){return this.j;}
  public int getK(){return this.k;}
  
}

public class GameParameters
{
 static float sceneCubeSize =10f;
 static float sceneCubeBound =2f;
 static float sceneCubeEffectiveSize =sceneCubeSize-2*sceneCubeBound;
 static float lookForSegmentsStep =1.0f;
  static int lookForSegmentsDepth =50;
 static int numberOfQubes=3;
}
public class Vector3f {
  public float x;
  public float y;
  public float z;

  public Vector3f(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  public void mul(float factor)
  {
    this.x = factor*x;
    this.y = factor*y;
    this.z = factor*z;
  }
  public void add(Vector3f v)
  {
    this.x += v.x;
    this.y += v.y;
    this.z += v.z;
  }

  
  // Other operations...
}
