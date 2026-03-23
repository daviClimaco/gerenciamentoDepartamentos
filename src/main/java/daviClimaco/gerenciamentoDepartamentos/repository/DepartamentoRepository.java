package daviClimaco.gerenciamentoDepartamentos.repository;

import daviClimaco.gerenciamentoDepartamentos.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}