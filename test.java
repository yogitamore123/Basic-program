import java.io.FileNotFoundException;
class test {
  public static void main(String[] args) {
    ReadAndWrite rw= new ReadAndWrite();
    try{
        rw.readFile();
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }

  }    
}
