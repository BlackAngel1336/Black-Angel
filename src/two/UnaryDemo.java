package two;

public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        System.out.println("Broj 1 sa + " + broj1);

        broj1 = -broj1;
        System.out.println("Broj 1 sa - " + broj1 );
        broj1= 23;
        broj1++;
        System.out.println("Post Increment:" + broj1);
        broj1 = 23;
        ++broj1;
        System.out.println("Pre Increment" + broj1);
        broj1 = 23;
        System.out.println(broj1++);// 24  prvo posalji u konzolu(run konzola) a nakon toga uvecaj za 1
        System.out.println(broj1);
        broj1= 23;
        System.out.println(++broj1);// 24
        System.out.println(broj1);// 24
        //Post
        broj1= 23;
        System.out.println(broj1--);// 23
        System.out.println(broj1);// 22
        // Pre
        broj1= 23;
        System.out.println(--broj1);// 22
        System.out.println(broj1);// 22





    }}
