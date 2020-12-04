public class LicensePlate {


        public static String licensePlate(String code,int group) {

            code=code.replace("-","");
            StringBuilder sb = new StringBuilder(code);
            for(int i=code.length()-group;i>0;i-=group){


                sb.insert(i, '-');

            }

            return sb.toString().toUpperCase();

        }



    public static void main(String[] args){
        System.out.println(licensePlate("2-4A0r7-4k", 3));
    }
}
