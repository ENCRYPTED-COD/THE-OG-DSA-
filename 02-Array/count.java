void main(){
    int[] number={10,12,3,5,56,75};
    int even=0;
    int odd=0;
    for(int i=0;i<number.length;i++){
        if(number[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.print("evennumber:"+even);
    System.out.print("oddnumber:"+odd);
}