package examenFerreteriaJEE.examenFerreteria.vista;

public class Principal {
	public static void main(String args[]) {
		serviciosRest sR = new serviciosRest();
		//System.out.println("prueba principal" +" "+ sR.obtenerCliente("1303292583"));
		System.out.println("\n");
		System.out.println("prueba lista T" +" "+ sR.getListado());
		//System.out.println("prueba lista Cuentas" +" "+ sR.obtenerCuenta("404000000001"));
		
	}
}
