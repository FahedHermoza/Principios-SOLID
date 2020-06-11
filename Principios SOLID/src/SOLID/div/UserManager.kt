package SOLID.div

class UserManager {
    fun showUser(){
        //var userRepository = LocalUserRepository()
        var userRepository: UserRespository = UserFactory.create()
        var user = userRepository.getUser(1)

        println(user.email + ":" + user.name)
    }
}