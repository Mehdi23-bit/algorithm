#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
   struct Node * next;
};
struct Node* head;
void insert(int data){
    struct Node* temp1=(struct Node*)malloc(sizeof(struct Node));
    temp1->data=data;
    temp1->next=NULL;
    if(head==NULL){
        head=temp1;
        return;
    }
    struct Node* temp2=head;
    while(temp2->next!=NULL){
        temp2=temp2->next;
    }
    temp2->next=temp1;
}
void print(struct Node* head){
    while(head!=NULL){
        printf("%d ",head->data);
        head=head->next;
    }
}
void delete(int n){
struct Node* temp=head;
if(n==1){
head=temp->next;
free(temp);
return;
}
for(int i=0;i<n-2;i++){
    temp=temp->next;
}
struct Node* dele=temp->next;
temp->next=dele->next;
free(dele);

    }
void main(void){
    head=NULL;
    int n,x;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("please enter the element %d : ",i+1);
        scanf("%d",&x);
        insert(x);
    }
    for(int i=1;i<n;i++){
        print(head);
        delete(1);
        printf("\n");
    }
 print(head);
}