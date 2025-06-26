package com_day12;

import java.util.Stack;

public class BrowserHistory {

	 Stack<String> backStack= new Stack();
	 Stack<String>forwardStack=new Stack();
	 String currentPage="Home";
	 
	 public void visit(String url) {
		 backStack.push(currentPage);
		 currentPage=url;
		 forwardStack.clear();
		 System.out.println("Visited  "+currentPage);
	 }
	 public void back() {
		 if(!backStack.isEmpty()) {
			 forwardStack.push(currentPage);
			 currentPage=backStack.pop();
			 System.out.println("went back tocurrent page   "+currentPage);
		 }
	 }
	 public void forward() {
		 if(!forwardStack.isEmpty())
		 {
			 backStack.push(currentPage);
			 currentPage= forwardStack.pop();
			 System.out.println("Went forward to:" +currentPage);
		 }
		 else
		 {
			 System.out.println("");
		 }
	 }
	 public void currentPage() {
		 System.out.println("Current Page  "+ currentPage);
	 }
	 public static void main(String[] args) {
		BrowserHistory history=new BrowserHistory();
		history.visit("google.com");
		history.visit("openai.com");
		history.visit("github");
		
		history.back();
		history.back();
		
		history.currentPage();
	}
}
