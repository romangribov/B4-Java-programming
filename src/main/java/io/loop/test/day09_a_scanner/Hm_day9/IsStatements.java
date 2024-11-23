public class IsStatements {
    public static void main(String[] args) {
        int y=20;
        int x;

        if(y==20){
            x=5;
            System.out.println("X is :"+x);
        }
        boolean max =true;
        int fees;
        if(max){
            fees=50;
            System.out.println("Fee is: "+fees);
        }



        int b=50;
        int c=0;
        int a;

        if(b==50 && c>=100){
            a=20;
            System.out.println("A is "+a);
        }

        int temp=75;
        if(temp>=70&& temp<=80){
            System.out.println("This is ideal temp");
        }
    }
}