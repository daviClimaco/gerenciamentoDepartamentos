package daviClimaco.gerenciamentoDepartamentos.services;

import daviClimaco.gerenciamentoDepartamentos.entity.Departamento;
import daviClimaco.gerenciamentoDepartamentos.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServices {

    private DepartamentoRepository departamentoRepository;

    public DepartamentoServices(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    public void salvar(Departamento departamento){
        departamentoRepository.save(departamento);
    }

    public void deletar(Long id){
        departamentoRepository.deleteById(id);
    }

    public Departamento buscarPorId(Long id){
        return departamentoRepository.findById(id).orElse(null);
    }

    public List<Departamento> buscarTodos(){
        return departamentoRepository.findAll();
    }
}