package io.github.cursodsousa.sbootexpsecurity.domain.repositories;

import io.github.cursodsousa.sbootexpsecurity.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
