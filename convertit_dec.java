public class convertit_dec {
    public static void convertit_dec_(int n){
        int t=(int)(Math.log(n)/Math.log(10));
        t++;
        int k=0;
        for(int i=0;i<t;i++){
            k+=((n%10)*Math.pow(2,i));
            n/=10;
        }
        System.out.println(k);
    }
  public static void main(String [] args){
    convertit_dec_(100101);
  }
}
