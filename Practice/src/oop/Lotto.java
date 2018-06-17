package oop;

public class Lotto {
	int ball1, ball2, ball3, ball4, ball5, ball6, price, count;
	int[][] randoms = new int[20][6];

	
	public void setPrice() {
		this.price = price;
	}

	public void setCount(int price) {
		count = price / 1000;
	}

	public void setRandoms() {
			for(int i=0; i<count; i++) {
				for(int j=0; j<6; j++) {
					randoms[i][j]=(int)(Math.random()*45)+1;
			}
		}
	}


	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	public int[][] getRandoms() {
		return randoms;
	}
}
