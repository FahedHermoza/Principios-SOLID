package SOLID.div

class UserFactory {
    companion object{
        fun create(): UserRespository{
            return LocalUserRepository()
        }
    }
}