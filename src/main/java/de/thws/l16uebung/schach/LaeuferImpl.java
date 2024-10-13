package de.thws.l16uebung.schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder(){
  Brett brett = new Brett();
  brett.markiereFeld(x,y);

  int xn= x+1;
  int yn= y+1;
  while(xn <=8 && yn <=8){
    brett.markiereFeld(xn,yn);
    yn++;
    xn++;
  }

    xn= x-1;
    yn = y+1;
    while(xn >=1 && yn<=8){
      brett.markiereFeld(xn, yn);
      xn--;
      yn++;
    }

    xn= x +1;
    yn = y-1;
    while(xn<=8 && yn>=1){
      brett.markiereFeld(xn,yn);
      xn++;
      yn--;
    }
    xn= x -1;
    yn = y-1;
    while(xn >= 1 && yn>= 1 ){
      brett.markiereFeld(xn, yn);
      xn--;
      yn--;
    }


    return brett;
}
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(1,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
