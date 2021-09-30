package com.moveo.aem.training.core.utility;

public class Utils {

    public static String translateDay(String day){

        switch(day) {
            case "MONDAY":
                return "Luned\u00ec";
            case "TUESDAY":
                return "Marted\u00ec";
            case "WEDNESDAY":
                return "Mercoled\u00ec";
            case "THURSDAY":
                return "Gioved\u00ec";
            case "FRIDAY":
                return "Venderd\u00ec";
            case "SATURDAY":
                return "Sabato";
            default: return  "Domenica";
        }
    }
}
