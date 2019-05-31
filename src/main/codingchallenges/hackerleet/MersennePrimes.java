package main.codingchallenges.hackerleet;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;


/**
 * This program shows the implementation of Java 9's Lambda Streams to do Mersenne prime numbers search. These possible primes
 * are of the form 2^(p) - 1 and uses .
 */
public class MersennePrimes {

    public static void main(String[] args) {

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(40)
                .forEach(System.out::println);

    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
