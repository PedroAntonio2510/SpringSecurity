package io.github.cursodsousa.sbootexpsecurity.domain.repositories;

import io.github.cursodsousa.sbootexpsecurity.domain.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GrupoRepository extends JpaRepository<Grupo, UUID> {
    Optional<Grupo> findByNome(String nome);
}
