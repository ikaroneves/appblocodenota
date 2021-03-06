package br.com.ikaro.neves.blocodenotas.service

import br.com.ikaro.neves.blocodenotas.model.Nota
import br.com.ikaro.neves.blocodenotas.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota): Nota {
        return notaRepository.save(nota)
    }

    fun buscarTodos() : List<Nota> {
        return notaRepository.findAll()
    }

    fun apagar(id: String) {
        notaRepository.deleteById(id)
    }

    fun buscaPorId(id: String): Nota {
        return notaRepository.findById(id).get()
    }

    fun buscaPorTitulo (titulo: String): Nota {
        return notaRepository.findByTitulo(titulo)
    }
}