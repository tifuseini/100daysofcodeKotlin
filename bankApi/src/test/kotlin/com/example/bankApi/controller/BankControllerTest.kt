package com.example.bankApi.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest{

    @Autowired
    lateinit var mockMvc : MockMvc

    @Test
    fun `should return all banks`(){
        //given
        mockMvc.get("/api/banks")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$[0].accountNumber"){
                    value("11768")
                }
            }


        //when


    //then
    }

    @Test
    fun `should return the bank with the given account number`(){

        val accountNumber = 11768

        mockMvc.get("/api/banks/$accountNumber")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.trust"){value("1")}
                jsonPath("$.transactionFee"){value("1")}
            }
    }

}