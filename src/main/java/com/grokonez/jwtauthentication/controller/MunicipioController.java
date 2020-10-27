package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Municipio;
import com.grokonez.jwtauthentication.repository.MunicipioRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class MunicipioController {
  @Autowired
  private MunicipioRepository municipioRepository;

  @GetMapping("/municipios")
  public List<Municipio> getMunicipios(
    @RequestParam(value = "idestado") Long idestado
  ) {
    return municipioRepository.findMunicipiosByEstado(idestado);
  }
}
