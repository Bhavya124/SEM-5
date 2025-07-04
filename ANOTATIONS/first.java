class abc{
    @Deprecated
    public void display(int x){
        System.out.println("Hello jeee");
    }
}
// class def extends abc {
//     public void display(){
//         System.out.println("hmmmm okkkkkk");
//     }
// }
public class first {
    public static void main(String[] args) {
        abc obj  = new abc();
        obj.display(34);
    }
}