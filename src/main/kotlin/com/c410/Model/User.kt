package com.c410.Model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class User @PersistenceConstructor constructor(@Indexed(unique = true) val username: String,
                                                    @JsonIgnore val password: String,
                                                    val roles: MutableList<String> = mutableListOf("GUEST"),
                                                    val toddynho: MutableList<String>,
                                                    @Id val id: ObjectId? = null)