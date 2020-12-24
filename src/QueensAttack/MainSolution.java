package QueensAttack;

public class MainSolution {
    static int queensAttack(int boardsize, int k, int queenX, int queenY, int[][] obstacles) {
        int top=queenY-1;
        int left=queenX-1;
        int rigth=boardsize-queenX;
        int bottom=boardsize-queenY;

        int lefttop=Math.min(top,left);
        int leftbottom=Math.min(bottom,left);
        int rightTop=Math.min(top,rigth);
        int rightBottom=Math.min(bottom,rigth);

        for(int[] pawen:obstacles){
            int pawnX=pawen[0];
            int pawnY=pawen[1];
            //TOP
            if(pawnX==queenX&&queenY>pawnY){
                top=Math.min(top,queenY-pawnY-1);
                
            }
            //Right
            if(pawnY==queenY&&queenX<pawnX){
                rigth=Math.min(rigth,pawnX-queenX-1);
            }
            //Left
            if(pawnY==queenY&&pawnX<queenX){
                left=Math.min(left,queenX-pawnX-1);
            }
            //Bottom
            if(pawnX==queenX&&queenY<pawnY){
                bottom=Math.min(bottom,pawnY-queenY-1);
            }
          

            //TopLeft
            if(pawnX<queenX && pawnY<queenY && queenX-pawnX==queenY-pawnY){
                lefttop=Math.min(lefttop,queenX-pawnX-1);
            }

            //bottomright
            if(pawnX>queenX && pawnY>queenY && pawnX-queenX==pawnY-queenY){
                rightBottom=Math.min(rightBottom,pawnX-queenX-1);
            }
            //bottomleft
            if(pawnX<queenX && pawnY>queenY && queenX-pawnX==pawnY-queenY){
                leftbottom=Math.min(leftbottom,queenX-pawnX-1);
            }
            //Topright
            if(pawnX>queenX && pawnY<queenY && pawnX-queenX==queenY-pawnY){
                rightTop=Math.min(rightTop,pawnX-queenX-1);
            }



        }


        return top+left+rigth+bottom+lefttop+leftbottom+rightTop+rightBottom;

    }
}
