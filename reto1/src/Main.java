public class Main {
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz\n");
            }else{
                if(i%3==0){
                    System.out.println("fizz\n");
                }
                if(i%5==0){
                    System.out.println("buzz\n");
                }
                if(i%5!=0 && i%3!=0){
                    System.out.println(i+"\n");
                }
            }
        }
    }
}