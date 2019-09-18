package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu \n 1 - Poulet \n 2 - Boeuf \n 3 - Vegetarien \n Que souhaitez-vous comme menu?\n");

    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        if (nbMenu == 1){
            System.out.println("vous avez choisi le menu 1");
        }
        else if(nbMenu == 2){
            System.out.println("vous avez choisi le menu 2");
        }
        else if(nbMenu == 3){
            System.out.println("vous avez choisi le menu 3");
        }
        else{
            System.out.println("Le menu choisi n'est pas propose");
        }
    }
}