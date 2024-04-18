package com.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personaje iaPersonaje = null;
        Personaje miPersonaje = null;
        int eleccion = 0;
        int muertosIA = 0;
        int muertosmio = 0;
        // creamos los personajes disponibles para combatir
        Personaje Gandalf = new Mago(25, 10, 100, "Gandalf");
        Personaje Saruman = new Mago(25, 10, 10, "Saruman");
        Personaje Balrog = new Mago(35, 10, 10, "Balrog");
        Personaje Aragorn = new Guerrero(20, 20, 100, "Aragorn");
        Personaje Legolas = new Guerrero(15, 25, 100, "Legolas");
        Personaje Gimli = new Guerrero(10, 20, 100, "Gimli");
        Personaje Lurtz = new Guerrero(25, 15, 10, "Lurtz");
        Personaje Orco = new Guerrero(5, 5, 10, "Orco");
        // Creamos los dos bandos
        Personaje luz[] = { Gandalf, Aragorn, Legolas, Gimli };
        Personaje oscuridad[] = { Saruman, Balrog, Lurtz, Orco };
        // damos la bienvenido al programa

        System.out.println("Bienvenido al Abism Of Helm");
        System.out.println(" ");

        do {
            try {
                // pintamos el menu al usuario
                pintarMenu();
                // pedimos la usuario elegir un bando sin saber su "contenido"
                eleccion = input.nextInt();
                System.out.println(" ");
            }

            catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Debes elegir una opcion valida,");
            }
        } while (eleccion != 3 && eleccion != 2 && eleccion != 1);

        // segun la eleccion de bando mostramos por pantalla el mensaje de suso dicha
        // banda
        switch (eleccion) {
            case 1: {
                System.out.println(
                        "Gandalf: El valor será ahora tu mejor defensa contra la tormenta que se avecina, eso y la esperanza que traigo"
                                + "\n" + " ");
                System.out.println(
                        "Ahora que has decidido unirte al bando de la luz,deberas decidir tu primer personaje para la batalla:"
                                + "\n");

                miPersonaje = elegirPersonaje(luz);
                iaPersonaje = personajeIA(oscuridad);

                break;
            }
            case 2: {
                System.out.println(
                        "Ash nazg durbatulûk, ash nazg gimbatul, ash nazg thrakatulûk, agh burzum-ishi krimpatul"
                                + "\n");
                System.out.println("Saruman: ¡Un nuevo poder está surgiendo!");
                System.out.println(" ");
                miPersonaje = elegirPersonaje(oscuridad);
                iaPersonaje = personajeIA(luz);
                break;
            }
            case 3: {
                System.out.println("Aragorn: El mal y el bien no han cambiado desde ayer...");
                break;
            }
        }

        if (eleccion != 3) {
            do {
                batalla(miPersonaje, iaPersonaje);
                switch (eleccion) {
                    case 1: {

                        if (miPersonaje.getVida() > 0 && iaPersonaje.getVida() < 1) {
                            muertosIA++;
                            iaPersonaje = personajeIA(oscuridad);
                            if(muertosIA <=3)
                                System.out.println("el rival ha escogido el personaje: " + iaPersonaje.getNombre());

                        } else if (iaPersonaje.getVida() > 0 && miPersonaje.getVida() < 1) {
                            muertosmio++;
                            miPersonaje = elegirPersonaje(luz);
                            System.out.println(
                                            "Has elegido continuar la batalla en la piel de: "
                                                    + miPersonaje.getNombre());

                        } else if (iaPersonaje.getVida() < 1 && miPersonaje.getVida() < 1) {
                            muertosmio++;
                            muertosIA++;
                            iaPersonaje = personajeIA(oscuridad);
                            System.out.println("el rival ha escogido el personaje: " + iaPersonaje.getNombre());
                            miPersonaje = elegirPersonaje(luz);
                            System.out.println(
                                            "Has elegido continuar la batalla en la piel de: "
                                                    + miPersonaje.getNombre());
                        }
                    }
                        break;
                    case 2: {
                        {

                            if (miPersonaje.getVida() > 0 && iaPersonaje.getVida() < 1) {
                                muertosIA++;
                                iaPersonaje = personajeIA(luz);
                                if(muertosIA <=3)
                                System.out.println("el rival ha escogido el personaje: " + iaPersonaje.getNombre());

                               
                            } else if (iaPersonaje.getVida() > 0 && miPersonaje.getVida() < 1) {
                                muertosmio++;
                                miPersonaje = elegirPersonaje(oscuridad);
                                if (muertosmio < 4)
                                    System.out.println(
                                            "Has elegido continuar la batalla en la piel de: "
                                                    + miPersonaje.getNombre());
                            } else if (iaPersonaje.getVida() < 1 && miPersonaje.getVida() < 1) {
                                muertosmio++;
                                muertosIA++;
                                iaPersonaje = personajeIA(luz);
                                System.out.println("el rival ha escogido el personaje: " + iaPersonaje.getNombre());
                                miPersonaje = elegirPersonaje(oscuridad);
                                System.out.println(
                                            "Has elegido continuar la batalla en la piel de: "
                                                    + miPersonaje.getNombre());
                            }
                        }
                    }

                }

            } while (muertosIA <= 3 && muertosmio <= 3);
        }
        if (muertosmio >= 3) {
            System.out.println("No te quedan personajes con los que combatir...");
            System.out.println("El viaje no acaba aquí, la muerte es solo otro camino que todos hemos de tomar");
        } else if (muertosIA >= 3) {
            System.out.println("Al rival no le quedan personajes con los que combatir");
            System.out.println("No os diré, no lloréis, pues no todas las lágrimas del mundo son amargas");
        }

        // fin del MAIN

        // Metodos y procedimientos
    }

    // metodo de pintar el menu
    public static void pintarMenu() {
        System.out.println("Escoge el camino que deseas:");
        System.out.println("1. Camino de la luz");
        System.out.println("2. Camino de la oscuridad");
        System.out.println("3. Evita las nefastas consecuencias de la guerra y persigue a smeagol en busca del tesoro");
    }

    // Metodo para elegir el personaje con el cual vamos a combatir
    static Scanner imput = new Scanner(System.in);

    // elegimos el personaje con este metodo
    public static Personaje elegirPersonaje(Personaje bando[]) {
        String temp;
        int valor = 0;
        boolean vivos = false, nombreValido = false;

        for (int i = 0; i < bando.length; i++) {
            if (bando[i].getVida() > 0) {
                vivos = true;
                System.out.println(bando[i]);

            } else {
                bando[i].setNombre(null);
            }
        }
        if (vivos == true) {
            while (nombreValido == false) {

                temp = imput.nextLine();
                for (int i = 0; i < bando.length; i++) {
                    if (temp.equalsIgnoreCase(bando[i].getNombre())) {
                        valor = i;
                        nombreValido = true;
                        break;
                    }

                }
                if (nombreValido == false) {
                    System.out.println("Por favor,escoge un nombre de la lista anterior");
                }

            }
        }
        return bando[valor];
    }

    // la IA elige un personaje de entre sus camaradas
    public static Personaje personajeIA(Personaje bando[]) {
        int valor = 0;
        boolean vivos = false;
        for (int i = 0; i < bando.length; i++) {
            if (bando[i].getVida() > 0) {
                vivos = true;
            }

        }
        if (vivos == true) {
            do {
                Random rnd = new Random();
                valor = rnd.nextInt(0, 4);
            } while (bando[valor].getVida() < 1);
        }
        return bando[valor];

    }

    // Metodo para Batallar el personaje elegido contra el personaje escogido por la
    // IA
    public static void batalla(Personaje miPersonaje, Personaje iaPersonaje) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        /*
         * iniciamos las variables del método
         * la ia ataca con 0, y defiende con 1
         */
        int ia;
        Mago m = null;
        Mago iam = null;
        Guerrero g = null;
        Guerrero iag = null;
        int temp;
        int daño,dañoM,iaDañoM,iaAtaque;
        // hacemos un cast de mago para convertir el personaje en mago o guerrero segun
        // la elección

        if (iaPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
            iam = (Mago) iaPersonaje;
        }

        else {
            iag = (Guerrero) iaPersonaje;
        }
        if (miPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
            m = (Mago) miPersonaje;
        } else {
            g = (Guerrero) miPersonaje;
        }

        // Bucle de batalla hasta que uno de los dos combatientes se quede con vida
        // igual o menor a 0
        while (miPersonaje.getVida() > 0 && iaPersonaje.getVida() > 0) {

            ia = rnd.nextInt(0, 2);
            // pintamos datos de los personajes y pintamos menu segun corresponda
            System.out.println(" ");
            System.out.println("  " + miPersonaje.getNombre() + "    vs     " + iaPersonaje.getNombre());

            System.out.println("HP   " + miPersonaje.getVida() + "    vs     " + iaPersonaje.getVida());
            System.out.println(" ");
            // pintamos las opociones de batalla
            System.out.println("que deseas hacer?");
            if (miPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                System.out.println("1. lanzar hechizo" + "\n"
                        + "2. Defender");
            } else {
                System.out.println("1. Atacar" + "\n"
                        + "2. Defender");
            }
            System.out.println(" ");
            try {

                temp = input.nextInt();
                if (ia == 1) {
                    System.out.println(iaPersonaje.getNombre() + " decide defenderse");
                }
                switch (temp) {
                    case 1:
                        if (ia == 0) {
                            if (miPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                                System.out.println("has decidido tirar un hechizo");
                                dañoM = m.hechizo();
                                iaPersonaje.setVida(iaPersonaje.getVida() - dañoM);
                                System.out.println(miPersonaje.getNombre() + " ha inflingido " + dañoM + " de daño");

                            } else {
                                System.out.println(miPersonaje.getNombre() + " ha decidido atacar");
                                int vida = iaPersonaje.getVida();
                                int ataque = g.atacar();
                                System.out.println(miPersonaje.getNombre() + " ha inflingido " + ataque + " de daño");
                                int resultado = vida - ataque;
                                iaPersonaje.setVida(resultado);

                                // iaPersonaje.setVida((iaPersonaje.getVida() - g.atacar()));
                            }
                            if (iaPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                                System.out.println(iaPersonaje.getNombre() + " decide lanzarte un hechizo");
                                iaDañoM = iam.hechizo();
                                System.out.println(iaPersonaje.getNombre() + " te ha inflingido " + iaDañoM + " de daño");
                                miPersonaje.setVida(miPersonaje.getVida() - iaDañoM);
                            } else {
                                System.out.println(iaPersonaje.getNombre() + " decide atacarte");
                                iaAtaque = iag.atacar();
                                System.out.println(iaPersonaje.getNombre() + " te ha inflingido " + iaAtaque + " de daño");
                                miPersonaje.setVida(miPersonaje.getVida() - iaAtaque);
                            }
                        } else {

                            if (miPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                                System.out.println("has decidido tirar un hechizo");
                                daño = m.hechizo() - iaPersonaje.getDefensa();
                            } else {
                                System.out.println(miPersonaje.getNombre() + " ha decidido atacar");
                                daño = g.atacar() - iaPersonaje.getDefensa();
                            }
                            if (daño > 0) {
                                System.out.println(miPersonaje.getNombre() + " ha inflingido " + daño + " de daño");
                                iaPersonaje.setVida(iaPersonaje.getVida() - daño);
                            }
                            else{
                                System.out.println(miPersonaje.getNombre() + " no ha conseguido penetrar la defensa del rival");
                            }
                        }
                        break;
                    case 2:
                        System.out.println(miPersonaje.getNombre() + " decide defenderse");
                        if (ia == 0) {
                            
                                if (iaPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                                    System.out.println(iaPersonaje.getNombre() + " decide lanzarte un hechizo");
                                int dañoiaM = iam.hechizo() - miPersonaje.getDefensa();
                                if (dañoiaM > 0) {
                                    System.out.println(iaPersonaje.getNombre() + " te ha inflingido " + dañoiaM + " de daño");
                                    miPersonaje.setVida(miPersonaje.getVida() - dañoiaM);
                                }
                                else{
                                    System.out.println(iaPersonaje.getNombre() + " no ha conseguido penetrar la defensa del rival");
                                }
                            } 
                            else {
                                System.out.println(iaPersonaje.getNombre() + " decide atacarte");
                                int dañoiaG = iag.atacar() - miPersonaje.getDefensa();
                                if (dañoiaG > 0) {
                                    System.out.println(iaPersonaje.getNombre() + " te ha inflingido " + dañoiaG + " de daño");
                                    miPersonaje.setVida(miPersonaje.getVida() - dañoiaG);
                                }
                                else{
                                    System.out.println(iaPersonaje.getNombre() + " no ha conseguido penetrar la defensa del rival");
                                }
                            }
                        
                        

                        
                }else if(ia == 1){
                    System.out.println("Los rivales se miran fijamente esperando el ataque del rival...");
                }
                break;
            }
        } catch (InputMismatchException e) {
                System.out.println("selecciona una opcion válida");
                System.out.println("que deseas hacer?");
                if (miPersonaje.getClass().getSimpleName().equalsIgnoreCase("Mago")) {
                    System.out.println("1. lanzar hechizo" + "\n"
                            + "2. Defender");
                } else {
                    System.out.println("1. Atacar" + "\n"
                            + "2. Defender");
                }
                System.out.println(" ");
                input.nextLine();

            }

        }

        if (iaPersonaje.getVida() < 1 && miPersonaje.getVida() > 0) {
            System.out.println(iaPersonaje.getNombre() + " Ha muerto");
            System.out.println("El rival debe escoger otro personaje para continuar la batalla");
            System.out.println(" ");
        } else if (miPersonaje.getVida() < 1 && iaPersonaje.getVida() > 0) {
            System.out.println(miPersonaje.getNombre() + " Ha muerto");
            System.out.println(iaPersonaje.getNombre() + " te ha matado");
            System.out.println("Debes escoger otro personaje para continuar la batalla");
            System.out.println(" ");
        } else if (miPersonaje.getVida() < 1 && iaPersonaje.getVida() < 1) {
            System.out.println(iaPersonaje.getNombre() + " Ha muerto");
            System.out.println(miPersonaje.getNombre() + " Ha muerto");
            System.out.println("La batalla ha resultado fatal para ambos personajes");
            System.out.println(" ");
        }

    }
    // fin metodo batalla

}
