#include<iostream>
using namespace std;
int main(){
    int n; 
    cout<<"please enter a integer : ";
    cin>>n;
    int * table=(int*)malloc((n-1)*sizeof(int));
    for(int i=0;i<n-1;i++){
        cout<<"Enter the number "<<i+1<<" : ";
        cin>>*(table+i);
    }
    bool h=false;
    int missing;
    for(int j=1;j<n+1;j++){
        
        for(int i=0;i<n-1;i++){
            if(j==table[i]){
                h=true;
            }
            
        }
        if(h==false){
        missing=j;
            break;
    }
    h=false;
    }
    cout<<"\nthe missing element is : "<<missing;
}