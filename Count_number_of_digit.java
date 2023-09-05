package DSA.first;

public class Count_number_of_digit {
    public static void main(String[] args) {
        int num=345645532;
        int no_digit=0;
        while (num!=0)
        {
            no_digit++;
            num=num/10;
        }
        System.out.println(no_digit);
    }
}
