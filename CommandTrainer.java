/*
 This program was built by Wallace Atterberry
 */

package commandtrainer;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Wally
 */
public class CommandTrainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereb
        
        System.out.println("Select one of the following:");
        System.out.println("a to learn Linux");
        System.out.println("b to learn Python");
        System.out.println("c to learn C++");
        System.out.println("d to learn R");
             
        Scanner wally = new Scanner(System.in);
        Scanner wally1 = new Scanner(System.in);
        Random forchoice = new Random();
        int numb;
        int pythcards =10;
        int howmanycards=5;
        int points = 0;
        
        String name1=wally.nextLine();
        
        
        
        
        
         //Linux Mode
         if(name1.equals("a")){
                System.out.println("You are learning Linux commands");
        
                for(int counter=1; counter<=howmanycards;counter++){
                    numb=1+forchoice.nextInt(pythcards);
                    //System.out.println(numb+" ");
                    if(numb==1){
                     System.out.println("Type the command to change directories to a subdirectory called sub");
                     String name=wally1.nextLine();
                        if(name.equals("cd sub")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==2){
                     System.out.println("Type the command to display the content of the current directory");
                     String name=wally1.nextLine();
                        if(name.equals("ls")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                                
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==3){
                     System.out.println("Type the command to display programs running.");
                     String name=wally1.nextLine();
                        if(name.equals("ps")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==4){                    
                     System.out.println("Type the command to send a stopped job to the background");
                     String name=wally1.nextLine();
                        if(name.equals("bg")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==5){
                     System.out.println("Type the command to remove all files that starts with jim");
                     String name=wally1.nextLine();
                        if(name.equals("rm -r jim*")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    if(numb==6){
                     System.out.println("Type the command to end job with PID 8888");
                     String name=wally1.nextLine();
                        if(name.equals("kill -9 8888")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==7){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("echo Hi")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==8){
                     System.out.println("Type the command to display the calendar and put the names of the current directory in a text file called sam (No spaces)");
                     String name=wally1.nextLine();
                        if(name.equals("cal;ls>sam.txt")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==9){                    
                     System.out.println("Type the command to run an R file and name the output a text called test then make a new file called test1 from the last 19 lines of test and display test1");
                     String name=wally1.nextLine();
                        if(name.equals("R --no-save --no-restore --no-environ<testR.r> test.txt;tail -n +19 test.txt>test1.txt;cat test1.txt")){
                            points=points+10;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong (c=int(input())). Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==10){
                     System.out.println("Type the command to show every line in a text file called sam except the lines that have a j in it");
                     String name=wally1.nextLine();
                        if(name.equals("grep -vi j sam.txt")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                }
         
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
        ///////////////////////////////////////////////////////////////////////
         
        //Python Mode
         else if(name1.equals("b")){
                System.out.println("You are learning Python commands");
                for(int counter=1; counter<=howmanycards;counter++){
                    numb=1+forchoice.nextInt(pythcards);
                    //System.out.println(numb+" ");
                    if(numb==1){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("print('Hi')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==2){
                     System.out.println("Type the command to use the random library ");
                     String name=wally1.nextLine();
                        if(name.equals("import random")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==3){
                     System.out.println("Type the command to produce a random number between 1 and 100.");
                     String name=wally1.nextLine();
                        if(name.equals("random.randint(1,100)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==4){                    
                     System.out.println("Type the command to ask for and input an integer called c");
                     String name=wally1.nextLine();
                        if(name.equals("c=int(input())")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==5){
                     System.out.println("Type the command to determine if a float is an integer");
                     String name=wally1.nextLine();
                        if(name.equals("float.is_integer()")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    if(numb==6){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("print('Hi')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==7){
                     System.out.println("Type the command to use the random library ");
                     String name=wally1.nextLine();
                        if(name.equals("import random")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==8){
                     System.out.println("Type the command to produce a random number between 1 and 100.");
                     String name=wally1.nextLine();
                        if(name.equals("random.randint(1,100)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==9){                    
                     System.out.println("Type the command to ask for and input of type integer called c");
                     String name=wally1.nextLine();
                        if(name.equals("c=int(input())")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong (c=int(input())). Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==10){
                     System.out.println("Type the command to determine if a float is an integer");
                     String name=wally1.nextLine();
                        if(name.equals("float.is_integer()")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                   
                    
                    if(numb==11){
                     System.out.println("Type the command header for a function called checkio with an array input");
                     String name=wally1.nextLine();
                        if(name.equals("def checkio(array):")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==12){
                     System.out.println("Type the command called j that is the last character of the array called array");
                     String name=wally1.nextLine();
                        if(name.equals("j = array[-1]")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==13){
                     System.out.println("Type the command that outputs the length of the array called array.");
                     String name=wally1.nextLine();
                        if(name.equals("len(array)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==14){                    
                     System.out.println("Type the command that outputs every other character in an array called array");
                     String name=wally1.nextLine();
                        if(name.equals("array[::2]")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    if(numb==15){
                     System.out.println("Type the command header of a for loop that loops through each ele of array called seq");
                     String name=wally1.nextLine();
                        if(name.equals("for ele in seq:")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
               
                    if(numb==16){
                     System.out.println("Type the command for the footer of a function");
                     String name=wally1.nextLine();
                        if(name.equals("print('if __name__== '__main__':')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==17){
                     System.out.println("Type the command to import a modula for testing ");
                     String name=wally1.nextLine();
                        if(name.equals("import doctest")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==18){
                     System.out.println("Type the command to test a function that removes whitespace");
                     String name=wally1.nextLine();
                        if(name.equals("doctest.testmod(verbose=True, optionflags=doctest.NORMALIZE_WHITESPACE)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==19){                    
                     System.out.println("Type the command to ask for and input an integer called c");
                     String name=wally1.nextLine();
                        if(name.equals("c=int(input())")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==20){
                     System.out.println("Type the command to determine if a float is an integer");
                     String name=wally1.nextLine();
                        if(name.equals("float.is_integer()")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    
                    if(numb==21){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("print('Hi')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==22){
                     System.out.println("Type the command to use the random library ");
                     String name=wally1.nextLine();
                        if(name.equals("import random")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==23){
                     System.out.println("Type the command to produce a random number between 1 and 100.");
                     String name=wally1.nextLine();
                        if(name.equals("random.randint(1,100)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==24){                    
                     System.out.println("Type the command to ask for and input an integer called c");
                     String name=wally1.nextLine();
                        if(name.equals("c=int(input())")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==25){
                     System.out.println("Type the command to determine if a float is an integer");
                     String name=wally1.nextLine();
                        if(name.equals("float.is_integer()")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    if(numb==26){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("print('Hi')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==27){
                     System.out.println("Type the command to use the random library ");
                     String name=wally1.nextLine();
                        if(name.equals("import random")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==28){
                     System.out.println("Type the command to produce a random number between 1 and 100.");
                     String name=wally1.nextLine();
                        if(name.equals("random.randint(1,100)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==29){                    
                     System.out.println("Type the command to ask for and input an integer called c");
                     String name=wally1.nextLine();
                        if(name.equals("c=int(input())")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==30){
                     System.out.println("Type the command to determine if a float is an integer");
                     String name=wally1.nextLine();
                        if(name.equals("float.is_integer()")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    
                    
                }
         }

    
         
         
         
         
         
     ///////////////////////////////////////////////////////////////////
         
         
         
         
         
         
        //Leanrning C++
         else if(name1.equals("c")){
                System.out.println("You are learning C++ commands");
        
                for(int counter=1; counter<=howmanycards;counter++){
                    numb=1+forchoice.nextInt(pythcards);
                    //System.out.println(numb+" ");
                    if(numb==1){
                     System.out.println("Type the command to print Hi");
                     String name=wally1.nextLine();
                        if(name.equals("cout << Hi << endl;")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==2){
                     System.out.println("Type the line to use input/out libraries");
                     String name=wally1.nextLine();
                        if(name.equals("#include <iostream>")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==3){
                     System.out.println("Type line to use the standard namespace");
                     String name=wally1.nextLine();
                        if(name.equals("using namespace std;")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==4){                    
                     System.out.println("Type the line to input max and end line");
                     String name=wally1.nextLine();
                        if(name.equals("cin<<max")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==5){
                     System.out.println("Type the header for a for loop to start at 1 and end at 6 (inclusive).");
                     String name=wally1.nextLine();
                        if(name.equals("for(int i=1; i <= 6; i++)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    if(numb==6){
                     System.out.println("Type the line to open and input text file named tall");
                     String name=wally1.nextLine();
                        if(name.equals("inputfile.open(tall.txt)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==7){
                     System.out.println("Type the line to declare a vector called manchild with double enters");
                     String name=wally1.nextLine();
                        if(name.equals("vector<double> manchild;")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==8){
                     System.out.println("Type the header of the if statement that returns true if k less than 7 and l is 4");
                     String name=wally1.nextLine();
                        if(name.equals("if((k<7)&&(l==4))")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    
                    if(numb==9){
                     System.out.println("Type the line to declare a vector called manchild with double enters");
                     String name=wally1.nextLine();
                        if(name.equals("vector<double> manchild;")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==10){
                     System.out.println("Type the header of the if statement that returns true if k less than 7 and l is 4");
                     String name=wally1.nextLine();
                        if(name.equals("if((k<7)&&(l==4))")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                }
                
                
        }
     
///////////////////////////////////////////////////////////
         
         
    //learning R commands
    else if(name1.equals("d")){
                System.out.println("You are learning R commands");
        
                for(int counter=1; counter<=howmanycards;counter++){
                    numb=1+forchoice.nextInt(pythcards);
                    //System.out.println(numb+" ");
                    if(numb==1){
                     System.out.println("Type the command to print hi");
                     String name=wally1.nextLine();
                        if(name.equals("print('Hi')")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==2){
                     System.out.println("Type the command to produce a vector x");
                     String name=wally1.nextLine();
                        if(name.equals("x<-c(1,2,3)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==3){
                     System.out.println("Type the command to plot the vector x");
                     String name=wally1.nextLine();
                        if(name.equals("plot(x)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==4){                    
                     System.out.println("Type the command to display the first entry in vector x");
                     String name=wally1.nextLine();
                        if(name.equals("x[1]")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==5){
                     System.out.println("Type the header for the while i is less than 100");
                     String name=wally1.nextLine();
                        if(name.equals("while(i<100)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    
                    if(numb==6){
                     System.out.println("Type the command to for the boxplot of x");
                     String name=wally1.nextLine();
                        if(name.equals("boxplot(x)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==7){
                     System.out.println("Type the command to display the length of vector x");
                     String name=wally1.nextLine();
                        if(name.equals("length(x)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==8){
                     System.out.println("Type the command to display the help menu for command j");
                     String name=wally1.nextLine();
                        if(name.equals("menu(j)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    
                     if(numb==9){
                     System.out.println("Type the command to display the mean of vector x");
                     String name=wally1.nextLine();
                        if(name.equals("mean(x)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                        }
                    }
                    if(numb==10){
                     System.out.println("Type the command to create a data frame for a,b and c");
                     String name=wally1.nextLine();
                        if(name.equals("data.frame(a,b,c)")){
                            points=points+5;
                            System.out.print("Right! Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
         
                        }
                        else{
                            points=points-5;
                            System.out.print("Wrong. Your points are: ");
                            System.out.println(points);
                            System.out.print(" ");
                        }
                    }
                    
                
    }
         
} 
    }
}
        
