public class StaticBlock {
    static int a =5;
    static int b;


    //Will only run once when the first obj is created i.e. the class is loaded for the first time

    static{
        System.out.println("I am in the static block");
        b = a*4;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
        b = b*5;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println("-------");
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);      
    }
    
}
