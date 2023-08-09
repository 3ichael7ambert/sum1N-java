package Java.sum1N-java;

import  java.util.Scanner;

public class sum1N {
    public static void main(String[] args) {
         		Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int x = 1;
int calc = 0;
boolean finished = false;

while (x<=N)
{
calc+=x;
x++;
if (x==N) {finished = true;}
}
if (finished==true) {System.out.println(calc);}

    }

}