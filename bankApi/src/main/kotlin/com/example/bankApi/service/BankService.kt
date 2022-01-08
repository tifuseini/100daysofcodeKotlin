package com.example.bankApi.service

import com.example.bankApi.datasource.BankDataSource
import com.example.bankApi.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource){

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String):Bank = dataSource.retrieveBank(accountNumber)

}