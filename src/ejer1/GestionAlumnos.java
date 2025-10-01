package ejer1;


import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



/**
 *Gestion de alumnos: lectura/escritura
 * @author Diego
 * @version 1.0.0
 */

public class GestionAlumnos {
	static Scanner sc=new Scanner (System.in);
	static List<Alumno>alumnos=new ArrayList<Alumno>();
	static Alumno a=new Alumno();


	// metodo principal que se va a ejecutar en el Main 
	public static void ejecutar(){
		guardarCampoACampo();
		leer5Alumnos();

	}

	private static void ler1Alumno() {
		System.out.println(" escribe el nia de el alumno ");
		int nia=sc.nextInt();
		a.setNia(nia);
		System.out.println(" escribe el nombre de el alumno ");
		String nombre =sc.nextLine();;
		sc.nextLine();
		a.setNombre(nombre);
		System.out.println(" escribe el Apellidos de el alumno ");
		String apellidos =sc.nextLine();
		sc.nextLine();
		a.setApellidos(apellidos);
		System.out.println(" escribe el genero de el alumno ");
		char genero =sc.nextLine().charAt(0);
		sc.nextLine();
		a.setGenero(genero);
		System.out.println(" escribe la fecha de nacimiento de el alumno ");
		String fechaString=sc.nextLine();
		sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fecha = sdf.parse(fechaString);  // guarda el resultado
			a.setFechaNacimiento(fecha);          // pasa el Date al setter
		} catch (ParseException e) {
			System.out.println("Fecha no válida. Usa formato dd/MM/yyyy.");
		}
		System.out.println(" escribe el ciclo de el alumno ");
		String ciclo =sc.nextLine();
		sc.nextLine();
		a.setCiclo(ciclo);
		System.out.println(" escribe el curso de el alumno ");
		String curso =sc.nextLine();
		sc.nextLine();
		a.setCurso(curso);
		System.out.println(" escribe el grupo de el alumno ");
		String grupo =sc.nextLine();
		a.setGrupo(grupo);

		alumnos.add(a);
	}

	private static void leer5Alumnos() {
		for (int i = 0; i < 1; i++) {
			ler1Alumno();
			System.out.println(alumnos);
		}
		System.out.println("alumnos leido con exito");
	}

	private static void guardarCampoACampo() {
		String rutaCompleta = ruta();

		try (FileOutputStream fo=new FileOutputStream(rutaCompleta);
				DataOutputStream dops=new DataOutputStream(fo)){

			escribirCampoACampo(dops);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void escribirCampoACampo(DataOutputStream dops)  {
		for (int i = 0; i < alumnos.size(); i++) {
			try {
				dops.writeInt(alumnos.get(i).getNia());
				dops.writeUTF(alumnos.get(i).getNombre());
				dops.writeUTF(alumnos.get(i).getApellidos());
				dops.writeChar(alumnos.get(i).getGenero());
				 long fechaMs = alumnos.get(i).getFechaNacimiento().getTime();
				   dops.writeLong(fechaMs);
				dops.writeUTF(alumnos.get(i).getCiclo());
				dops.writeUTF(alumnos.get(i).getCurso());
				dops.writeUTF(alumnos.get(i).getGrupo());
			} catch (IOException e) {
			e.printStackTrace();
			}
			
		}
	}

	/**
	 * Pide por consola la ruta y el nombre de archivo y construye
	 * una ruta completa con extensión ".dat".
	 * @return ruta del fichero de datos (absoluta o relativa)
	 */
	private static String ruta() {
		System.out.println("dime la ruta del fichero");
		String ruta=sc.nextLine();

		System.out.println("dime el nombre del fichero ");
		String fichero=sc.nextLine();
		String rutaCompleta= ruta+"/"+fichero+".dat";
		return rutaCompleta;
	}

}