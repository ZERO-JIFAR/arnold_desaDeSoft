package com.facu.tpPersist;

import com.facu.tpPersist.entidades.*;
import com.facu.tpPersist.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
public class TpPersistApplication {
	@Autowired
	ClienteRepositorio clienteRepositorio;
	@Autowired
	DetallePedidoRepositorio detallePedidoRepositorio;
	@Autowired
	DomicilioRepositorio domicilioRepositorio;
	@Autowired
	FacturaRepositorio facturaRepositorio;
	@Autowired
	PedidoRepositorio pedidoRepositorio;
	@Autowired
	ProductoRepositorio productoRepositorio;
	@Autowired
	RubroRepositorio rubroRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(TpPersistApplication.class, args);
	}


	@Bean
	CommandLineRunner init(ClienteRepositorio clienteRepositorio) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			Cliente cliente1 = new Cliente();
			cliente1.setNombre("Juan");
			cliente1.setApellido("Pérez");
			cliente1.setTelefono(231434530);
			cliente1.setEmail("haaaa@gmail.com");

			Domicilio domicilio1 = new Domicilio();
			domicilio1.setCalle("Peru");
			domicilio1.setLocalidad("Bs As");
			domicilio1.setNumero(988);
			domicilio1.setCliente(cliente1);

			Pedido pedido1 = new Pedido();
			pedido1.setEstado("en camino");
			pedido1.setTipoEnvio("Delivery");
			pedido1.setCliente(cliente1);

			Factura factura1 = new Factura();
			factura1.setNumero(76);
			factura1.setFecha(new Date(9-5-1999));
			factura1.setDescuento(10);
			factura1.setFormaPago("Tarjeta");
			factura1.setTotal(2000);

			Producto producto1 = new Producto();
			producto1.setDenoinacion("Pancho");
			producto1.setReceta("Pan y salchicha");
			producto1.setTipo("Manual");
			producto1.setTiempoEstimadoCocina(50);
			producto1.setPrecioVenta(3000);
			producto1.setStockActual(10);
			producto1.setStockMinimo(5);
			producto1.setUnidadMedida("Unidad");

			DetallePedido detallePedido1 = new DetallePedido();
			detallePedido1.setCantidad(12);
			detallePedido1.setSubtotal(300);

			Rubro rubro1 = new Rubro();
			rubro1.setDenoinacion("Carne");

			rubro1.addProducto(producto1);
			producto1.setRubro(rubro1);
			cliente1.addDomicilio(domicilio1);
			cliente1.addPedido(pedido1);
			pedido1.setFactura(factura1);
			pedido1.addDetallePedido(detallePedido1);
			detallePedido1.setPedido(pedido1);
			detallePedido1.setProducto(producto1);


			rubroRepositorio.save(rubro1);
			productoRepositorio.save(producto1);
			clienteRepositorio.save(cliente1);
			facturaRepositorio.save(factura1);
			detallePedidoRepositorio.save(detallePedido1);
			domicilioRepositorio.save(domicilio1);
			pedidoRepositorio.save(pedido1);

		};

	}


}
