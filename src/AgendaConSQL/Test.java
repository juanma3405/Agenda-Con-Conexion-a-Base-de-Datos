package AgendaConSQL;

import java.util.Scanner;

public class Test {
	
	public static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda miAgenda = new Agenda();
		ControladorAgenda miControlador = new ControladorAgenda();
		String respuesta;
		do {
		System.out.println("Para agregar un contacto escriba 'agregar', para buscar un contacto escriba 'buscar', para eliminar escriba 'eliminar' o para finalizar 'fin'");
		respuesta=input.nextLine();
			if (respuesta.equalsIgnoreCase("agregar")) {
				miAgenda.agregarPersona(miControlador);
			}
			if (respuesta.equalsIgnoreCase("buscar")) {
				String nombre;
				System.out.println("Escriba el nombre de la persona a buscar'");
				nombre=input.nextLine();
				miAgenda.buscarPersonaPorNombre(nombre, miControlador);
			}
			if (respuesta.equalsIgnoreCase("eliminar")) {
				String nombre;
				System.out.println("Escriba el nombre de la persona a eliminar'");
				nombre=input.nextLine();
				miAgenda.eliminarPersona(nombre, miControlador);
				miAgenda.imprimeListaContactos(miControlador);
			}
		}
		while (!respuesta.equalsIgnoreCase("fin"));
	}

}
