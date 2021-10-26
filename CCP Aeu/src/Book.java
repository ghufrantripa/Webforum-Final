/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ghufran Tripa
 */

public Class Book 
{
	 String title;
	 String publisher;
	 Double price;
	
	//Constructor 1
	 public Book (String s)
	 { title = s; }
	 
	//Constructor 2
	 public Book (String s, String p)
	 { title = s; 
	   publisher = p;}
	 
	//Constructor 3
	 public Book (String s, String p, double c)
	 { title = s; 
	   publisher = p;
	   price = c;}
	 
	//Constructor 4
	 public Book ()
	 { title = "unknown"; }
	 
	 Public void printBook ()
	 {System.Out.Println('\t' + Title + '\t'+ Publisher +'\t' + Price);}
	 }

