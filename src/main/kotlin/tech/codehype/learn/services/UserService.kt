package tech.codehype.learn.services

import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Service
import tech.codehype.learn.dto.user.CreateUserDto
import tech.codehype.learn.entities.UserEntity
import tech.codehype.learn.repositories.UserRepository
import java.util.*


@Service
class UserService(val repository: UserRepository) {
    fun getAllUser(): MutableList<UserEntity> = repository.findAll()
    fun getUserById(id: UUID) = repository.findById(id)
    fun addCustomer(body: CreateUserDto) = repository.save(UserEntity.create(body.username, body.password))
    fun edit(id: UUID, body: UserEntity): UserEntity {
        val user = repository.findById(id).orElseThrow { throw EntityNotFoundException("id") }
        user.apply {
            username = body.username
            password = body.password
        }
        return repository.save(user)
    }
    fun delete(id: UUID) = repository.deleteById(id)
}