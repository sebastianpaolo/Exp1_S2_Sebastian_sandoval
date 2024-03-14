package movie.pelicula;

import org.springframework.web.bind.annotation.*;

import movie.pelicula.Pelicula;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1, "Star wars La amenaza fantasma", 1999, "George lucas", "ciencia ficcion",
                "Ambientada treinta años antes que La guerra de las galaxias (1977), muestra la infancia de Darth Vader, el pasado de Obi-Wan Kenobi y el resurgimiento de los Sith, los caballeros Jedi dominados por el Lado Oscuro. La Federación de Comercio ha bloqueado el pequeño planeta de Naboo, gobernado por la joven Reina Amidala; se trata de un plan ideado por Sith Darth Sidious, que, manteniéndose en el anonimato, dirige a los neimoidianos, que están al mando de la Federación. El Jedi Qui-Gon Jinn y su aprendiz Obi-Wan Kenobi convencen a Amidala para que vaya a Coruscant, la capital de la República y sede del Consejo Jedi, y trate de neutralizar esta amenaza. Pero, al intentar esquivar el bloqueo, la nave real resulta averiada, viéndose así obligada la tripulación a aterrizar en el desértico y remoto planeta de Tatooine"));
        peliculas.add(new Pelicula(2, "Star wars El ataque de los clones", 2002, "George lucas", "ciencia ficcion",
                " la República continúa envuelta en luchas y sumida en el caos. Un movimiento separatista formado por centenares de planetas y poderosas alianzas empresariales supone nuevas amenazas para la galaxia a las que ni siquiera los Jedi pueden poner freno. Estas maniobras, planeadas hace mucho por una poderosa fuerza aún desconocida, conducen al estallido de las Guerras de los Clones... y al principio del fin de la República. Para contrarrestar la amenaza que se avecina, el Canciller Supremo, Palpatine, que sigue consolidando su poder, autoriza la creación de un Gran Ejército de la República para ayudar a los abrumados Jedis."));
        peliculas.add(new Pelicula(3, "Star wars La venganza de los sith", 2005, "George lucas", "ciencia ficcion",
                " Existe una clara hostilidad entre el Canciller Palpatine y el Consejo Jedi. Anakin Skywalker, joven Caballero Jedi entre la espada y la pared, duda sobre qué camino seguir. Seducido por la promesa de un poder sin parangón, tentado por el lado oscuro de la Fuerza, jura lealtad al maléfico Darth Sidious y se convierte en Darth Vader."));
        peliculas.add(new Pelicula(4, "matrix ", 1999, "Wachowskis", "ciencia ficcion",
                "Neo (Keanu Reeves) es un joven pirata informático que lleva una doble vida: durante el día ejerce en una empresa de servicios informáticos, mientras que por la noche se dedica a piratear bases de datos y saltarse sistemas de alta seguridad. Su vida cambiará cuando una noche conozca a Trinity (Carrie-Anne Moss), una misteriosa joven que parece ser una leyenda en el mundo de los 'hackers' informáticos. Será ella quien lleve a Neo ante su líder: Morfeo (Laurence Fishburne). Así descubrirá una terrible realidad y el joven deberá decidir si unirse a la resistencia o vivir su vida como hasta ahora. ¿Elegirá Neo la pastilla azul o la roja?"));
        peliculas.add(new Pelicula(5, "matrix revolucion", 2003, "Wachowskis", "ciencia ficcion",
                "n la conclusión de Matrix Reloaded, Neo (Keanu Reeves) daba otro paso hacia adelante en la búsqueda de la verdad que había empezado con su viaje al mundo real al comienzo de Matrix, pero esa transformación ha agotado su poder, dejándole a la deriva en una tierra de nadie entre Matrix y el Mundo de las Máquinas. Mientras Trinity (Carrie-Anne Moss) vela el cuerpo comatoso de Neo, Morfeo (Laurence Fishburne) se enfrenta a la revelación de que el Elegido, en el que ha invertido toda una vida de fe, no es más que otro sistema de control inventado por los arquitectos de Matrix"));
        peliculas.add(new Pelicula(6, "matrix resurrecion", 2021, "Wachowskis", "ciencia ficcion",
                "regresamos a un mundo de dos realidades: uno, la vida cotidiana; el otro, lo que hay detrás. Para saber si su realidad es una construcción física o mental, para conocerse de verdad a sí mismo, el Sr. Anderson tendrá que optar por volver a seguir al conejo blanco."));

    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            } else {
                System.out.println("no existe tal id");
            }

        }

        return null;
    }

}
