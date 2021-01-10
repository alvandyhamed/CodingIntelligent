package HackerRank.Interview1.Sort.MergSortinversions;

public class Solutions {
    private static int cont=0;

    public static int mergsort(int[] array){
        cont=0;

        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        mergsort(array,new int[array.length],0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        return cont;
    }
    public static void mergsort(int array[],int[] temp,int leftStart,int rightEnd){
        if(leftStart>=rightEnd){
            return;
        }
        int middle=(leftStart+rightEnd)/2;
        mergsort(array,temp,leftStart,middle);
        mergsort(array,temp,middle+1,rightEnd);
        mergHavalves(array,temp,leftStart,rightEnd);
    }
    public static void mergHavalves(int[] array,int[] temp,int leftStart,int rightEnd){
        int leftEnd=(leftStart+rightEnd)/2;
        int rightStart=leftEnd+1;
        int size=rightEnd-leftStart+1;

        int left=leftStart;
        int right=rightStart;
        int index=leftStart;
        if(left>right){
            System.out.print("a[i]"+array[left]+" a[j]"+array[right]);
            for(int i=0;i<array.length;i++){
                System.out.print(" "+array[i]);
            }
            System.out.println();

        }

        while (left<=leftEnd&&right<=rightEnd){
            if(array[left]<=array[right]){
                temp[index]=array[left];
                left++;
                //cont++;
            }else {
                temp[index]=array[right];
                right++;
                //  cont++;
                cont+=rightStart-left;
            }
            index++;
        }
        System.arraycopy(array,left,temp,index,leftEnd-left+1);
        System.arraycopy(array,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,array,leftStart,size);





    }


    static long countInversions(int[] arr) {
        cont=0;
        mergsort(arr);

        return cont;


    }
}
