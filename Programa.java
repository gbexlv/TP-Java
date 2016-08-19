import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args)
	{	
		Integer opcion;
		Integer subOpcion;
		Boolean exit = false;
		Scanner data = new Scanner(System.in);
		ArrayList < Vehiculo > lista = new ArrayList < Vehiculo >();
		
		do {
			showMenu();
			opcion = getOpcion(data);
			
			switch (opcion)
			{
				case 1:
					do {
						showMenuCrearVehiculo();
						subOpcion = getOpcion(data);
						
						switch (subOpcion)
						{
							case 1:
								lista.add(crearCoche(data));
								break;
								
							case 0:
								exit = true;
								break;
						}
						
					} while (!exit);
					exit = false;
					break;
					
				case 0:
					exit = true;
					break;
			}
		} while(!exit);
	}
	
	public static Integer getOpcion(Scanner data)
	{
		System.out.print("Ingrese la opción: ");
		return data.nextInt();
	}
	
	public static void showMenu()
	{
		System.out.println("1. Registrar un vehículo");
		System.out.println("2. Mostrar vehículos disponibles");
		System.out.println("3. Dar de baja vehículo");
		System.out.println("4. Calcular precio de alquiler");
		System.out.println("5. Mostrar ofertas");
		System.out.println("6. Buscar por cantidad de pasajeros");
		System.out.println("7. Buscar por peso de carga");
		System.out.println("0. Salir");
	}
	
	public static void showMenuCrearVehiculo()
	{
		System.out.println("1. Registrar un coche");
		System.out.println("2. Registrar una combi");
		System.out.println("3. Registrar una furgoneta de carga");
		System.out.println("4. Registrar un camión");
		System.out.println("0. Volver");
	}
	
	public static Coche crearCoche(Scanner data)
	{
		Coche coche = new Coche();
		
		System.out.print("Ingrese la patente del coche: ");
		coche.setPatente(data.nextLine());
		
		System.out.print("Ingrese la cantidad de pasajeros: ");
		coche.setPasajeros(data.nextInt());
		
		return coche;
	}
}
