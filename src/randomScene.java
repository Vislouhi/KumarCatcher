
// you can add other public classes to this editor in any order

public class RandomView{
 
  private int numberOfQubes=3;
  private SceneQubeData[][][] sceneQubes = new SceneQubeData[GameParameters.numberOfQubes][GameParameters.numberOfQubes][GameParameters.numberOfQubes];
  
  public RandomView(){
   for(int i=0;i<GameParameters.numberOfQubes;i++){
     for(int j=0;j<GameParameters.numberOfQubes;j++){
       for(int k=0;k<GameParameters.numberOfQubes;k++){
        
        sceneQubes[i][j][k]=new SceneQubeData(i,j,k);
    
       }
     }
   }
  
  }
}

public class SceneQubeData
{
 private float x;
 private float y;
 private float z;
 
 public SceneQubeData(int i, int j, int k)
 {
  
   this.x= (float)i* GameParameters.sceneCubeSize+GameParameters.sceneCubeBound+GameParameters.sceneCubeEffectiveSize*(float)Math.random();
  this.y= (float)j* GameParameters.sceneCubeSize+GameParameters.sceneCubeBound+GameParameters.sceneCubeEffectiveSize*(float)Math.random();
  this.z= (float)k* GameParameters.sceneCubeSize+GameParameters.sceneCubeBound+GameParameters.sceneCubeEffectiveSize*(float)Math.random();
   System.out.println("i="+i+"j="+j+"k="+k);
  System.out.println("x="+this.x+"y="+this.y+"z="+this.z);
 }
}

public class GameParameters
{
 static float sceneCubeSize =10f;
 static float sceneCubeBound =2f;
 static float sceneCubeEffectiveSize =sceneCubeSize-2*sceneCubeBound;
 
 static int numberOfQubes=3;
}
