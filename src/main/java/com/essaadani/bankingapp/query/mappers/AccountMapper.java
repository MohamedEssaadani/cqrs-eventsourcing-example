package com.essaadani.bankingapp.query.mappers;

import com.essaadani.bankingapp.query.dto.AccountDTO;
import com.essaadani.bankingapp.query.dto.AccountOperationDTO;
import com.essaadani.bankingapp.query.entities.Account;
import com.essaadani.bankingapp.query.entities.AccountOperation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDTO fromAccount(Account account);
    Account fromAccountDTO(AccountDTO accountDTO);
    AccountOperationDTO fromAccountOperation(AccountOperation accountOperation);

}
