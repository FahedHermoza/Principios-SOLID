package SOLID.div

class LocalUserRepository: UserRespository {
    override fun getUser(id: Int): User{
        //Logica para traer usuarios de la Base de Datos
        return User(1,"Fahed", "fahed@gmail.com")
    }
}