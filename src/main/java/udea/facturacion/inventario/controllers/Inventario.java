package udea.facturacion.inventario.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import udea.facturacion.inventario.modelo.DtoInventario;

public class Inventario {
	private static final Logger logger = LogManager.getLogger(Inventario.class);

	public void salida(DtoInventario inventario){
		logger.info("Sale de inventario \n{"+inventario.toString()+"}");
	}
}
