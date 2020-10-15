package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

  @Test
  public void TestPrime() {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  } @Test
  public void TestNonPrime() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
}
