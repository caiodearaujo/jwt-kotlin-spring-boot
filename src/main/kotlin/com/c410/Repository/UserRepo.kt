package com.c410.Repository

import com.c410.Model.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource
interface UserRepo : MongoRepository<User, ObjectId> {
    fun findByUsername(username: String): User?
}
