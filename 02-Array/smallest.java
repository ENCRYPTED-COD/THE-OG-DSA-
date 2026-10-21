void main(){
    int number[]={8,3,5,1,3};
    int smallestnumber=number[0];
    for(int i =0;i<number.length;i++){
        if(number[i]<smallestnumber){
            smallestnumber=number[i];

        }
    }
    int secondsmallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(number[i]>smallestnumber){
            if(number[i]<secondsmallest){
                secondsmallest=number[i];

            }

        }
    }
     System.out.println("Smallest: " + smallestnumber);
    System.out.println("Second Smallest: " + secondsmallest);

}