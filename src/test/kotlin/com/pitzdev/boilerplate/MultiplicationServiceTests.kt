package com.pitzdev.boilerplate

import com.pitzdev.boilerplate.dtos.multiplicationResultAttempt.SaveAttemptDTO
import com.pitzdev.boilerplate.models.multiplication.Multiplication
import com.pitzdev.boilerplate.models.multiplicationResultAttempt.MultiplicationResultAttempt
import com.pitzdev.boilerplate.models.user.User
import com.pitzdev.boilerplate.services.multiplication.MultiplicationService

import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MultiplicationServiceTests {

	@Test
	fun whenValidRandomNumber_returnValue() {
        val factorA = 15
        val factorB = 20
        val mockMultiplicationService = Mockito.mock(MultiplicationService::class.java)

        Mockito.`when`(mockMultiplicationService.createMultiplication()).thenReturn(Multiplication(factorA, factorB))
        val multiplication : Multiplication = mockMultiplicationService.createMultiplication()

        assert(multiplication.factorA == factorA)
        assert(multiplication.factorB == factorB)
        assert(multiplication.result == factorA * factorB)
    }
}
