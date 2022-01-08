package com.example.bankApi.datasource

import com.example.bankApi.model.Bank

interface BankDataSource {

    fun retrieveBanks():Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}