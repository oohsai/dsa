public class seive {
    public static void main(String[] args) {
        int n = 6; //chane this according to the number you want  to change to!
        boolean[] primes = new boolean[n+1]; // Sets all array space to the n+1 size so that the number otself can be cosnidered and any boolean array is set to default false in java.
        sieve(n, primes); 
    }

    static void sieve ( int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) { // as we dont need to check for numbers under the sqrt of the number, we use i*i to reduce the arr space.
            if (!primes[i]){ // as all elements in primes array are set to false. everything at first passes this and goes on to the next loop
                for (int j = i*2; j <= n ; j+=i) { //inner loop that check if the number is prime. vvvvvimp line
                    primes[j] = true; //changes the value of the index to true

                }
            }

        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) { //true element gets printed i.e. element which has a factor is set to true and gets eliminated.
                System.out.print(i + " "); //Print the series of Primes Numbers before the given number.
            }

        }
    }
}
