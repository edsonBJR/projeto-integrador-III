package com.projetointegrador.wichstream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.wichstream.model.Usuario;
import com.projetointegrador.wichstream.model.UsuarioRedeSocial;

@Repository
public interface UsuarioRedeSocialRepository extends JpaRepository<UsuarioRedeSocial, Integer>{
	
	Usuario findByIdUsuarioRs(String idUsuarioRs);

}
