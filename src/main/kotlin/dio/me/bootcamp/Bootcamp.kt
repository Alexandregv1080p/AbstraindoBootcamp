package dio.me.bootcamp

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(name:String, idade:Int)

data class ConteudoEducacional (var nome: String, val duracao: Int = 60, var nivel: Nivel){
    fun calcularNivel(): Nivel {
        return this.nivel
    }
}

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>){

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario){
        inscritos.add(usuario)
    }
}
fun main(){
    println("Cadastro de usuarios em conteudos educacionais ")
    var conteudo = ConteudoEducacional("Formacao Back End",60, Nivel.BASICO)
    var formacao = Formacao("Desenvolvimento Back End", )
}