package io.github.sejoung.sealed.ex02;

public sealed class Rectangle extends Shape permits FilledRectangle {

	public double length, width;
}
