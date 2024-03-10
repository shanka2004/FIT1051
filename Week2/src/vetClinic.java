class dog {
    String dogName;
    void setName(String Name){
        dogName = Name;
        printf("dog name is %s" + Name);
    }
    void display(){
        System.out.println("" + );
    }
}

public class vetClinic {
    public static void main(String[] args) {
        String name = "tom";
        dog Tom = new dog();
        Tom.setName(name);

        String name2 = "tom2";
        dog Tom2 = new dog();
        Tom2.setName(name2);


    }
}