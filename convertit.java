
public class convertit {

    public static void convertit_(int n){
        int t=(int)(Math.log(n)/Math.log(2));
        t++;
        int [] tab = new int[t];
        int k=n;
        for(int i=0;i<t;i++){
            tab[i]=k%2;
            k=k/2;
        }

 for(int j=t-1;j>=0;j--){
    System.out.print(tab[j]);
 }
 System.out.println();
    }
    public static void main(String [] args){
        convertit_(2147483647);
    }
}