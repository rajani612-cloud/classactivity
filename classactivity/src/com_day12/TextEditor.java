package com_day12;

import java.util.Stack;

public class TextEditor {
    String text="";
   Stack<String>undo= new Stack();
	 Stack<String>redo=new Stack();
	 public void type(String newtext)
	 {
		 undo.push(text);
		 text+=newtext;
		 redo.clear();
	 }
	  
	 public void undo()
	 {
		if(!undo.isEmpty())
		{
			redo.push(text);
			text=undo.pop();
		}
		else {

          System.out.println("Nothing to undo.");

		}
	 }
	 public void redo() {
		 if(!redo.isEmpty()) {
			 undo.push(text);
			 text=redo.pop();
		 }

		 else {
			 System.out.println("Nothing to undo.");
		 }
	 }

//    public String getText() {
//        return text;
//    }
	 
		 
	 
	 public void show() {
		 System.out.println("Current Text:" +text);
	 }
	 public static void main(String[] args) {
		TextEditor editor =new TextEditor();
		editor.type("Welcome to telecomService");
		editor.type(" verizon");
		editor.show();
		editor.undo();
		editor.show();
		
		editor.redo();
		editor.show();
		

          editor.undo();
          editor.undo();
          editor.show(); 

             editor.redo();
            editor.show(); 

	}
}
