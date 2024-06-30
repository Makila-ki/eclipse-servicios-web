package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.AdminEntity;
import com.example.demo.Entity.Cliente;
import com.example.demo.Entity.ClienteEntity;
import com.example.demo.Entity.Compra;
import com.example.demo.Entity.CompraEntity;
import com.example.demo.Entity.Productos;
import com.example.demo.Entity.ProductosEntity;
import com.example.demo.Entity.Tarjeta;
import com.example.demo.Entity.TrajetaEntity;
import com.example.demo.Services.Servicelmpl;

@RestController
@RequestMapping("/apii")
@CrossOrigin("*")

public class ServiciosRestController {

	@Autowired
	private Servicelmpl servicelmpl;
	
	//Administrador-------------------------
	
	@GetMapping("/Muestra_ad")
	public List<AdminEntity> muestra_ad(){
		return servicelmpl.MuestraAdministradores();
	}
	
	@GetMapping("/Muestras_ad/{id}")
	public Optional<AdminEntity> muestra_id_ad(@PathVariable long id){
		return servicelmpl.MuestraAdmin(id);
	}
	
	@PostMapping("/Guardar_ad")
	public ResponseEntity<?> guardar_ad(@RequestBody Admin admin){
		return servicelmpl.GuardarAdmin(admin);
	}
	
	@PostMapping("/Eliminar_ad/{id}")
    public ResponseEntity<?> eliminarAdmin(@PathVariable long id) {
        return servicelmpl.eliminarAdmin(id);
    }
	//Cliente-------------------------------
	
		@GetMapping("/Muestra_cl")
		public List<ClienteEntity> muestra_cl(){
			return servicelmpl.MuestraClientes();
		}
		
		@GetMapping("/Muestras_cl/{id}")
		public Optional<ClienteEntity> muestra_id_cl(@PathVariable long id){
			return servicelmpl.MuestraClie(id);
		}
		
		@PostMapping("/Guardar_cl")
		public ResponseEntity<?> guardar_cl(@RequestBody Cliente clientes){
			return servicelmpl.GuardarClien(clientes);
		}
		@PostMapping("/Eliminar_cl/{id}")
	    public ResponseEntity<?> eliminarcli(@PathVariable long id) {
	        return servicelmpl.eliminarCliente(id);
	    }
	//Producto------------------------------
		
		@GetMapping("/Muestra_pr")
		public List<ProductosEntity> muestra_pr(){
			return servicelmpl.MuestraProductos();
		}
		
		@GetMapping("/Muestras_pr/{id}")
		public Optional<ProductosEntity> muestra_id_pr(@PathVariable long id){
			return servicelmpl.MuestraProd(id);
		}
		
		@PostMapping("/Guardar_pr")
		public ResponseEntity<?> guardar_pr(@RequestBody Productos productos){
			return servicelmpl.GuardarProd(productos);
		}
		@PostMapping("/Eliminar_pr/{id}")
	    public ResponseEntity<?> eliminarprodu(@PathVariable long id) {
	        return servicelmpl.eliminarProducto(id);
	    }
		//Compras---------------------------------
		
		@GetMapping("/Muestra_co")
		public List<CompraEntity> muestra_co(){
			return servicelmpl.MuestraCompra();
		}
		
		@GetMapping("/Muestras_co/{id}")
		public Optional<CompraEntity> muestra_id_co(@PathVariable long id){
			return servicelmpl.MuestraComp(id);
		}
		
		@PostMapping("/Guardar_co")
		public ResponseEntity<?> guardar_co(@RequestBody Compra compra){
			return servicelmpl.GuardarCom(compra);
		}
		
		@PostMapping("/Eliminar_co/{id}")
	    public ResponseEntity<?> eliminarcom(@PathVariable long id) {
	        return servicelmpl.eliminarCompra(id);
	    }
		
		
		//tarjeta----------------------------------------
		@GetMapping("/Muestra_ta")
		public List<TrajetaEntity> muestra_ta(){
			return servicelmpl.MuestraTarjeta();
		}
		
		@GetMapping("/Muestras_ta/{id}")
		public Optional<TrajetaEntity> muestra_id_ta(@PathVariable long id){
			return servicelmpl.MuestraTarj(id);
		}
		
		@PostMapping("/Guardar_ta")
		public ResponseEntity<?> guardar_ta(@RequestBody Tarjeta tarjeta){
			return servicelmpl.GuardarTar(tarjeta);
		}
		
}
