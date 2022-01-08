package com.example.bankApi.datasource.mock

import com.example.bankApi.datasource.BankDataSource
import com.example.bankApi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource{
    val banks = listOf(
        Bank("11768",1.0,1),
        Bank("1155",0.5,0),
        Bank("1155",0.5,1),

    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.first{it.accountNumber = accountNumber }

}