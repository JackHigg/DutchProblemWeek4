package DutchProblem;

import java.util.Scanner;
import java.util.Vector;

public class Menu {

        private int choice;
        private boolean repeat= true;

        Vector<GenerateBalls> balls = new Vector<GenerateBalls>();
        private int x=0;


        public Menu(){

            while (repeat){

                menu();

                lineBrake();

                optionChoice();

            }
        }

        public void menu(){

            Scanner kboard = new Scanner(System.in);
            System.out.println("\nMenu");
            System.out.println("\n1: Generate random sequence of balls red,white,blue");
            System.out.println("\n2: re oder sequence to match the dutch flag");
            System.out.println("\n6: Quit\n");
            choice=kboard.nextInt();


        }

        public void optionChoice(){


            switch (choice){

                case 1:

                    GenerateBalls G1 = new GenerateBalls();
                    G1.displayBalls();
                    balls.add(G1);

                    x=x+1;

                    break;


                case 2:

                    GenerateBalls show;

                    show=balls.get(x-1);
                    show.displayBalls();
                    show.reorderBalls();
                    show.displayBalls();






                    break;

                case 3:

                    System.out.println("Exiting program.... goodbye!");
                    repeat =false;

                    break;

                default:

                    System.out.println("Please enter a valid option number");

                    break;
            }
        }

        public void lineBrake(){

            System.out.println("------------------------------------------------");
        }

}

