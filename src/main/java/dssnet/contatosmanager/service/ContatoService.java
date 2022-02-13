package dssnet.contatosmanager.service;

import dssnet.contatosmanager.exception.UserNotFoundException;
import dssnet.contatosmanager.model.Contato;
import dssnet.contatosmanager.repo.ContatoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ContatoService {
    private final ContatoRepo contatoRepo;

    @Autowired
    public ContatoService(ContatoRepo contatoRepo) {
        this.contatoRepo = contatoRepo;
    }

    public Contato addContato(Contato contato) {
        contato.setCodContato((UUID.randomUUID().toString()));
        return contatoRepo.save(contato);
    }

    public List<Contato> findAllContatos() {
        return contatoRepo.findAll();
    }

    public Contato updateContato(Contato contato) {
        return contatoRepo.save(contato);
    }

    public Contato findContatoById(Long id) {
        return contatoRepo.findContatoById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuário por id " + id + " não foi encontrado"));
    }

    public void deleteContato(Long id) {
        contatoRepo.deleteContatoById(id);
    }
}
