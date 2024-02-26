package org.example;

 class Bowl  extends Cat {
     private int food;
     private int level;
     Bowl (int food,int level) {
         this.food = food;
         this.level = level;
     }
     boolean level (int portion) {
         if ( food < portion) {
             return false;
         }
         food -= portion;
         return true;
     }
     void add ( int food) {
         if (this.food + food <= level) {
             this.food +=  food;
         }
     }

     @Override
     public String toString() {
         return "Bowl{" +
                 "food=" + food +
                 ", level=" + level +
                 '}';
     }
 }
