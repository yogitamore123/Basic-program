class category {
    category(){
        System.out.println("category_");
    }
    }
class subcategory extends category{
    subcategory(){
        System.out.println("subcategory_");
    }
}
class subsubcategory extends subcategory{
    subsubcategory(){
      System.out.println("subsubcategory_");
    }
}
class kmr{
    public static void main(String[] args) {
        new subsubcategory();
    }
}