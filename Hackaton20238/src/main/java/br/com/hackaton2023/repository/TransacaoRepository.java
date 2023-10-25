package br.com.hackaton2023.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.hackaton2023.model.TransacaoPix;

public interface TransacaoRepository extends JpaRepository<TransacaoPix, Long>{

}
