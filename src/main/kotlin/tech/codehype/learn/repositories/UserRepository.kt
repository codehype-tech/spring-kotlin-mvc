package tech.codehype.learn.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.codehype.learn.entities.UserEntity
import java.util.*

@Repository
interface UserRepository: JpaRepository<UserEntity, UUID> {

}