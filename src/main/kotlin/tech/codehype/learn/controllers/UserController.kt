package tech.codehype.learn.controllers

import org.springframework.web.bind.annotation.*
import tech.codehype.learn.MyProperties
import tech.codehype.learn.dto.user.CreateUserDto
import tech.codehype.learn.entities.UserEntity
import tech.codehype.learn.services.UserService
import java.util.*

@RestController
class UserController(val myApp: MyProperties, val userService: UserService) {


    @GetMapping("/config")
    fun config() = myApp.body + "test"

    @GetMapping("/user")
    fun getAllUser() = userService.getAllUser()

    @GetMapping("/user/{id}")
    fun getUserById(@PathVariable id: UUID) = userService.getUserById(id)

    @PostMapping("/user")
    fun addUser(@RequestBody body: CreateUserDto) = userService.addCustomer(body)

    @PostMapping("/user/{id}")
    fun editUser(@PathVariable id: UUID, @RequestBody body: UserEntity) = userService.edit(id, body)

    @DeleteMapping("/user/{id}")
    fun delete(@PathVariable id: UUID) = userService.delete(id)
}