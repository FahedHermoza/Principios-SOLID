package SOLID.lsp

class AustralianOpenCourt : Court(), HardCourt {
    override fun cleanCourt() {
        println("Limpeando pista Dura")
    }

}