class cryptage {
    double[] decrypter(String str){
  double[] f=new double[26];
  String a="abcdefghijklimnopqrstvwyz";
for(int i=0;i<26;i++){
    f[i]=0;
    for(int j=0;j<str.length();j++){
     if(a.charAt(i)==str.charAt(j)){
        f[i]++;
     }
    }
    f[i]/=str.length();
}
return f;
    } 

    public static void main(){
        double[] frequence = decrypter("dlsihfioifj");
    }
}