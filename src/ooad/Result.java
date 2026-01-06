package ooad;

public class Result {
    private static int[] marks = {50,50,50,50,50};
    public static  void  main(String[] ass){
        int total = 0 ;
        float percentage ;
        for (int i=0 ; i< marks.length ; i++){
            total  += marks[i];
        }
        percentage = (total/ marks.length);
        System.out.println("total marks is :"+ total + " and percentage is:"+ percentage + "%");
        System.out.println((percentage>60)?"PASS":"FAIL");
    }
}
