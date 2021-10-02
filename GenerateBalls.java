package DutchProblem;

public class GenerateBalls {

    private String topBall;
    private String middleBall;
    private String bottomBall;

    private int red=1;
    private int white=2;
    private int blue=3;


    public GenerateBalls(){

        setTopBall();
        setMiddleBall();
        setBottomBall();

        while(this.topBall=="red" && this.middleBall=="white" && this.bottomBall=="blue"){

            setTopBall();
            setMiddleBall();
            setBottomBall();

        }



    }

    public void setTopBall(){

         int generate = (int) (Math.random() * 3) +1;

         this.topBall = (generate==this.red)? "red" : (generate==this.white)? "white" : "blue";


    }

    public void setMiddleBall(){

        int generate = (int) (Math.random() * 3) +1;

        this.middleBall = (generate==this.red)? "red" : (generate==this.white)? "white" : "blue";

        while(this.topBall==this.middleBall){

            generate = (int) (Math.random() * 3) +1;

            this.middleBall = (generate==this.red)? "red" : (generate==this.white)? "white" : "blue";

        }



    }

    public void setBottomBall(){

        int generate = (int) (Math.random() * 3) +1;

        this.bottomBall = (generate==this.red)? "red" : (generate==this.white)? "white" : "blue";

        while(this.bottomBall==this.middleBall || this.bottomBall==this.topBall){

            generate = (int) (Math.random() * 3) +1;

            this.bottomBall = (generate==this.red)? "red" : (generate==this.white)? "white" : "blue";

        }


    }

    public String getTopBall(){

        return this.topBall;
    }

    public String getMiddleBall(){

        return this.middleBall;
    }

    public String getBottomBall(){

        return this.bottomBall;
    }

    public void reorderBalls() {

        String array[] = new String[3];

        array[0] = this.topBall;
        array[1] = this.middleBall;
        array[2] = this.bottomBall;


        String hold;


        for (int x = 0; x < array.length - 1; x++) {

            if (array[0] != "red") {

                if (x == 1) {
                    hold = array[0];
                    array[0] = array[x + 1];
                    array[x + 1] = hold;


                } else {

                    hold = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = hold;
                }

                if (array[0]=="red" && array[1] != "white") {
                    hold = array[1];
                    array[1] = array[1 + 1];
                    array[1 + 1] = hold;

                }

            }

        }

        this.topBall=array[0];
        this.middleBall=array[1];
        this.bottomBall=array[2];

    }


    public void displayBalls(){
        System.out.println("---------------------------------------------");
        System.out.println("\n"+this.topBall);
        System.out.println(this.middleBall);
        System.out.println(this.bottomBall+"\n");
        System.out.println("---------------------------------------------");
    }


}
