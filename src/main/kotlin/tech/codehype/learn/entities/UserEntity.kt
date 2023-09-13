package tech.codehype.learn.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users")
data class UserEntity (


    @Column
    var username: String,

    @Column
    var password: String,

    @Id
    var id: UUID,
    ) {
    companion object {
        fun create(username: String,password: String): UserEntity {
            return UserEntity( username,password, UUID.randomUUID())
        }
    }
}

