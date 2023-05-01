package PracticalWeek1;

import java.util.Objects;

/*
Create the following methods for the Subway class:

board - Accepts an integer that represents the number of passengers boarding the subway.

disembark - Accepts an integer that represents the number of passengers exiting the subway.
There cannot be a negative number of passengers on a subway. The fewest number of passengers on a subway is 0.

advance - Moves the subway to the next stop. If direction is "south" the subway moves from Alewife to Kendall.
If direction is "north" the subway moves from Kendall to Alewife. When the subway has reached its final stop, direction should change.

distance - Accepts a string that represents a stop and returns the number of stops between the subway and the desired stop.
The distance should be a positive number.

changeFare - Accepts a float and changes the fare for all instances of the Subway class.

calculate_fares - Calculates the fare for each passenger boarding the subway and adds it to totalFares.
*/


    //add class definitions below this line

    class Subway {
        static double fare = 2.4;
        String[] stops;
        String currentStop;
        String direction;
        int passengers;
        double totalFares;

        Subway() {
            stops = new String[]{"Alewife", "Davis", "Porter", "Harvard", "Central", "Kendall"};
            currentStop = "Alewife";
            direction = "south";
            passengers = 0;
            totalFares = 0;
        }

        void board(int numberOfPassengersBoarding){
            this.passengers += numberOfPassengersBoarding;
            calculateFair(numberOfPassengersBoarding);
        }

        void disembark(int numberOfPassengersDisembarking){
            if (numberOfPassengersDisembarking > this.passengers){
                System.out.println("Cant have a negative amount of passengers");
            } else {
                this.passengers -= numberOfPassengersDisembarking;
            }
        }

        void advance(String direction){
            this.direction = direction;
            int currentIndexOfStop = 0;
            for (int i = 0; i < this.stops.length; i++){
                if (this.stops[i].equals(this.currentStop)){
                    currentIndexOfStop = i;
                }
            }
            if (Objects.equals(this.direction, "south") && currentIndexOfStop == 0 ){
                int totalAmountOfStops = this.stops.length - 1;
                this.currentStop = this.stops[totalAmountOfStops];
            } else if ((Objects.equals(this.direction, "south") && currentIndexOfStop > 0 )) {
                currentIndexOfStop = currentIndexOfStop - 1;
                this.currentStop = this.stops[currentIndexOfStop];

            }
            if (Objects.equals(this.direction, "north") && currentIndexOfStop < this.stops.length){
                currentIndexOfStop = currentIndexOfStop + 1;
                this.currentStop = this.stops[currentIndexOfStop];
            } else if (Objects.equals(this.direction, "north") && currentIndexOfStop == this.stops.length){
                currentStop = this.stops[0];
            }
        }

         int distance(String stopToCompare){
            int currentIndexOfStop = 0;
            int indexOfStopToCompare = 0;
            for (int i = 0; i < this.stops.length; i++){
                if (this.stops[i].equals(this.currentStop)){
                    currentIndexOfStop = i;
                }
                if (this.stops[i].equals(stopToCompare)){
                    indexOfStopToCompare = i;
                }
            }
            if (currentIndexOfStop > indexOfStopToCompare){
                return currentIndexOfStop - indexOfStopToCompare;
             } else {
                return indexOfStopToCompare - currentIndexOfStop;
            }
        }
        void changeFare(double newFarePrice){
            fare = newFarePrice;
        }

        void calculateFair(int numberOfPassengersBoarding){
            totalFares = totalFares + (numberOfPassengersBoarding * fare);
        }


    }
//add class definitions above this line
