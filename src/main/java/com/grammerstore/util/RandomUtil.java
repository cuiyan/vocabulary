package com.grammerstore.util;

import java.util.Random;

public class RandomUtil {
	public static int getRandomInt(int min,int max) {
		Random random = new Random();
		return  random.nextInt(max)%(max-min+1) + min;
	}
	public static void main(String[] args) {
		System.out.println(getRandomInt(0,3));
	}
}
