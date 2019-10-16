package com.dc.graph.model;

public class Cell {
	private int row;
	private int col;
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	
	@Override
	public String toString() {
		return "Cell [row=" + row + ", col=" + col + "]";
	}
}
