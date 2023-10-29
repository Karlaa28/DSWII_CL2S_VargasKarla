package pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.model.bd.Producto;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductoService {

    private ProductoRepository productoRepository;

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }
    public Optional<Producto> obtenerProductoPorId(Integer id){
        Optional<Producto> producto = productoRepository.findById(id);
        if(producto.isEmpty()){
            return Optional.empty();
        }else
            return producto;
    }


}
