package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Municipio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
  @Query(
    value = "select NEW com.grokonez.jwtauthentication.model.Municipio(c.idestado, c.idmunicipio, c.municipio) from Municipio c where c.idestado=?1 order by c.idmunicipio"
  )
  List<Municipio> findMunicipiosByEstado(Long idestado);
}
