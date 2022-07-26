package org.example;

    public class circle {
        int radius;

        public double getSquare(){
        return this.radius *  this.radius* 3.14;
        }



        public double getLenght(){
            return 2 * 3.14 *  this.radius;
        }

        public double getDiameter(){
            return 2  *  this.radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }


        public circle(int radius) {
            this.radius = radius;
        }
    }