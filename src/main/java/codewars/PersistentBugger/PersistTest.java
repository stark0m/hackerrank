package codewars.PersistentBugger;




public  class PersistTest {

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }
    public static int persistence(long n) {
        // your code
        String resultStringFromLong = Long.toString(n);

        long resultInt =0;
        long temp = 1;
        String ch = "";

        if (resultStringFromLong.length()==1) {
            return 0;

        } else{
            for (int i = 0; i < resultStringFromLong.length(); i++) {
                ch =String.valueOf(resultStringFromLong.charAt(i));
                temp*=Integer.valueOf(ch);

            }

            resultInt = persistence(temp)+1;
        }

        return (int)resultInt;


    }



}
