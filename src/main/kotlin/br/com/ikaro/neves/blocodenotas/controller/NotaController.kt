package br.com.ikaro.neves.blocodenotas.controller

import br.com.ikaro.neves.blocodenotas.model.Nota
import br.com.ikaro.neves.blocodenotas.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("nota")


class NotaController {


    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkHealth():String {
        return "Palmeiras Não tem Mundial"
    }


    @GetMapping
    fun buscarTodos() : List<Nota> {
            return notaService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody nota: Nota) : Nota {
        return notaService.salvar(nota)
    }

    @DeleteMapping("/{id}")
    fun apagar(@PathVariable ("id") id: String) {
        notaService.apagar(id)
    }

    @GetMapping( "/titulo/{titulo}")
    fun buscaPorTitulo(@PathVariable ("titulo") titulo : String): Nota {
        return notaService.buscaPorTitulo(titulo)
    }

    @GetMapping("/{id}")
    fun buscaPorId(@PathVariable("id") id : String) : Nota {
        return notaService.buscaPorId(id)
    }

}