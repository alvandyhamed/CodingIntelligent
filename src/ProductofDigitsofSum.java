public class ProductofDigitsofSum {
    public static long getmulti(long number){

        long multiple=1;
        while (number>10){
            multiple*=number%10;
            number/=10;
        }
        multiple*=number;
        return multiple;

    }
    public static long sumDigProd(int ...a) {
        long sum=0;
        for(int i:a){
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);

        while (sum>10){
            sum=getmulti(sum);
        }
        return sum;

    }

    public static void main(String[] args){
        System.out.println("_"+

                sumDigProd(17737, 98723, 2));

    }
}
