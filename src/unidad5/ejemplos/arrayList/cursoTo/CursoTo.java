package unidad5.ejemplos.arrayList.cursoTo;

import java.util.ArrayList;

public class CursoTo {
	

		 String titulo;
		 ArrayList<String> alumnos;
		 ArrayList<String> profesores;

		 public CursoTo() {
		 alumnos = new ArrayList<String>();
		 profesores = new ArrayList<String>();
		 }

		 public ArrayList<String> getsAlumnos() {
		 return alumnos;
		 }
		 public void addActor(String alumno) {
		 alumnos.add(alumno);
		 }
		}