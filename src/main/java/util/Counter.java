package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment (EDITED)
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement(EDITED)
	}

	// method resets _ctr
	public void reset() {
		   _ctr = 0; // corrected reset, _ctr should be 0 (EDITED)
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		_ctr = (_ctr % 2 == 0) ? _ctr : _ctr + 1;
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		_ctr = (_ctr % 2 == 0) ? _ctr : _ctr - 1;
	}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		_ctr = getNextPrime(_ctr);
	}

	private int getNextPrime(int num) {
		while (!isPrime(++num)) ;
		return num;
	}

	private boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		_ctr = getPreviousPrime(_ctr);
	}
	
	private int getPreviousPrime(int num) {
		while (!isdePrime(--num)) {
			if (num < 2) {
				// Special case for handling _ctr values less than 2
				num = 2;
				break;
			}
		}
		return num;
	}
	
	// Helper method to check if a number is prime
	private boolean isdePrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = -99;
	}

}
