
public class RandomView{
 
  private int numberOfQubes=3;
  private SceneQubeData[][][] sceneQubes = new SceneQubeData[GameParameters.numberOfQubes][GameParameters.numberOfQubes][GameParameters.numberOfQubes];
  
  public RandomView(){
   for(int i=0;i<GameParameters.numberOfQubes;i++){
     for(int j=0;j<GameParameters.numberOfQubes;j++){
       for(int k=0;i<GameParameters.numberOfQubes;k++){
        
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
  
   this.x= i* GameParameters.sceneCubeSize+sceneCubeBound+sceneCubeEffectiveSize*Math.random();
  this.y= j* GameParameters.sceneCubeSize+sceneCubeBound+sceneCubeEffectiveSize*Math.random();
  this.z= k* GameParameters.sceneCubeSize+sceneCubeBound+sceneCubeEffectiveSize*Math.random();
  System.out.println("x="+this.x+"y="+this.y+"z="+this.z)
 }
}

public class GameParameters
{
 static float sceneCubeSize =10f;
 static float sceneCubeBound =2f;
 static float sceneCubeEffectiveSize =sceneCubeSize-2*sceneCubeBound;
 
 static int numberOfQubes=3;
}
