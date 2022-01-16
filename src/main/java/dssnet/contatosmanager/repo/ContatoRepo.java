package dssnet.contatosmanager.repo;

import dssnet.contatosmanager.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContatoRepo extends JpaRepository<Contato, Long> {
    void deleteContatoById(Long id);

    Optional<Contato> findContatoById(Long id);
}
