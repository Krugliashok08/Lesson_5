package org.example;

 public class Bowl {
     private int foodAmount;



     public Bowl(int foodAmount) {

         this.foodAmount = foodAmount;

     }



     public void addFood(int food) {

         if (food <= 0) {

             System.out.println("Количество еды достаточно");

         } else {

             foodAmount += food;

             System.out.println("Добавлено в миску " + food + " еды");

         }

     }



     public int getFoodAmount() {

         return foodAmount;

     }

 }
