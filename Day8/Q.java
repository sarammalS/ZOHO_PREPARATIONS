class a{
    int v=10;

}
class Q{
    public static void main(String [] args){
        a b= new a();
        b.v=1;
        System.out.println(b.v);
        a c=new a();
        System.out.println(c.v);
    }
}