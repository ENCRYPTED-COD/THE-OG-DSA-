void main(){
    int[] number={10,25,14,16};
    int search=25;
    boolean found=false;
    for(int i=0;i<number.length;i++){
        if(number[i]==search){
            System.out.print("number found at index:" +i);
             found=true;
        }
    }
    if(!found){
        System.out.print("number not found");
    }
}