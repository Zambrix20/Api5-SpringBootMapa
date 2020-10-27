package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Estado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
  @Query(
    value = "select NEW com.grokonez.jwtauthentication.model.Estado(c.idestado, c.estado) from Estado c"
  )
  List<Estado> findEstado();
}
