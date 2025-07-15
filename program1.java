public class program1 {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human Akhil = new Human(21,566666,"Akhil");
        Human Alice = new Human(22,2433,"Alice");
        System.out.println(Human.population);
        
    }
    
}
class Human{
    int age;
    int sal;
    String name;
    static long population;

    Human(int age,int sal,String name){
        this.age=age;
        this.sal = sal;
        this.name = name;
        Human.population +=1;
    }
}
