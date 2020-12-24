package Binumbers;

public class BigSum extends Numbers{


    public BigSum(String number1, String number2) {
        SetNumber(number1,number2);
    }

    @Override
    public void Oparate() {
        int parier=0;
        int[] Answer=new int[IntNumber1.length+1];
        for(int i=IntNumber1.length-1;i>=0;i--){

                int sum=IntNumber1[i]+IntNumber2[i];
                if(sum<10){
                    Answer[i+1]=sum+parier;
                    parier=0;
                }else {
                    Answer[i+1]=(sum%10)+parier;
                    parier=sum/10;
                }

        }
        Answer[0]=parier;
        Print(Answer);

    }
}
