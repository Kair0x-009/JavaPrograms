package ooad;

public interface Main2 {
    public static void main(String[] arr){
        Students std = new Students("Roshit" , "AUS" , "BCSIT");
        Teacher teach = new Teacher("Ram" , "AUS" , "BCSIT");
        std.toString();
        teach.toString();
    }

}
