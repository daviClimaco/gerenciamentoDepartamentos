package daviClimaco.gerenciamentoDepartamentos.controller;

import daviClimaco.gerenciamentoDepartamentos.entity.Departamento;
import daviClimaco.gerenciamentoDepartamentos.services.DepartamentoServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departamentos")
public class DepartamentoController {

    private DepartamentoServices departamentoServices;

    public DepartamentoController(DepartamentoServices departamentoServices) {
        this.departamentoServices = departamentoServices;
    }

    @PostMapping
    public void salvar(@RequestBody Departamento departamento){
        departamentoServices.salvar(departamento);
    }

    @GetMapping
    public List<Departamento> buscarTodos(){
        return departamentoServices.buscarTodos();
    }

    @GetMapping("{id}")
    public Departamento buscarPorId(@PathVariable Long id){
        return departamentoServices.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        departamentoServices.deletar(id);
    }
}