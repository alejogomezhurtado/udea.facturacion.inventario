package udea.facturacion.inventario.infraestructura;

import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import udea.facturacion.inventario.controllers.Inventario;
import udea.facturacion.inventario.modelo.DtoInventario;

@Component
public class Consumidor implements MessageListener {

    @Override
    public void onMessage(Message message) {
        Gson gson = new Gson();
        DtoInventario inventario= gson.fromJson(new String(message.getBody()), DtoInventario.class);
        new Inventario().salida(inventario);
    }
}