
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
   x= i* GameParameters.sceneCubeSize+
  
 }
}

public class GameParameters
{
 static float sceneCubeSize =10f;
 static int numberOfQubes=3;
}
