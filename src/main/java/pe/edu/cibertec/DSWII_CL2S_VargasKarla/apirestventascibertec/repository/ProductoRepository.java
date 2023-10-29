package pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.model.bd.Producto;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

        List<Producto> findByProducto(String producto);

        @Query("SELECT p FROM producto p WHERE p.cantidad > 10 AND p.cantidad < 100")
        List<Producto> findProductosEntre10y100();

        @Query(value = "SELECT * FROM producto WHERE YEAR(fechaVencimiento) = 2024", nativeQuery = true)
        List<Producto> findProductosConVencimiento2024();
}
