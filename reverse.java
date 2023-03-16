public class reverse {
    public static void reverse(int number[]){
        int first=0,last=number.length;
        while(first<last){
            //swap
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
    }}
    public static void main(String args[]){
        int number[]={2,3,4,55,667,44,88};
       reverse(number);
       for(int i=0;i<number.length;i++){
        System.out.println(number[i]+" ");
       }
       System.out.println();
    }
}
