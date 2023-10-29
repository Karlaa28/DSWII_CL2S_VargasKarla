package pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.exception.ResourceNotFoundException;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.model.bd.Producto;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.service.ProductoService;


import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoController {

    private ProductoService productoService;

    @GetMapping("")
    public ResponseEntity<List<Producto>> listarProductos(){
        List<Producto> productoList = new ArrayList<>();
        productoService.listarProductos()
                .forEach(productoList::add);
        if(productoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productoList, HttpStatus.OK);
    }



}
