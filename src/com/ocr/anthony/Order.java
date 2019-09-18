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
        switch (nbMenu){
            case 1 : System.out.println("vous avez choisi le menu Poulet");
            break;
            case 2 : System.out.println("vous avez choisi le menu Boeuf");
            break;
            case 3 : System.out.println("vous avez choisi le menu Vegetarien");
            break;
            default : System.out.println("Aucun menu existant");
            break;
        }
    }
}