package br.com.ikaro.neves.blocodenotas.model

import org.springframework.data.annotation.Id

data class Nota (
        @Id var id: String?,
        var titulo : String,
        var descricao : String

)