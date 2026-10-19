void main(){
    int number[]={10,20,50,30};
    int i=0;
    int j=number.length-1;
    while(i<j){
        int temp=number[i];
        number[i]=number[j];
        number[j]=temp;
        i++;
        j--;
    }
    for(int k=0;k<number.length;k++){
        System.out.print(number[k]+" ");
    }
}