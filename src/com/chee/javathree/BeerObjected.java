package com.chee.javathree;

public class BeerObjected {

	public int numOfBeer;
	
	public BeerObjected(int numOfBeer) {
		this.numOfBeer = numOfBeer;
	}
	
	public void decreaeseBeer() {
		numOfBeer--;
	}
	
	public static void main(String[] args) {
		BeerObjected beer = new BeerObjected(99);
		for(int i = 0; i < 99; i++) {
			System.out.println(beer.numOfBeer + " bottles of beer on the wall");
			System.out.println(beer.numOfBeer + " bottles of beer on the wall");
			System.out.println("Take one down, pass it around");
			System.out.println(beer.numOfBeer - 1 + " bottles of beer left on the wall\n");
			beer.decreaeseBeer();
		}
	}
}
