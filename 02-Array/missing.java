void main(){
    int number[]={1,5,9,15,16,7,8,20};
    int max=20;
    for(int i =0;i<max;i++){
        boolean found=false;
        for(int j=0;j<number.length;j++){
            if (number[j]==i){
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Missing number: " + i);
        }
    }
}
