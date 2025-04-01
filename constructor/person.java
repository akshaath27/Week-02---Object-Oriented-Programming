public class person {
    private String name;
    private int age;

    public person(){
        name="akshaath";
        age=27;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public person(person otherperson){
        this.name= otherperson.name;
        this.age=otherperson.age;

    }
    public void display(){
        System.out.println("the name of the person:"+name);
        System.out.println("the age of the person:"+age);
    }
    public static void main(String[]args){
        person person1=new person();
        System.out.println("the first person:");
        person1.display();
        person person2=new person("ash",17);
        System.out.println("the second person:");
        person2.display();
        person person3=new person(person2);
        System.out.println("third person:");
        person3.display();


    }
}