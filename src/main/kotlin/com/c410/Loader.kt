package com.c410

import com.c410.Model.User
import com.c410.Repository.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Loader @Autowired
constructor(private val userRepo: UserRepo) : CommandLineRunner {
    override fun run(vararg args: String) {
        userRepo.deleteAll()
        val admin = User(username = "admin", password = "admin", roles = mutableListOf("ADMIN", "MOD"), toddynho = mutableListOf("Caixinha"))
        userRepo.save(admin)
        userRepo.save(User(username = "Lucas Miranda Sabadini", password = "123", toddynho =  mutableListOf("Caixinha", "Garrafinha")))
    }
}