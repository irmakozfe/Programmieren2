package de.thws.l16uebung.schach;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {

    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {

    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett ubergebenebrett){
    Brett neu = new Brett();

for(int i = 0; i < neu.brett.length; i++){
  for(int j =0; j < neu.brett[i].length; j++){
    if(this.brett[i][j]  || ubergebenebrett.brett[i][j]){
      neu.brett[i][j]= true;
    } else {
      neu.brett[i][j]= false;
    }
  }
}
    return neu;
}
  
}
