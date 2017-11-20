public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello world!\n");
        int x = 10;

        System.out.println("True + break \n");
        switch(x){
            case 10:
                System.out.println("One");
                break;
            case 5:
                System.out.println("two");}

        System.out.println("True  !break \n");
        switch(x){
            case 10:
                System.out.println("One");
            case 5:
                System.out.println("two");}

        System.out.println("False \n");
        switch(x){
            case 7:
                System.out.println("One");
            case 5:
                System.out.println("two");}

    }
}

