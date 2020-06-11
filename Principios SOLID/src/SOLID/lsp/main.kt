package SOLID.lsp


fun main(args: Array<String>) {
    testCourt()
    }

    fun testCourt(){
        val courts  = mutableListOf<GrassCourt>()
        courts.add(WimbledonCourt())
        courts.add(MallorcaOpenCourt())

        for (element in courts){
            element.cutGrass()
        }
    }
