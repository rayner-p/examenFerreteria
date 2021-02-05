package examenFerreteriaJEE.examenFerreteria.vista;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import examenFerreteriaJEE.examenFerreteria.modelo.Producto;

public class serviciosRest {
	//primer proveedor
	private String WS_GET_listar1=  "http://localhost:8080/examenProveedor1/ws/transacciones/listaProductos1";
	private String WS_POST_solicitar1  = "http://localhost:8080/examenProveedor1/ws/transacciones/solicitarProducto";
	private String WS_GET_listadoCompleto1 = "http://localhost:8080/examenProveedor1/ws/transacciones/listadoCompleto1";
	//segundo proveedor
	private String WS_GET_listar = "http://localhost:8080/examenProveedor2/ws/transacciones/listaProductos";
	private String WS_POST_solicitar2 = "http://localhost:8080/examenProveedor2/ws/transacciones/solicitarProducto";
	private String WS_GET_listadoCompleto = "http://localhost:8080/examenProveedor2/ws/transacciones/listadoCompleto";
	
	public String registrarSolicitud(int cantidad, int codigoProducto) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_POST_solicitar1 + "?cedula=" + cantidad+"&codigoProducto="+codigoProducto);
		Producto pro = target.request().get(Producto.class);
		System.out.println("CLIENTE RES SERVICIO " + " " + pro);

		client.close();
		return "ok";
	}

	public List<Producto> getListado() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_listar1);
		List<Producto> listaT = target.request().get(new GenericType<List<Producto>>() {
		});
		client.close();
		return listaT;
	}
	
	
	public List<Producto> getListadoCompleto(int codigo) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_listadoCompleto1+ "?codigoProveedor=" + codigo);
		List<Producto> listaT = target.request().get(new GenericType<List<Producto>>() {
		});
		client.close();
		return listaT;
	}
	
	//segundo proveedor
	public String registrarSolicitud2(int cantidad, int codigoProducto) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_POST_solicitar2 + "?cedula=" + cantidad+"&codigoProducto="+codigoProducto);
		Producto pro = target.request().get(Producto.class);
		System.out.println("CLIENTE RES SERVICIO " + " " + pro);

		client.close();
		return "ok";
	}

	public List<Producto> getListado2() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_listar);
		List<Producto> listaT = target.request().get(new GenericType<List<Producto>>() {
		});
		client.close();
		return listaT;
	}
	
	
	public List<Producto> getListadoCompleto2(int codigo) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_listadoCompleto+ "?codigoProveedor=" + codigo);
		List<Producto> listaT = target.request().get(new GenericType<List<Producto>>() {
		});
		client.close();
		return listaT;
	}
	
	
}
