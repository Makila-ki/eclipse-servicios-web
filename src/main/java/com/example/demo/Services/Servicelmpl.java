package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
import com.example.demo.Repository.AdministradorRepository;
import com.example.demo.Repository.ClientesRepository;
import com.example.demo.Repository.CompraRepository;
import com.example.demo.Repository.ProductosRepository;
import com.example.demo.Repository.TarjetaRepository;

import jakarta.transaction.Transactional;

@Service

public class Servicelmpl {
	
	@Autowired
	private AdministradorRepository iAdminRepo;
	@Autowired
	private ClientesRepository iClienteRepo; 
	@Autowired
	public ProductosRepository iProductoRepo;
	@Autowired
	public CompraRepository iCompraRepo;
	@Autowired
	private TarjetaRepository iTarjetaRepo;
	
	
	//Administrador-----------------------------------------------
	
	@Transactional
	public List<AdminEntity> MuestraAdministradores(){
		return iAdminRepo.findAll();
	}
	
	@Transactional
	public Optional<AdminEntity> MuestraAdmin(@PathVariable long id){
		return iAdminRepo.findById(id);
	}
	
	@Transactional
	public ResponseEntity<?> GuardarAdmin(Admin admin){
		AdminEntity nuevoadmi= new AdminEntity();
		nuevoadmi.setNom_ad(admin.getNom_ad());
		nuevoadmi.setUsu_ad(admin.getUsu_ad());
		nuevoadmi.setCon_ad(admin.getCon_ad());
		nuevoadmi.setId_ad(admin.getId_ad());
		iAdminRepo.saveAndFlush(nuevoadmi);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@Transactional
	public ResponseEntity<?> eliminarAdmin(long id) {
	    Optional<AdminEntity> adminOptional = iAdminRepo.findById(id);
	    if (adminOptional.isPresent()) {
	        iAdminRepo.deleteById(id);
	        return new ResponseEntity<>(id, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
	    }
	}
	
	//Clientes----------------------------
	
		@Transactional
		public List<ClienteEntity> MuestraClientes(){
			return iClienteRepo.findAll();
		}
		
		@Transactional
		public Optional<ClienteEntity> MuestraClie(@PathVariable long id){
			return iClienteRepo.findById(id);
		}
		
		@Transactional
		public ResponseEntity<?> GuardarClien(Cliente clientes){
			ClienteEntity nuevoclie = new ClienteEntity();
			nuevoclie.setNom_cli(clientes.getNom_cli());
			nuevoclie.setNum_cli(clientes.getNum_cli());
			nuevoclie.setUsu_cli(clientes.getUsu_cli());
			nuevoclie.setCon_cli(clientes.getCon_cli());
			nuevoclie.setDom_cli(clientes.getDom_cli());
			nuevoclie.setId_cli(clientes.getId_cli());
			iClienteRepo.saveAndFlush(nuevoclie);
			return new ResponseEntity<Cliente>(clientes,HttpStatus.OK);
			
		}
		@Transactional
		public ResponseEntity<?> eliminarCliente(long id){
			 Optional<ClienteEntity> clienteOptional = iClienteRepo.findById(id);
		    if (clienteOptional.isPresent()) {
		    	iClienteRepo.deleteById(id);
		        return new ResponseEntity<>(id, HttpStatus.OK);
		    } else {
		        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
		    }
		}
		
		//Productos----------------------------
		
		@Transactional
		public List<ProductosEntity> MuestraProductos(){
			return iProductoRepo.findAll();
		}
		
		@Transactional
		public Optional<ProductosEntity> MuestraProd(@PathVariable long id){
			return iProductoRepo.findById(id);
		}
		
		@Transactional
		public ResponseEntity<?> GuardarProd(Productos productos){
			ProductosEntity nuevoprod = new ProductosEntity();
			nuevoprod.setNom_pro(productos.getNom_pro());
			nuevoprod.setCan_pro(productos.getCan_pro());
			nuevoprod.setPre_pro(productos.getPre_pro());
			nuevoprod.setTip_pro(productos.getTip_pro());
			nuevoprod.setMar_pro(productos.getMar_pro());
			
			nuevoprod.setId_pro(productos.getId_pro());
			iProductoRepo.saveAndFlush(nuevoprod);
			return new ResponseEntity<Productos>(productos,HttpStatus.OK);
		}
		@Transactional
		public ResponseEntity<?> eliminarProducto(long id){
			 Optional<ProductosEntity> productoOptional = iProductoRepo.findById(id);
		    if (productoOptional.isPresent()) {
		    	iProductoRepo.deleteById(id);
		        return new ResponseEntity<>(id, HttpStatus.OK);
		    } else {
		        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
		    }
		}
		
		//Ventas---------------------------------
		
		@Transactional
		public List<CompraEntity> MuestraCompra(){
			return iCompraRepo.findAll();
		}
		
		@Transactional
		public Optional<CompraEntity> MuestraComp(@PathVariable long id){
			return iCompraRepo.findById(id);
		}
		@Transactional
		public ResponseEntity<?> GuardarCom(Compra compra){
			CompraEntity nuevacom= new CompraEntity();
			nuevacom.setId_proo(compra.getId_proo());
			nuevacom.setCan_com(compra.getCan_com());
			nuevacom.setPre_com(compra.getPre_com());
			nuevacom.setFec_com(compra.getFec_com());
			nuevacom.setId_com(compra.getId_com());
			nuevacom.setId_clii(compra.getId_clii());
			
			iCompraRepo.saveAndFlush(nuevacom);
			return new ResponseEntity<Compra>(compra,HttpStatus.OK);
		}
		@Transactional
		public ResponseEntity<?> eliminarCompra(long id){
			 Optional<CompraEntity> compraOptional = iCompraRepo.findById(id);
		    if (compraOptional.isPresent()) {
		    	iCompraRepo.deleteById(id);
		        return new ResponseEntity<>(id, HttpStatus.OK);
		    } else {
		        return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
		    }
		}

		
		//Tarjeta-----------------------------------------------------
		
		@Transactional
		public List<TrajetaEntity> MuestraTarjeta(){
			return iTarjetaRepo.findAll();
		}
		
		@Transactional
		public Optional<TrajetaEntity> MuestraTarj(@PathVariable long id){
			return iTarjetaRepo.findById(id);
		}
		
		@Transactional
		public ResponseEntity<?> GuardarTar(Tarjeta tarjeta){
			TrajetaEntity nuevatar= new TrajetaEntity();
			nuevatar.setId_clii(tarjeta.getId_clii());
			nuevatar.setBan_tar(tarjeta.getBan_tar());
			nuevatar.setNum_tar(tarjeta.getNum_tar());
			nuevatar.setFec_tar(tarjeta.getFec_tar());
			nuevatar.setCvv_tar(tarjeta.getCvv_tar());
			nuevatar.setTip_tar(tarjeta.getTip_tar());
			nuevatar.setId_tar(tarjeta.getId_tar());
			
			iTarjetaRepo.saveAndFlush(nuevatar);
			return new ResponseEntity<Tarjeta>(tarjeta,HttpStatus.OK);
		}
		
	

}
