class zeroArr{
    public static void main(String[] args){
        int[] arr={0,1,0,3,12,0,5};
        movezero(arr);
        for(int i:arr){
            System.out.println(i+"");
        }
    }
    public static void movezero(int[] arr){
        int nonzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[nonzero];
                arr[nonzero]=arr[i];
                arr[i]=temp;
                nonzero++;
            }
        }
    }

}