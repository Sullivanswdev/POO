package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Leao leao1 = new Leao("Pimpão", 50);
        Leao leao2 = new Leao("Jubileu", 40);
        Cobra cobra1 = new Cobra("CobraKai", 30);
        Cobra cobra2 = new Cobra("Venenosa", 20);
        Macaco macaco1 = new Macaco("Robert", 15);
        Macaco macaco2 = new Macaco("Lauro", 25);
        Elefante elefante1 = new Elefante("Danilo", 28);
        Elefante elefante2 = new Elefante("Davi", 36);
        Jacare jacare1 = new Jacare("Jaca", 25);
        Jacare jacare2 = new Jacare("Furioso", 30);

        ArrayList<Animal> lista = new ArrayList();

        lista.add(leao1);
        lista.add(leao2);
        lista.add(cobra1);
        lista.add(cobra2);
        lista.add(macaco1);
        lista.add(macaco2);
        lista.add(elefante1);
        lista.add(elefante2);
        lista.add(jacare1);
        lista.add(jacare2);

        }


//       for(int i=0; i<lista.size(); i++){
//
//           Leao l = lista.get(i);
//
//           System.out.println(l.getNome());
//       }

//        for(Leao l: lista){
//            System.out.println(l.getNome());
//        }

//        lista.forEach(leo -> System.out.println(leo.getIdade()));

        }


