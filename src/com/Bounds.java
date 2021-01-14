package com;

public class Bounds {
	public int n,e,s,o;
	
	Bounds(int  nin,int ein,int sin,int oin){
		n=nin;
		s=sin;
		e=ein;
		o=oin;
	}
	
	public void nBound(int x){
		n=x;
	}
	public void eBound(int x){
		e=x;
	}
	public void sBound(int x){
		s=x;
	}
	public void oBound(int x){
		o=x;
	}
	public int getn() {
		return n;
	}
	public int gete() {
		return e;
	}
	public int gets() {
		return s;
	}
	public int geto() {
		return o;
	}
	
	
}
