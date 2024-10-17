public class verifier {
    

    public static boolean verifier_dup(int [] tab){
        for(int i=0;i<tab.length-1;i++){
            for(int j=i+1;j<tab.length;j++){
                if(tab[i]==tab[j])
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
int [] tab={1,7,0,0,5};
System.out.println(verifier_dup(tab));
     }
}
