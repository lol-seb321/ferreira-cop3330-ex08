package ex08;
/*
Exercise 8 - Party Party

Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

Example Output

How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.

 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Base {
        static Scanner input = new Scanner(System.in);

        public static void main (String[] args){
        Base myBase = new Base();


        int input = myBase.inputPeople();
        int input2 = myBase.inputPizzas();

        Party myParty = new Party();

        myParty.people = input;
        myParty.pizzas = input2;
        myParty.slices = input * input2;

        myBase.printMath(myParty.people, myParty.slices, myParty.pizzas);
        }

        private void printMath(int people, int slices, int pizzas) {
                System.out.println(people + " people with " + pizzas + " pieces of pizza " + "(" + slices + " slices)" );
                int eachPerson =  slices / people;
                System.out.println("Each person gets " + eachPerson + " pieces of pizza.");
                int leftover = people / slices;
                System.out.println("There are " + leftover + " leftover pieces");
        }

        private int inputPizzas() {
                System.out.print("How many pizzas do you have? ");
                int pizzas = Integer.parseInt(input.nextLine());
                int pizzas1 = pizzas;

                return pizzas1;
        }


        private int inputPeople() {
                System.out.print("How many people? ");
                int people = Integer.parseInt(input.nextLine());
                int people1 = people;

                return people1;
        }
}
