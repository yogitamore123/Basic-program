public class positivenumExp extends Exception {
     positivenumExp(){
        super("Positive number found in the list of Number");
     }
}
class numCheck{
    void check(int arr[]) throws positivenumExp{
        for(int x:arr){
           if(x<0){
            throw new positivenumExp();
           }else{
            System.out.println("Number is positive");
           }
        }
    }
}
class us{
    public static void main(String[] args) {
      numCheck k=new numCheck();
      int ar[]={1,4,6,2,7,-5};
      try{
        k.check(ar);
      }
      catch(positivenumExp er){
        er.printStackTrace();
      }       
    }
}
